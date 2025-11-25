package org.uob.a2.commands;

import org.uob.a2.gameobjects.*;
import java.util.ArrayList;

public class Quit extends Command 
{
    
    public Quit(){ this.commandType = commandType.QUIT; }

    public CommandType getCommandType() 
    {
        return this.commandType;
    }

    public String execute(GameState gameState) 
    { 
        String invent = "";
        ArrayList<Item> I = gameState.getPlayer().getInventory();
        
        for (Item i : I) 
        {
            invent += i.getName().toLowerCase() + "\n";
        }

        if (invent.isEmpty()) 
        {
            return "Game over: \n Your Inventory is empty.";
        } 
        else 
        {
            return "Game over: \n Your Inventory is \n" + invent;
        }
    }
}
