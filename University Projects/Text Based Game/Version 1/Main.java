package org.uob.a1;

//imports
import java.util.Scanner;

//code
public class Main
{
    private Room currentRoom;
    private Map currentMap;
    private Inventory I;
    private Score S;

    //position
    private Position P0;
    private Position P1;
    private Position P2;
    private Position P3;
    private Position P4;
    private Position P5;
    private Position P6;
    private Position P7;
    private Position P8;
    private Position P9;
    private Position P10;
    private Position P11;
    private Position P12;
    private Position P13;

    //Rooms
    private Room R0;
    private Room R1;
    private Room R2;
    private Room R3;
    private Room R4;
    private Room R5;
    private Room R6;
    private Room R7;
    private Room R8;
    private Room R9;
    private Room R10;
    private Room R11;
    private Room R12;
    private Room R13;

    public Main()
    {

        //creating inventory
        this.I = new Inventory();

        //Score
        this.S = new Score(100);
        
        //Map
        this.currentMap = new Map(11,11);
        this.P0 = new Position(1,7);
        this.P1 = new Position(3,1);  
        this.P2 = new Position(3,3);   
        this.P3 = new Position(3,5);  
        this.P4 = new Position(3,7);  
        this.P5 = new Position(3,9);  
        this.P6 = new Position(5,3);  
        this.P7 = new Position(5,5);  
        this.P8 = new Position(5,7);  
        this.P9 = new Position(5,9); 
        this.P10 = new Position(7,5);   
        this.P11 = new Position(7,7);
        this.P12 = new Position(9,7);
        this.P13 = new Position(10,7);

        currentMap.placeRoom(P0, 'S');
        currentMap.placeRoom(P1, '#');
        currentMap.placeRoom(P2, '#');
        currentMap.placeRoom(P3, '#');
        currentMap.placeRoom(P4, '#');
        currentMap.placeRoom(P5, '#');
        currentMap.placeRoom(P6, '#');
        currentMap.placeRoom(P7, '#');
        currentMap.placeRoom(P8, '#');
        currentMap.placeRoom(P9, '#');
        currentMap.placeRoom(P10, '#');
        currentMap.placeRoom(P11, '#');
        currentMap.placeRoom(P12, '#');

        //Rooms
        //Initialising the rooms.
        this.R0 = new Room("Starting Clearing - Main", "A dusty clearing sourrounded by tall dark pine trees, and a flame torch on the wall, ", 'S', P0);
        this.R1 = new Room("Tree House", "An tall oak tree with a hanging ladder in the corner, ", 'T', P1);
        this.R2 = new Room("Old Ruins", "A ruined cobblestone tavern overgrown, The features are Vines and Bushes, ", 'R', P2);
        this.R3 = new Room("Oak Forest", "An tall oak tree forest ,", 'F', P3);
        this.R4 = new Room("Main clearing", "A dusty clearing sourrounded by tall dark pine trees with a chest in the clearing, The feature is a chest, ", 'C', P4);
        this.R5 = new Room("Dirt Path", "An old dirt path leading toward a cabin, ", 'D', P5);
        this.R6 = new Room("Abandoned Cottage", "A beautiful abandoned cottage with a thatch roof, a shield is hung on the wall, ", 'A', P6);
        this.R7 = new Room("Talking Tree", "A huge talking tree in the centre of a deep dark forest, ", 'T', P7);
        this.R8 = new Room("Empty Camp", "A deserted ork camp with all their tents left, ", 'E', P8);
        this.R9 = new Room("Cabin", "An ornate cabin with smoke rising from the chimney, and a sword on a shelf, ", 'C', P9);
        this.R10 = new Room("Old Market", "An old ruined market with only a few stalls remaining, with a old shawl left hanging on one of the stands", 'O', P10);
        this.R11= new Room("Swamp", "A deep boggy swamp, bubbling over with trees growing throughout, and the top of a ceramic spot sticking out of the mud, ", 'S', P11);
        this.R12 = new Room("Portal", "A room with a bush in the corner and a unlit portal in the back,", 'P', P12);
        this.R13 = new Room("Finish", "A vast white expanse with solid gold draped everywhere", 'E', P13);

        //linking rooms
        //R0
        R0.setEast(R4);
        //R2
        R2.setSouth(R3);
        R2.setEast(R6);
        //R4
        R4.setNorth(R3);
        R4.setEast(R8);
        R4.setSouth(R5);
        //R5
        R5.setNorth(R4);
        //R6
        R6.setWest(R2);
        R6.setEast(R10);
        R6.setSouth(R7);
        //R8
        R8.setNorth(R7);
        R8.setEast(R11);
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
        //R12
        R12.setNorth(R10);
        R12.setSouth(R9);
        R12.setWest(R11);
        //currentRoom
        this.currentRoom = R0;
        
    }
    
    public void play()
    {
        //input
        String input = "map";
        //creating items
        Item I1 = new Item("Cabin Key", "-A Rusty Old Key", R4);
        Item I2 = new Item("Flame Torch", "-A Flaming torch that allows you to see", R0);
        Item I3 = new Item("Sword", "-A sharp sword with battle scars all over", R9);
        Item I4 = new Item("Glowing Orb", "-A pink glowing orb that allows you to open the exit portal", R12);
        Item I5 = new Item("Secret Door Key", "-A Rusty Old Key", R2);
        Item I6 = new Item("Shawl", "-A torn and ruined shawl", R10);
        Item I7 = new Item("Shield", "-A wooden shield with a metal trim and rivets all over", R6);
        Item I8 = new Item("Ceramic Pot", "-An old ceramic pot that has cracks running down the side", R11);

        //assigning items to rooms
        R4.setItem(I1);
        R0.setItem(I2);
        R9.setItem(I3);
        R12.setItem(I4);
        R2.setItem(I5);
        R10.setItem(I6);
        R6.setItem(I7);
        R11.setItem(I8);

        //creating features
        Feature V = new Feature("Vines ", "-You find a secret door behind the vines you will need a key to follow the route", R2, null);
        Feature B = new Feature("Bushes ", "-You find a key to a secret door in the bushes", R2, I5);
        Feature C = new Feature("Chest ", "-You open the chest and find a key to the cabin somehwere in the game", R2, I1);
        Feature B2 = new Feature("Bushes ", "-You search the bushes and find a pink glowing orb", R2, I4);
        
        //creating puzzles
        Puzzle Pu1= new Puzzle("-You have been caught by a hanging vine, how do you escape: \n A: Try to tear the vine \n B: Burn the vine with a flaming torch \n C: Try to pull yourself free", "b", input, R3);
        Puzzle Pu2 = new Puzzle("-You have been captured by the wise talking tree to escape the tree answer this question: \n True or False 51 and 7 are coprimes?", "true", input, R7);
        Puzzle Pu3 = new Puzzle("-What is the name of the person who created the enigma machine", "alan turing", input, R1);
        Puzzle Pu4 = new Puzzle("-Write bye in binary to activate the portal using the ASCII codes B=66, Y=89, E=101", "01000010 01011001 010000101", input, R12);
        Puzzle Pu5 = new Puzzle("-OGRE ATTACK they are blocking all but one exit and you are in an open swamp: what do you do? \n A: Run \n B: Attack \n C: Hide", "a", input, R11);
        
        //doors
        Door CD1 = new Door("-You will need a key to pass through to the cabin", input, R5, I);
        Door CD2 = new Door("-You will need a key to pass through to the cabin", input, R8, I);
        Door SD = new Door("-You will first find the door and you will also need a key to pass through this door", input, R5, I);
        Door PO = new Door("-You will need the glowing orb to pass through this door", input, R5, I);

        Scanner inputDevice = new Scanner(System.in);
        while (true) 
        {
            //Start of Game.
            
            //look item
            if (input.startsWith("look "))
            {
                String lookInput = input.substring(5).trim().toLowerCase();
                switch (lookInput)
                {
                    case "bushes":
                        if (currentRoom == R2)
                        {
                            System.out.println(B.getFeatureDescription());
                            I.addItem("Secret Door Key");
                        }
                        else
                        {
                            System.out.println(B2.getFeatureDescription());
                            I.addItem("Glowing Orb");
                        }
                        break;
                    case "vines":
                        System.out.println(V.getFeatureDescription());
                        break;
                    case "cabin key":
                        System.out.println(I1.getItemDescription());
                        I.addItem("Cabin Key");
                        break;
                    case "flame torch":
                        System.out.println(I2.getItemDescription());
                        I.addItem("Flame Torch");
                        break;
                    case "sword":
                        System.out.println(I3.getItemDescription());
                        I.addItem("Sword");
                        break;
                    case "glowing orb":
                        System.out.println(I4.getItemDescription());
                        break;
                    case "secret door key":
                        System.out.println(I5.getItemDescription());
                        break;
                    case "shawl":
                        System.out.println(I6.getItemDescription());
                        I.addItem("Shawl");
                        break;
                    case "shield":
                        System.out.println(I7.getItemDescription());
                        I.addItem("Shield");
                        break;
                    case "ceramic pot":
                        System.out.println(I8.getItemDescription());
                        I.addItem("Ceramic Pot");
                        break;
                    default:
                        System.out.println("This does not exist");
                }
            }
            else if (input.startsWith("search "))
            {
                String searchInput = input.substring(5).trim().toLowerCase();
                switch (searchInput)
                {
                    case "chest":
                        System.out.println(C.getFeatureDescription()); 
                        I.addItem("Cabin Key");
                        break;
                    default:
                        System.out.println("This does not exist");
                }
            }
            else 
            {  
                //input
                switch (input) 
                {
                    case "move south":
                        if (currentRoom == R8)
                        {
                            System.out.println(CD1.display());
                            if (CD1.validateDoor("Cabin Key"))
                            {
                                System.out.println("-You may progress");
                                R8.setSouth(R9);
                                move(currentRoom.getSouth());
                                break;
                            }
                            else
                            {
                               System.out.println("-You do not posess the Key!!");
                               input = inputDevice.nextLine().toLowerCase();
                            }
                        }
                        else
                        {
                            move(currentRoom.getSouth());
                        }
                        break;
                    case "move north":
                        if (currentRoom == R2)
                        {                          
                            System.out.println(SD.display());
                            if (SD.validateDoor("Secret Door Key"))
                            {
                                System.out.println("-You may progress");
                                R2.setNorth(R1);
                                move(currentRoom.getNorth());
                                break;
                            }
                            else
                            {
                                System.out.println("-You do not posess the key!!");
                                input = inputDevice.nextLine().toLowerCase();
                            }
                        }
                        else
                        {
                            move(currentRoom.getNorth());
                        }
                        break;
                    case "move east":
                        if (currentRoom == R5)
                        {
                            System.out.println(CD1.display());
                            if (CD1.validateDoor("Cabin Key"))
                            {
                                S.solvePuzzle();
                                System.out.println("-You may progress");
                                R5.setEast(R9);
                                move(currentRoom.getEast());
                                break;
                            }
                        }
                        else if (currentRoom == R12)
                        {
                            System.out.println(PO.display());
                            if (PO.validateDoor("Glowing Orb"))
                            {
                                S.solvePuzzle();
                                System.out.println("-You may progress");
                                R12.setEast(R13);
                                move(currentRoom.getEast());
                                I.removeItem("Glowing Orb");
                                break;
                            }
                            else
                            {
                                System.out.println("-You do not posess the key!!");
                                input = inputDevice.nextLine().toLowerCase();
                            }
                        }                        
                        else
                        {
                            move(currentRoom.getEast());
                        }
                        break;
                    case "move west":
                        move(currentRoom.getWest());
                        break;
                    case "inventory":
                        System.out.println(I.displayInventory());
                        break;
                    case "map":
                        System.out.println(currentMap.display());
                        break;
                    case "score":
                        System.out.println(S.getScore());
                        break;
                    case "look":
                        System.out.println(currentRoom.getDescription());
                        break;
                    case "help":
                        System.out.println("-Try exploring the room you are in by 'looking' around");
                        break;
                    case "quit":
                        System.out.println("-Thanks for playing");
                        inputDevice.close();
                        return;
                    default:
                        System.out.println("-Invalid command try again!");
                        break;
                }
            }
            
            //puzzles
            if (currentRoom == R3)
            {
                    System.out.println(Pu1.display());
                    input = inputDevice.nextLine().toLowerCase();
                    if (Pu1.validate(input))
                    {
                        S.solvePuzzle();
                        System.out.println("-Well done you may progress");
                        R3.setNorth(R2);
                        R3.setEast(R7);
                        R3.setSouth(R4);
                    }
                    else
                    {
                        System.out.println("Try again!!");
                        inputDevice.nextLine();
                        System.out.println("-Press enter to try again!!");
                    }
            }    
            else if (currentRoom == R7)
            {
                    System.out.println(Pu2.display());
                    input = inputDevice.nextLine().toLowerCase();
                    if (Pu2.validate(input))
                    {
                        S.solvePuzzle();
                        System.out.println("-Well done you may progress");
                        R7.setNorth(R6);
                        R7.setEast(R10);
                        R7.setSouth(R8);
                        R7.setWest(R3);
                    }
                    else
                    {
                        System.out.println("-Try again!!");
                        System.out.println("-Press enter to try again!!");
                    }
            }
            else if (currentRoom == R1)
            {
                    System.out.println(Pu3.display());
                    input = inputDevice.nextLine().toLowerCase();
                    if (Pu3.validate(input))
                    {
                        S.solvePuzzle();
                        System.out.println("-Well done you may progress");
                        R1.setEast(R10);
                    }
                    else
                    {
                        System.out.println("-Try again!!");
                        System.out.println("-Press enter to try again!!");
                    }
            }
            else if (currentRoom == R12)
            {
                    System.out.println(Pu4.display());
                    input = inputDevice.nextLine().toLowerCase();
                    if (Pu4.validate(input))
                    {
                        S.solvePuzzle();
                        System.out.println("-Well done you may progress");
                        R12.setEast(R13);
                    }
                    else
                    {
                        System.out.println("-Try again!!");
                        System.out.println("-Press enter to try again!!");
                    }
            }
            else if (currentRoom == R11)
            {
                    System.out.println(Pu5.display());
                    input = inputDevice.nextLine().toLowerCase();
                    if (Pu5.validate(input))
                    {
                        S.solvePuzzle();
                        System.out.println("-Well done you may progress");
                        R11.setNorth(R10);
                        R11.setEast(R12);
                        R11.setWest(R8);

                    }
                    else
                    {
                        System.out.println("-Try again!!");
                        System.out.println("-Press enter to try again!!");
                    }
            }
            else
            {}
            //Start input
            input = inputDevice.nextLine().toLowerCase();
        }
        
    }
        
    private void move(Room nextRoom) 
    {
        if (nextRoom != null) 
        {  
            currentRoom = nextRoom;
            Position PX = currentRoom.getPosition();
            currentMap.placeRoom(PX, currentRoom.getSymbol());
            System.out.println(" \n -You are now in the " + currentRoom.getName() + " Room");
            S.visitRoom();
        } 
        else 
        {
            System.out.println("-You cannot go that way. It might be because you are missing a key...");
        }
    }
}    
