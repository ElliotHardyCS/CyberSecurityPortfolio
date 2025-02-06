package org.uob.a1;

public class Map 
{ 
    private int width;
    private int height;
    private char[] [] map;
    final private char EMPTY = '.';

    public Map(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.map = new char[width] [height];
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                map[x][y] = EMPTY;
            }
        }
    }

    public void placeRoom(Position pos, char symbol)
    {
        int x = pos.x;
        int y = pos.y;
        map[x][y] = symbol;
    }

    public String display()
    {
        String displayMap = new String(); 
        
        for (int row = 0; row < height; row++) 
        {
            for (int col = 0; col < width; col++) 
            {
                displayMap = displayMap + (map[col][row]);
            }
            displayMap = displayMap + "\n";
        }

        return displayMap;
    }
}