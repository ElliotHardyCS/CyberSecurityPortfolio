package org.uob.a2.commands;

import java.util.ArrayList;
import org.uob.a2.gameobjects.*;

public class Status extends Command 
{
    private String topic;
    private ArrayList<Item> I;
    private ArrayList<Equipment> E;
    
    public Status(String topic)
    {
        this.topic = topic;
        this.I = new ArrayList<>();
        this.E = new ArrayList<>();
        this.commandType = commandType.STATUS;
    }

    public CommandType getCommandType() 
    {
        return this.commandType;
    }

    public String execute(GameState gameState)
    {
        I = gameState.getPlayer().getInventory();
        E = gameState.getPlayer().getEquipment();

        if(topic.equals("inventory"))
        {
            String s = "Inventory: ";
            for (Item i : I)
            {
                s += i.getName() + " , "; 
            }
            for (Equipment e : E)
            {
                s += e.getName() + " , "; 
            }
            return s;
        }
        //Items
        else if (gameState.getPlayer().hasItem(topic) == true)
        {
            String s = "";
            for (Item item : I) 
            {
                if (item.getName().equals(topic)) 
                {
                    s += item.getDescription() + ", ";
                }
            }
            return s;
        }
        //Equipment
        else if (gameState.getPlayer().hasEquipment(topic) == true)
        {
            String s = "";
            for (Equipment e : E) 
            {
                if (e.getName().equals(topic)) 
                {
                    s += e.getDescription() + " , ";
                }
            }
            return s;
        }
        else if (topic.equals("map"))
        {
            return gameState.getMap().displayMap();
        }
        else if (topic.equals("player"))
        {
            return "Player "+gameState.getPlayer().getName()+" Score: "+gameState.getPlayer().getScore();
        }
        else
        {
            return "";
        }
    }
}
