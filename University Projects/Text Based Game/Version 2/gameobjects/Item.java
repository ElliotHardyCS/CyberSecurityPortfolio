package org.uob.a2.gameobjects;

public class Item extends GameObject 
{
    public Item(String id, String name, String description, boolean hidden)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
