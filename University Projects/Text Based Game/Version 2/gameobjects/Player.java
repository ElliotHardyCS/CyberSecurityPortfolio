package org.uob.a2.gameobjects;

import java.util.ArrayList;

public class Player 
{
    private String name;
    private int score;
    private int numOfPuzzles;
    private int numOfRooms;
    private ArrayList<Equipment> equip;
    private ArrayList<Item> inventory;

    public Player(String name) 
    {
        this.name = name;
        this.score = 0;
        this.numOfPuzzles = 0;
        this.numOfRooms = 0;
        this.equip = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    //extra features for score
    public void setInitialScore(int Score)
    {
        score = Score;
    }

    public void visitRoom()
    {
        numOfRooms++;
    }

    public void solvePuzzle()
    {
        numOfPuzzles++;
    }

    public int getScore()
    {
        int currentScore = (score - numOfRooms)+(numOfPuzzles*25);
        return currentScore;
    }  

    //normal required features
    public void addEquipment(Equipment equipment) 
    {
        equip.add(equipment);
    }

    public void addItem(Item item) 
    {
        inventory.add(item);
    }

    public void removeItem(String itemName) 
    {
        for (int i = 0; i < inventory.size(); i++) 
        {
            if (inventory.get(i).getName().equals(itemName)) 
            {
                inventory.remove(i);
                break;
            }
        }
    }

    public void removeEquipment(String equipmentName) 
    {
        for (int i = 0; i < equip.size(); i++) 
        {
            if (equip.get(i).getName().equals(equipmentName)) 
            {
                equip.remove(i);
                break;
            }
        }
    }

    public ArrayList<Equipment> getEquipment() 
    {
        return equip;
    }

    public Equipment getEquipment(String equipmentName)
    {
        for (Equipment E : equip) 
        {
            if (E.getName().equals(equipmentName)) 
            {
                return E;
            }
        }
        return null;
    }

    public Equipment getEquipmentByName(String name) 
    {
        for (Equipment e : equip) 
        {
            if (e.getName().equals(name)) 
            {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Item> getInventory() 
    {
        return inventory;
    }

    public Item getItem(String itemName) 
    {
        for (Item item : inventory) 
        {
            if (item.getName().equals(itemName)) 
            {
                return item;
            }
        }
        return null;
    }

    public Item getItemByName(String name) 
    {
        for (Item i : inventory) 
        {
            if (i.getName().equals(name)) 
            {
                return i;
            }
        }
        return null;
    }

    public String getName() 
    {
        return name;
    }

    public boolean hasEquipment(String equipmentName) 
    {
        for (Equipment E : equip) 
        {
            if (E.getName().equals(equipmentName)) 
            {
                return true;
            }
        }
        return false;
    }

    public boolean hasItem(String itemName) 
    {
        for (Item item : inventory) 
        {
            if (item.getName().equals(itemName)) 
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() 
    {
        StringBuilder out = new StringBuilder("Player Name: " + this.name + "\nInventory:\n");
        for (Item i : this.inventory) 
        {
            out.append("- ").append(i.getDescription()).append("\n");
        }
        out.append("Equipment:\n");
        for (Equipment e : this.equip) 
        {
            out.append("- ").append(e.getDescription()).append("\n");
        }
        return out.toString();
    }
}
