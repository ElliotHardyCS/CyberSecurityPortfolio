package org.uob.a1;

public class Item 
{
    private String itemName;
    private String itemDescription;
    private Room room;

    public Item(String itemName, String itemDescription, Room room)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.room = room;
    }

    public String getItemDescription()
    {
        return itemDescription;
    }

    public String getName()
    {
        return itemName;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }
}