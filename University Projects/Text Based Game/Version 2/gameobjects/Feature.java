package org.uob.a2.gameobjects;

public class Feature extends GameObject
{
    public Feature (){};
    
    public Feature(String id, String name, String description, boolean hidden)
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
