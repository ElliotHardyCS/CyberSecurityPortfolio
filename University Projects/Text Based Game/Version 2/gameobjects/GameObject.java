package org.uob.a2.gameobjects;

public abstract class GameObject 
{
    protected String id;
    protected String name;
    protected String description;
    protected boolean hidden;

    public GameObject(){}

    public GameObject(String id, String name, String description, boolean hidden)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hidden = hidden;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean getHidden()
    {
        return hidden;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setDescription(String Description)
    {
        description = Description;
    }

    public void setHidden(boolean Hidden)
    {
        hidden = Hidden;
    }

    public void setName(String Name)
    {
        name = Name;
    }

    public String toString() {
        return "GameObject {" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", hidden=" + hidden +
               '}';
    }
}
