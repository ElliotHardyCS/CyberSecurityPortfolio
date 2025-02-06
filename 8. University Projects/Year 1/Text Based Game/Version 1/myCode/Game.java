package org.uob.a1;

import java.util.Scanner; 

public class Game {
    
    public static void main(String[] args) 
    {
        
        //Initialising the rooms.
        Position P0 = new Position(1,7);
        Room R0 = new Room("Starting Clearing", "A dusty clearing sourrounded by tall dark pine trees,", 'S', P0);
        Position P1 = new Position(3,1);
        Room R1 = new Room("Tree House", "An tall oak tree with a hanging ladder in the corner,", 'T', P1);
        Position P2 = new Position(3,3);
        Room R2 = new Room("Old Ruins", "A ruined cobblestone tavern overgrown with vines and bushes,", 'R', P2);
        Position P3 = new Position(3,5);
        Room R3 = new Room("Oak Forest", "An tall oak tree forest,", 'F', P3);
        Position P4 = new Position(3,7);
        Room R4 = new Room("Main clearing", "A dusty clearing sourrounded by tall dark pine trees with a chest in the clearing,", 'C', P4);
        Position P5 = new Position(3,9);
        Room R5 = new Room("Dirt Path", "An old dirt path leading toward a cabin,", 'D', P5);
        Position P6 = new Position(5,3);
        Room R6 = new Room("Abandoned Cottage", "A beautiful abandoned cottage with a thatch roof,", 'A', P6);
        Position P7 = new Position(5,5);
        Room R7 = new Room("Talking Tree", "A huge talking tree in the centre of a deep dark forest,", 'T', P7);
        Position P8 = new Position(5,7);
        Room R8 = new Room("Empty Camp", "A deserted ork camp with all their tents left,", 'E', P8);
        Position P9 = new Position(5,9);
        Room R9 = new Room("Cabin", "An ornate cabin with smoke rising from the chimney,", 'C', P9);
        Position P10 = new Position(7,5);
        Room R10 = new Room("Old Market", "An old ruined market with only a few stalls remaining,.", 'O', P10);
        Position P11 = new Position(7,7);
        Room R11 = new Room("Swamp", "A deep boggy swamp, bubbling over with trees growing throughout,", 'S', P11);
        Position P12 = new Position(9,7);
        Room R12 = new Room("Portal", "A room with a bush in the corner and a unlit portal in the back,", 'P', P12);
        Position P13 = new Position(11, 7);
        Room R13 = new Room("Finish", "A vast white expanse with solid gold draped everywhere", 'E', P13);

        //linking rooms
        //R0
        R0.setEast(R4);
        
        //R1
        R1.setEast(R10);
        R1.setSouth(R2);

        //R2
        R2.setNorth(R1);
        R2.setSouth(R3);
        R2.setEast(R6);
        
        //R3
        R3.setNorth(R2);
        R3.setEast(R7);
        R3.setSouth(R4);
        
        //R4
        R4.setNorth(R3);
        R4.setEast(R8);
        R4.setSouth(R5);
        
        //R5
        R5.setEast(R9);
        R5.setNorth(R4);
        
        //R6
        R6.setWest(R2);
        R6.setEast(R10);
        R6.setSouth(R7);
        
        //R7
        R7.setNorth(R6);
        R7.setEast(R10);
        R7.setSouth(R8);
        R7.setWest(R3);
        
        //R8
        R8.setNorth(R7);
        R8.setEast(R11);
        R8.setSouth(R9);
        R8.setWest(R4);
        
        //R9
        R9.setNorth(R8);
        R9.setEast(R12);
        R9.setWest(R5);
        
        //R10
        R10.setNorth(R1);
        R10.setEast(R12);
        R10.setSouth(R11);
        R10.setWest(R7);
        
        //R11
        R11.setNorth(R10);
        R11.setEast(R12);
        R11.setWest(R8);

        //R12
        R12.setNorth(R10);
        R12.setSouth(R9);
        R12.setWest(R11);
        R12.setEast(R13);
        
        //Initialising the map with rooms.
        Map M = new Map(11, 11);
        M.placeRoom(P0, 'S');
        M.placeRoom(P1, '#');
        M.placeRoom(P2, '#');
        M.placeRoom(P3, '#');
        M.placeRoom(P4, '#');
        M.placeRoom(P5, '#');
        M.placeRoom(P6, '#');
        M.placeRoom(P7, '#');
        M.placeRoom(P8, '#');
        M.placeRoom(P9, '#');
        M.placeRoom(P10, '#');
        M.placeRoom(P11, '#');
        M.placeRoom(P12, '#');

        //display instructions
        System.out.println("--------------------------Welcome to My Game-------------------------- \n The commands you can use at any point throughout the game are: \n -move <direction (NESW)> - allows you to move into a new room. \n -look - Displays a description of the room the player is in. \n -look <feature> - Displays a more detailed description of a feature of a room. \n -look <item> - Displays a description of an item. \n -inventory - Displays a list of all items the player has obtained. \n -score - Displays the user's current score. \n -map - Displays a text-based map of the current explored game world. \n -help - Displays a help message. \n -quit - Quits the game. \n");
        
        //Start output
        System.out.println(" -You are now in " + R0.getName() + " you can look around or move east");
        
        //display map
        System.out.println(M.display());

        //starting the game
        Main game = new Main(R0);
        game.play();
    }  
}