package org.uob.a2.gameobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.nio.file.*;
import org.uob.a2.utils.*;


public class Map 
{
    private ArrayList<Room> rooms;
    private ArrayList<HashMap<Integer, String>> Map;
    private String currentRoom;
    
    public Map()
    {
        this.rooms = new ArrayList<>();
        this.currentRoom = "";
        this.Map = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            HashMap<Integer, String> columns = new HashMap<>();
            for(int j = 0; j < 10; j++)
            {
                columns.put(j, "* ");
            }
            Map.add(columns);
        }
    }

    public ArrayList<Room> getRooms()
    {
        return rooms;
    }

    //extra features
    public String displayMap()
    {
        String oMap = "";
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                oMap = oMap + Map.get(i).get(j) + " ";
            }
            oMap = oMap + "\n";
        }
        return oMap;
    }

    public void addRoomToMap(int x, int y, String roomId)
    {
        Map.get(x).put(y, roomId);
    }

    //standard features
    public void addRoom(Room room)
    {
        rooms.add(room);
    }

    public Room getCurrentRoom()
    {
        for (Room r : rooms)
        {
            if (r.getId().equals(currentRoom))
            {
                return r;
            }
        }
        return null;
    }

    public void setCurrentRoom(String roomId)
    {
        for (Room r : rooms)
        {
            if (r.getId().equals(roomId))
            {
                this.currentRoom = r.getId();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("Map:\n");
        for (Room r : this.rooms) {
            out.append(r.toString()).append("\n");
        }
        return out.toString();
    }
}

