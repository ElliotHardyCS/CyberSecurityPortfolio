package org.uob.a2.commands;

import org.uob.a2.gameobjects.*;

public class Use extends Command 
{
    private String equipmentName;
    private String target;

    public Use(String equipmentName, String target) 
    {
        this.equipmentName = equipmentName;
        this.target = target;
        this.commandType = CommandType.USE;
    }

    public CommandType getCommandType() 
    {
        return this.commandType;
    }

    public String execute (GameState gameState)
    { 
        Player p = gameState.getPlayer();
        if (!p.hasEquipment(equipmentName)) 
        {
            return "You do not have " + equipmentName;
        }
    
        Equipment e = p.getEquipment(equipmentName);
        if (e.getUseInformation().isUsed()) 
        {
            return "You have already used " + equipmentName;
        }
    
        Room tR = gameState.getMap().getCurrentRoom();
        GameObject uT;
    
        if (tR.hasItem(target)) 
        {
            uT = tR.getItemByName(target);
        } 
        else if (tR.hasFeature(target)) 
        {
            uT = tR.getFeatureByName(target);
        } 
        else if (tR.getName().equals(target)) 
        {
            uT = tR;
        } 
        else 
        {
            return "Invalid use target";
        }
    
        String result = e.use(uT, gameState);
    
        if (result.equals(e.getUseInformation().getMessage())) 
        {
            e.getUseInformation().setUsed(true);
        }
    
        return result;
    }

    public String toString() 
    {
        return equipmentName + " on " + target;
    }
}