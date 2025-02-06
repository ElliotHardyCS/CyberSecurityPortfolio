package org.uob.a1;

public class Door
{
    private Room room;
    private String input;
    private Inventory inventory;
    private String doorTxt;
    private Item item;
    
    //constcutor
    public Door(String doorTxt, String input, Room Room, Inventory inventory)
    {
        this.doorTxt = doorTxt;
        this.inventory = inventory;
        this.room = Room;
    }
    
    //display puzzle
    public String display()
    {
        String displayTxt = doorTxt;
        return displayTxt;
    }

    //validate door
    public boolean validateDoor(String input)
    {
        return inventory.hasItem(input) > -1;
    }
    
}