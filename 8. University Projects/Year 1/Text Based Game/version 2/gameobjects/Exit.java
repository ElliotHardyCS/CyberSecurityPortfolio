package org.uob.a2.gameobjects;

public class Exit extends GameObject 
{   
    private String nextRoom;
    
    public Exit(String id, String name, String description, String nextRoom, boolean hidden)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.nextRoom = nextRoom;
        this.hidden = hidden;
    }

    public String getNextRoom()
    {
        return nextRoom;
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + ", nextRoom=" + nextRoom;
    }
}
