

public class Inventory 
{ 
    final int MAX_ITEMS = 10;
    private int numOfItems;
    private String[] inventory;

    public Inventory()
    {
        this.numOfItems = 0;
        this.inventory = new String[MAX_ITEMS];
    }

    public void addItem(String item)
    {
        inventory[numOfItems] = item;
        numOfItems++;
    }

    public int hasItem(String item)
    {
        for (int i = 0; i < numOfItems; i++)
        {
            if (inventory[i] == item)
            {
                return i;
            }
        }
        return -1;
    }

    public void removeItem(String item)
    {
        if (numOfItems > 0);
        {
            if (hasItem(item) != -1)
            {
                int x = hasItem(item);
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