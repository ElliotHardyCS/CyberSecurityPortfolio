package org.uob.a2.utils;

import java.io.*;
import java.util.ArrayList;
import org.uob.a2.gameobjects.*;

public class GameStateFileParser 
{
    private static Map map;
    private static Player player;
    private static String currentRoom;

    public GameStateFileParser() 
    {
        this.player = null;
        this.map = null;
        this.currentRoom = null;
    }

    public static GameState parse(String filename) 
    {
        ArrayList<Room> roomList = new ArrayList<>();
        ArrayList<Item> itemList = new ArrayList<>();
        ArrayList<Equipment> equipmentList = new ArrayList<>();
        ArrayList<Exit> exitList = new ArrayList<>();
        ArrayList<UseInformation> useInfoList = new ArrayList<>();
        ArrayList<Feature> featureList = new ArrayList<>();
        ArrayList<Container> containerList = new ArrayList<>();

        BufferedReader bR = null;
        try 
        {
            bR = new BufferedReader(new FileReader(filename));
            String line;

            Loop1 : while ((line = bR.readLine()) != null)
            {
                String[] lineParts = line.split(":");
                if (lineParts.length < 2) 
                {
                    continue;
                }

                if (line.contains("player")) 
                {
                    player = new Player(lineParts[1].trim());
                } 
                else if (line.contains("map")) 
                {
                    String mapLine;
                    String roomLine;
                    boolean validData = true;
                    map = new Map();
                    currentRoom = lineParts[1].trim();
                    roomLine = "";
                    mapLine = bR.readLine();
                    Loop2 : while (mapLine != null && roomLine != null && validData) 
                    {
                        String[] parts = mapLine.split(":");
                        
                        if (parts[0].contains("room")) 
                        {   
                            String[] roomParts = parts[1].split(",");
                            if (roomParts.length >= 4) 
                            {
                                Room room = new Room(roomParts[0].trim(), roomParts[1].trim(), roomParts.length > 2 ? roomParts[2].trim() : "", roomParts.length > 3 && Boolean.parseBoolean(roomParts[3].trim()));
                                roomList.add(room);

                                //DEBUG
                                //System.out.println(room.getName());
                                
                                roomLine = bR.readLine();
                                Loop3 : while (roomLine != null && validData)
                                {
                                    String[] itemLine = roomLine.split(":");
                                    if (itemLine.length < 2) 
                                    {
                                        roomLine = bR.readLine();
                                        continue;
                                    }
                                    
                                    String[] itemParts = itemLine[1].split(",");
                                    
                                    if (itemLine[0].contains("item") && itemParts.length >= 4) 
                                    {
                                        Item item = new Item(itemParts[0].trim(), itemParts[1].trim(), 
                                        itemParts[2].trim(), Boolean.parseBoolean(itemParts[3]));
                                        itemList.add(item);
                                        room.addItem(item);
                                    } 
                                    else if (itemLine[0].contains("equipment"))
                                    {
                                        if (itemParts.length >= 9) 
                                        {
                                        Equipment equipment = new Equipment(itemParts[0].trim(), itemParts[1].trim(), itemParts[2].trim(), Boolean.parseBoolean(itemParts[3]), new UseInformation(Boolean.parseBoolean(itemParts[4]), itemParts[5].trim(), itemParts[6].trim(), itemParts[7].trim(), itemParts[8].trim()));
                                        useInfoList.add(new UseInformation(Boolean.parseBoolean(itemParts[4]), itemParts[5].trim(), itemParts[6].trim(), itemParts[7].trim(), itemParts[8].trim()));
                                        equipmentList.add(equipment);
                                        room.addEquipment(equipment);
                                        } 
                                        else
                                        {
                                            //System.out.println("ERROR: Invalid Data For Item: " + itemLine[0] + " wrong number of arguments in file " + itemParts.length + " expected 9.");
                                        }
                                    }
                                    else if (itemLine[0].contains("container") && itemParts.length >= 4) 
                                    {
                                        Container container = new Container(itemParts[0].trim(), itemParts[1].trim(), itemParts[2].trim(), Boolean.parseBoolean(itemParts[3]));
                                        containerList.add(container);
                                        room.addFeature(container);
                                    } 
                                    else if (itemLine[0].contains("feature") && itemParts.length >= 4) 
                                    {
                                        Feature feature = new Feature(itemParts[0].trim(), itemParts[1].trim(), itemParts[2].trim(), Boolean.parseBoolean(itemParts[3]));
                                        featureList.add(feature);
                                        room.addFeature(feature);
                                    } 
                                    else if (itemLine[0].contains("exit") && itemParts.length >= 5) 
                                    {
                                        Exit exit = new Exit(itemParts[0].trim(), itemParts[1].trim(), itemParts[2].trim(), itemParts[3].trim(), Boolean.parseBoolean(itemParts[4]));
                                        exitList.add(exit);
                                        room.addExit(exit);
                                    }
                                    else if (itemLine[0].contains("room")) 
                                    {
                                        mapLine = roomLine;
                                        break;
                                    }
                                    else
                                    {
                                        validData = false;
                                    }
                                    roomLine = bR.readLine();
                                }
                                map.addRoom(room);
                            }
                        } 
                        else 
                        {
                            validData = false;
                            break;
                        }
                    }
                    map.setCurrentRoom(currentRoom);
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.err.println("Error: File not found - " + filename);
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            System.err.println("Error reading the file - " + filename);
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (bR != null) 
                {
                    bR.close();
                }
            } 
            catch (IOException e) 
            {
                System.err.println("Error closing the BufferedReader");
                e.printStackTrace();
            }
        }
        return new GameState(map, player);
    }
}