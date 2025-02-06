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

    public Room(String name, String description, char symbol, Position position)
    {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.position = position;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }
    
    public char getSymbol()
    {
        return symbol;
    }
    
    public Position getPosition()
    {
        return position;
    }

    public void setNorth(Room north) 
    {
        this.north = north;
    }

    public void setSouth(Room south) 
    {
        this.south = south;
    }

    public void setEast(Room east) 
    {
        this.east = east;
    }

    public void setWest(Room west) 
    {
        this.west = west;
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