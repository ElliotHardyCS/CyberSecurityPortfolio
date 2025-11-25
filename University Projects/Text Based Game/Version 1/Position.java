package org.uob.a1;

public class Position 
{
    public int x;
    public int y;

    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void updateX()
    {
        x = x + 2;
    }

    public void updateY()
    {
        y = y + 2;
    }

}
