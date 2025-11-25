package org.uob.a1;

import java.util.Scanner; 

public class Game
{
    
    public static void main(String[] args) 
    {
        //display instructions
        System.out.println("--------------------------Welcome to My Game-------------------------- \n The commands you can use at any point throughout the game are: \n -move <direction (NESW)> - allows you to move into a new room. \n -look - Displays a description of the room the player is in. \n -look <feature> - Displays a more detailed description of a feature of a room. \n -look <item> - Displays a description of an item. \n -search chest - looks through a chest and gives you the item inside it. \n -inventory - Displays a list of all items the player has obtained. \n -score - Displays the user's current score. \n -map - Displays a text-based map of the current explored game world. \n -help - Displays a help message. \n -quit - Quits the game. \n");
        
        //Start output
        System.out.println(" -You are now in the Staring Clearning you can look around or move east");

        //starting the game
        Main game = new Main();
        game.play();
    }  
}
