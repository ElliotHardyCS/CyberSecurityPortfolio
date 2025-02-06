package org.uob.a2;

import java.util.Scanner;
import java.util.ArrayList;
import org.uob.a2.commands.*;
import org.uob.a2.gameobjects.*;
import org.uob.a2.parser.*;
import org.uob.a2.utils.*;

public class Game 
{
    public static Scanner inputDevice;
    public static Tokeniser TKZ;
    public static Parser PRS;
    public static ArrayList<Token> tokens;
    public static boolean go;
    public static GameState gameState;

    public static void main(String[] args)
    {
        //calling setup and start to be able to play the game
        setup();
        start();
    }
    
    public static void setup()
    {
        //try loop for setting up the game.
        try
        {
            //initiating all "devices" which allow the game to be played
            inputDevice = new Scanner(System.in);
            TKZ = new Tokeniser();
            PRS = new Parser();
            tokens = new ArrayList<Token>();
            go = true;
        }
        catch
        {
            System.out.println("Could not setup the game");
        }
    }
    
    public static void start()
    {
        //try loop for creating game state
        try
        {
            gameState = GameStateFileParser.parse("./data/game.txt");

            //try loop for initialising game
            try
            {
                //creating objects for easier use later in the file
                Map map = gameState.getMap();
                Player player = gameState.getPlayer();
                ArrayList<Room> r = map.getRooms();
                    
                //adding Rooms to display Map
                map.addRoomToMap(4, 8, r.get(0).getId());
                map.addRoomToMap(1, 8, r.get(1).getId());
                map.addRoomToMap(8, 8, r.get(2).getId());
                map.addRoomToMap(1, 5, r.get(3).getId());
                map.addRoomToMap(4, 5, r.get(4).getId());
                map.addRoomToMap(8, 5, r.get(5).getId());
                map.addRoomToMap(1, 3, r.get(6).getId());
                map.addRoomToMap(4, 3, r.get(7).getId());
                map.addRoomToMap(8, 3, r.get(8).getId());
                map.addRoomToMap(6, 1, "r0");
                map.addRoomToMap(2, 1, " + ");
                map.addRoomToMap(1, 1, "N ");
                map.addRoomToMap(3, 1, "S ");
                map.addRoomToMap(2, 2, "E ");
                map.addRoomToMap(2, 0, "W");

                //intialising player score
                player.setInitialScore(100);

                //intitial output to explain how to use the game
                System.out.println("\n\n>>>Welcome to the game!\n The commands you can use are: \n- MOVE (move <direction> (NSEW)).\n- USE (use <item> or <equipment>).\n- COMBINE (combine <item1> with <item2>).\n- GET (get <item> or <equipment>).\n- DROP (drop <item> or <equipment>).\n- LOOK (look).\n- STATUS (status <player> or status).\n- HELP (help <topic (one of these commands)>).\n- QUIT (quit). \n\n");

                //intitial output of the map to show the player where to go
                System.out.println(map.displayMap());

                //setting intial input
                String input = "";

                //main game loop
                mainLoop : while (go)
                {
                    System.out.println("--====================--\n >>> Enter a command.");
                    Room currentRoom = map.getCurrentRoom();
                    
                    //extra feature questions.
                    if(map.getCurrentRoom().getName() == r.get(3).getName() && r.get(3).getVisited() == false)
                    {
                        r.get(3).getExitByName("south").setHidden(true);
                        r.get(3).getExitByName("east").setHidden(true);
                        r.get(3).getExitByName("west").setHidden(true);
                        Command quit = new Quit();
                        String answer = "";

                        //aking question which will not let you move untill answered.
                        while (!answer.equals("a"))
                        {
                            System.out.println(">>>An asteroid is on a collsion course with the ship what do you do?:\n   >A: Use the ships weapons system to destroy the asteroid.\n   >B: Run to the bridge and attempt to stear the ship out of the way.\n   >C: Run to the bedroom and Pray");
                            answer = inputDevice.nextLine().toLowerCase();
                            
                            if (answer.equals("b"))
                            {
                                System.out.println("You got to the bridge in time but were to slow at steering and the whole left hand side of the ship was destroyed.\n\n "+quit.execute(gameState));
                                break mainLoop;
                            }
                            
                            if (answer.equals("c"))
                            {
                                System.out.println("You were killed as the asteroid hit the ship head on.\n\n "+quit.execute(gameState));
                                break mainLoop;
                            }
                        }
                        if (answer.equals("a"))
                        {
                            System.out.println("Correct! You  may continue");
                            r.get(3).getExitByName("south").setHidden(false);
                            r.get(3).getExitByName("east").setHidden(false);
                            r.get(3).getExitByName("west").setHidden(false);
                            r.get(3).setVisited(true);
                        }
                    }

                    //extra feature 2.
                    if(map.getCurrentRoom().getName() == r.get(6).getName() && r.get(6).getVisited() == false)
                    {
                        r.get(6).getExitByName("south").setHidden(true);
                        r.get(6).getExitByName("east").setHidden(true);
                        r.get(6).getExitByName("west").setHidden(true);
                        String answer = "";
                        while (!answer.equals("alan turing"))
                        {
                            System.out.println(">>>What is the Name of the father of Computer Science: \n");
                            answer = inputDevice.nextLine().toLowerCase();
                        }
                        System.out.println("Correct! You  may continue");
                        r.get(6).getExitByName("south").setHidden(false);
                        r.get(6).getExitByName("east").setHidden(false);
                        r.get(6).getExitByName("west").setHidden(false);
                        r.get(6).setVisited(true);
                    }

                    //unhiding the bridge room if they have keycard, it has been used and the electricity has been turned on 
                    if (player.hasEquipment("keycard") == true && player.getEquipmentByName("wires").getUseInformation().isUsed())
                    {
                        r.get(0).setHidden(false);
                        r.get(1).getExitByName("south").setHidden(false);
                        r.get(2).getExitByName("north").setHidden(false);
                        System.out.println("Doors to the bridge is unlocked");
                    }

                    //taking in input, tokenisisng and parsing the the input to execute them 
                    TKZ = new Tokeniser();
                    PRS = new Parser();
                    input = inputDevice.nextLine();
                    input = TKZ.sanitise(input);
                    TKZ.tokenise(input);
                    tokens = TKZ.getTokens();

                    //try loop for parsing the tokens
                    try
                    {
                        //parsing the tokens after bieng tokenised.
                        Command C = PRS.parse(tokens);
                        turn(C);
                    }
                    catch(Exception e0)
                    {
                        System.out.println("Cannot parse the tokens to commands");
                    }
                }
            }
            catch (Exception e0)
            {
                System.out.println("Error in intialising game or intialising input");
            }
        }
        catch (Exception e1)
        {
            System.out.println("Error in creating a game state");
        }
    }
    
    public static void turn(Command command)
    {  
        //try loop for executing the command
        try
        {
            //setting boolean false if the command is quit to break out the loop and end the program.
            if (command.commandType.equals(CommandType.QUIT))
            {
                go = false;
            }

            //outputting the command after bieng executed.
            System.out.println(command.execute(gameState)); 
            
        }
        catch(Exception e1)
        {
            System.out.println("Cannot execute the command");
        }
    }
    
}