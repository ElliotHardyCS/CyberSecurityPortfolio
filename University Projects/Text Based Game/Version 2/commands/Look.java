package org.uob.a2.commands;

import org.uob.a2.gameobjects.*;

public class Look extends Command 
{
    private String target;

    public Look(String target) 
    {
        this.target = target;
        this.commandType = commandType.LOOK;
    }

    public CommandType getCommandType() 
    {
        return this.commandType;
    }

    public String execute(GameState gameState) 
    {
        String help = "";
        String s = "";
        if (target.contains("room") || target == null) 
        {
            if (gameState.getMap().getCurrentRoom().getHidden()) 
            {
                return "";
            }
            s = gameState.getMap().getCurrentRoom().getDescription() + ", ";
            for (Item i : gameState.getMap().getCurrentRoom().getItems()) 
            {
                if (!i.getHidden()) 
                {
                    s += i.getDescription() + ", ";
                }
            }
            for (Equipment e : gameState.getMap().getCurrentRoom().getEquipments()) 
            {
                if (!e.getHidden()) 
                {
                    s += e.getDescription() + ", ";
                }
            }
            return s.isEmpty() ? "" : s.substring(0, s.length() - 2);
        } 
        else if (target.contains("exits")) 
        {
            s = "The available exits are:";
            for (Exit e : gameState.getMap().getCurrentRoom().getExits()) 
            {
                if (!e.getHidden()) 
                {
                    s += " " + e.getDescription() + " , ";
                }
            }
            return s.isEmpty() ? "" : s.substring(0, s.length() - 2);
        } 
        else if (target.contains("features")) 
        {
            s = "You also see:";
            for (Feature f : gameState.getMap().getCurrentRoom().getFeatures()) 
            {
                if (!f.getHidden()) 
                {
                    s += " " + f.getDescription() + " , ";
                }
            }
            return s.isEmpty() ? "" : s.substring(0, s.length() - 2);
        } 
        else if (gameState.getMap().getCurrentRoom().hasEquipment(target)) 
        {
            Equipment equipment = gameState.getMap().getCurrentRoom().getEquipmentByName(target);
            if (equipment == null || equipment.getHidden()) 
            {
                return "";
            }
            return equipment.getDescription();
        } 
        else if (gameState.getMap().getCurrentRoom().hasItem(target)) 
        {
            Item item = gameState.getMap().getCurrentRoom().getItemByName(target);
            if (item == null || item.getHidden()) 
            {
                return "";
            }
            return item.getDescription();
        }
        return s;
    }

    public String toString() 
    {
        return "Player wants to look at: " + target;
    }
}
