package org.uob.a1;

public class Inventory 
{ 
    final int MAX_ITEMS = 10;
    private int numOfItems;
    private String[] inventory;
    private Item item;
    private String input;

    public Inventory()
    {
        this.numOfItems = 0;
        this.inventory = new String[MAX_ITEMS];
        this.item = item;
        this.input = input;

    }
    
    public void addItem(String input)
    {
        inventory[numOfItems] = input;
        numOfItems++;
    }

    public int hasItem(String input) 
    {
        for (int i = 0; i < numOfItems; i++) 
        {
            if (inventory[i] == input) 
            {
                return i;
            }
        }
        return -1;
    }

    public void removeItem(String input)
    {
        if (numOfItems > 0);
        {
            if (hasItem(input) != -1)
            {
                int x = hasItem(input);
                inventory[x] = null;
                numOfItems--;
            }
        }
    }

    public String displayInventory()
    {
        String display = "";
        for (int i = 0; i < MAX_ITEMS; i++)
        {
            if (inventory[i] != null)
            {
                display = display + inventory[i] + " ";
            }
        }
        return display;
    }   
}