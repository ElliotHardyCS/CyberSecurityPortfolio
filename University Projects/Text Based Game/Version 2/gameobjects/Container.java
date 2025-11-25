package org.uob.a2.gameobjects;

public class Container extends Feature 
{
    
    public Container(String id, String name, String description, boolean hidden)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hidden = hidden;
    }

    public String getName()
    {
        return name;
    }
    
    @Override
    public String toString() 
    {
        return "Container {" +"id='" + getId() + '\'' +", name='" + getName() + '\'' +", description='" + getDescription() + '\'' +", hidden=" + getHidden() +'}'; 
    }
}
