package org.uob.a1;

public class Room 
{
    private String name;
    private String description;
    private char symbol;
    private Position position;
    private Room north;
    private Room east;
    private Room south;
    private Room west;
    private Item item;
    private Feature feature;
    private String itemName;


    //constructor
    public Room(String name, String description, char symbol, Position position)
    {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.position = position;
        this.item = null;
        this.feature = null;
        this.east = null;
    }

    //getName
    public String getName()
    {
        return name;
    }

    //get Description
    public String getDescription()
    {
        return description;
    }

    //get Symbol
    public char getSymbol()
    {
        return symbol;
    }

    //get Position
    public Position getPosition()
    {
        return position;
    }

    //add item to room
    public void setItem(Item item)
    {
        this.item = item;
        if (item != null) 
        {
            item.setRoom(this);
        }
    }

    //add feature to room
    public void setFeature(Feature feature)
    {
        this.feature = feature;
        if (feature != null) 
        {
            feature.setRoom(this);
        }
    }
    
    public void setNorth(Room room) 
    {
        this.north = room;
    }

    public void setSouth(Room room) 
    {
        this.south = room;
    }

    public void setEast(Room room) 
    {
        this.east = room;
    }

    public void setWest(Room room) 
    {
        this.west = room;
    }

    public Room getNorth() 
    {
        return north;
    }

    public Room getSouth() 
    {
        return south;
    }

    public Room getEast() 
    {
        return east;
    }

    public Room getWest() 
    {
        return west;
    }    
}