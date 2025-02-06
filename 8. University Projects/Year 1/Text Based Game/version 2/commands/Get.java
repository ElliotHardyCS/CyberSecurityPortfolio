package org.uob.a2.commands;

import org.uob.a2.gameobjects.*;

public class Get extends Command 
{
    private String item;

    public Get(String item) 
    {
        this.item = item;
        this.commandType = CommandType.GET;
    }

    public CommandType getCommandType() 
    {
        return this.commandType;
    }

    @Override
    public String execute(GameState gameState) 
    {
        if (!gameState.getPlayer().hasItem(item) && !gameState.getPlayer().hasEquipment(item)) 
        {
            if (gameState.getMap().getCurrentRoom().hasItem(item)) 
            {
                gameState.getPlayer().addItem(gameState.getMap().getCurrentRoom().getItemByName(item));
                gameState.getMap().getCurrentRoom().getItems().remove(gameState.getMap().getCurrentRoom().getItemByName(item));
                return "You pick up: " + item;
            }
            else if (gameState.getMap().getCurrentRoom().hasEquipment(item))
            { 
                gameState.getPlayer().addEquipment(gameState.getMap().getCurrentRoom().getEquipmentByName(item));
                gameState.getMap().getCurrentRoom().getEquipments().remove(gameState.getMap().getCurrentRoom().getEquipmentByName(item));
                return "You pick up: " + item;
            }
            else 
            {
            return "No " + item + " to get."; 
            }
        }
        else
        {
            return "You already have " + item;
        }
        
    }
    
    @Override
    public String toString() 
    {
        return "Player wants to get " + item;
    }
}
