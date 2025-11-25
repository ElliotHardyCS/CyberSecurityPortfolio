package org.uob.a2.commands;

import org.uob.a2.gameobjects.*;

public class Drop extends Command 
{
    private String item;

    public Drop(String item) 
    {
        this.item = item;
        this.commandType = commandType.DROP;
    }

    public CommandType getCommandType() 
    {
        return this.commandType;
    }

    public String execute(GameState gameState) 
    {
        Player player = gameState.getPlayer();
        Room currentRoom = gameState.getMap().getCurrentRoom();

        if (!player.hasItem(item) && !player.hasEquipment(item)) 
        {
            return "You cannot drop " + item;
        }

        if (player.hasEquipment(item)) 
        {
            Equipment equipment = player.getEquipmentByName(item);
            if (equipment != null) 
            {
                player.removeEquipment(item);
                currentRoom.addEquipment(equipment);
                return "You drop: " + item;
            }
        }

        if (player.hasItem(item)) 
        {
            Item droppedItem = player.getItemByName(item);
            if (droppedItem != null) 
            {
                player.removeItem(item);
                currentRoom.addItem(droppedItem);
                return "You drop: " + item;
            }
        }
        return "You cannot drop " + item;
    }

    public String toString() 
    {
        return "Player wants to drop: " + item;
    }
}
