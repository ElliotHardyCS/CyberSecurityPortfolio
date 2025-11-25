package org.uob.a2.commands;

import org.uob.a2.gameobjects.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Move extends Command 
{
    private String direction;

    public Move(String direction) 
    {
        this.direction = direction;
        this.commandType = commandType.MOVE;
    }

    public CommandType getCommandType() 
    {
        return this.commandType;
    }

    public String execute(GameState gameState) 
    {

        if (gameState.getMap().getCurrentRoom().hasExit(direction)) 
        {
            Exit exit = gameState.getMap().getCurrentRoom().getExitByName(direction);

            if (exit.getHidden()) 
            {
                return "No exit found in that direction.";
            }
            else
            {
                String nextRoomId = exit.getNextRoom();
                
                gameState.getMap().setCurrentRoom(nextRoomId);
                ArrayList<Room> r = gameState.getMap().getRooms();
                Scanner inputDevice = new Scanner(System.in);
                
                //extra feature questions.
                /*if(gameState.getMap().getCurrentRoom().getName() == r.get(3).getName() && r.get(3).getVisited() == false)
                {
                    r.get(3).getExitByName("south").setHidden(true);
                    r.get(3).getExitByName("east").setHidden(true);
                    r.get(3).getExitByName("west").setHidden(true);
                    Command quit = new Quit();
                    String answer = "";
                    
                    while (!answer.equals("a"))
                    {
                        System.out.println(">>>An asteroid is on a collsion course with the ship what do you do?:\n   >A: Use the ships weapons system to destroy the asteroid.\n   >B: Run to the bridge and attempt to stear the ship out of the way.\n   >C: Run to the bedroom and Pray");
                        answer = inputDevice.nextLine().toLowerCase();
                        if (answer.equals("b"))
                        {
                            System.out.println("You got to the bridge in time but were to slow at steering and the whole left hand side of the ship was destroyed.\n\n "+quit.execute(gameState));
                        }
                        else
                        {
                            System.out.println("You were killed as the asteroid hit the ship head on.\n\n "+quit.execute(gameState));
                        }
                    }
                    System.out.println("Correct! You  may continue");
                    r.get(3).getExitByName("south").setHidden(false);
                    r.get(3).getExitByName("east").setHidden(false);
                    r.get(3).getExitByName("west").setHidden(false);
                    r.get(3).setVisited(true);
                }
                
                if(gameState.getMap().getCurrentRoom().getName() == r.get(6).getName() && r.get(6).getVisited() == false)
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
                */
                return "Moving towards " + direction + "\n";
            }
        }
        else
        {
            return "No exit found in that direction.";
        }
    }

    public String toString() 
    {
        return "Player wants to move in the direction " + direction;
    }
}
