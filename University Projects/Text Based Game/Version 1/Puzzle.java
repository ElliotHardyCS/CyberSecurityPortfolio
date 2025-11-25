package org.uob.a1;

public class Puzzle
{

    private String puzzleTxt;
    private String puzzleAns;
    private Room room;
    private String input;
    private Item item;
    
    //constructor
    public Puzzle(String puzzleTxt, String puzzleAns, String input, Room Room)
    {
        this.puzzleTxt = puzzleTxt;
        this.puzzleAns = puzzleAns;
        this.room = Room;
    }

    //display puzzle
    public String display()
    {
        String displayTxt = puzzleTxt;
        return displayTxt;
    }

    //validate puzzle
    public boolean validate(String input)
    {
        return input.equals(puzzleAns);
    }
}
