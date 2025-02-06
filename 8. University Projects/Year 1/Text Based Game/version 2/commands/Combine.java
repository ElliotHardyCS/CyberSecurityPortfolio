package org.uob.a2.commands;

import org.uob.a2.gameobjects.*;
import java.util.HashMap;

public class Combine extends Command
{
    private static HashMap<String, Item> c1;
    private static HashMap<String, HashMap<String, Item>> c2;
    private String I1;
    private String I2;
    private Item cItem;

    //setup of the actual command COMBINE
    public Combine(String I1, String I2)
    {
        this.c1 = new HashMap<>();
        this.c2 = new HashMap<>();
        this.I1 = I1;
        this.I2 = I2;
        this.cItem = null;
        this.commandType = commandType.COMBINE;
    }

    //adding a combineable item to the hashmaps
    public void addCItem(String i1, String i2, Item cItem)
    {
        I1 = i1;
        I2 = i2;
        cItem = cItem;
        c1.put(i2, cItem);
        c2.put(i1, c1);
    }

    //execution of the combine command
    public String execute(GameState gameState)
    {
        //checking the player has the items
        if (gameState.getPlayer().hasItem(I1) == false || gameState.getPlayer().hasItem(I2) == false)
        {
            return "You do not have one or either of the items";
        }
        else if (gameState.getPlayer().hasItem(I1) == true || gameState.getPlayer().hasItem(I2) == true)
        {
            gameState.getPlayer().removeItem(I1);
            gameState.getPlayer().removeItem(I2);
            gameState.getPlayer().addItem(cItem);
            return "Successfully combined "+I1+" and "+I2+" to create "+cItem.getName();
        }
        else
        {
            return "These items cannot be combined";
        }
    }
}