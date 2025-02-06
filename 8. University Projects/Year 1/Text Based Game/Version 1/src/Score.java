package org.uob.a1;

public class Score 
{
    private int startingScore;
    private int currentScore;
    private int numOfPuzzles;
    private int numOfRooms;
    private final int PUZZLE_VALUE = 10;

    public Score(int startingScore) 
    {
        this.startingScore = startingScore;
        this.numOfPuzzles = 0;
        this.numOfRooms = 0;
    }

    public void visitRoom()
    {
        numOfRooms++;
    }

    public void solvePuzzle()
    {
        numOfPuzzles++;
    }

    public double getScore()
    {
        currentScore = (startingScore - numOfRooms)+(numOfPuzzles*PUZZLE_VALUE);
        return currentScore;
    }   
        
}