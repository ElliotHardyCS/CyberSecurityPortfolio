**Text Based Game Explained, V1 and V2**
---  
**Version 1** //
---  
-In version one I was asked to create a basic text-based game in the style of Zork.  
The game is designed to be played by entering various commands e.g "move south", "look", "get key"), to which my game should return a text based output like "You pick up the rusty key".  

-I was tasked with creating my own narrative for the game of any genre and the game must consist of rooms which can be travelled to and the player can perform actions in.    
The game must also present puzzles to the player, the puzzles must involve the player using an item from their inventory they have previously collected.  
The game must also provide a score based on puzzles solved and rooms visited the formula is: (startingScore - rooms + puzzles)*PUZZLE_SCORE  

-And finally the game must display a text-based map of the world as the user explores the world.

...ADD MORE HERE...

**Minimum Expected Commands**
---  
- move <"direction"> (<"direction"> = north | south | east | west)(Moves player in the specified direction.)  
- look (Displays a description of the current room.)  
- look <"feature"> (Displays a more detailed description of an feature in the room.)  
- look <"item"> (Displays a description of the specified item.)  
- inventory (Displays the inventory of the player.)  
- score (Displays the users current score.)  
- map (Displays a text-based map of the currently explored world.)  
- help (Displays a help message / hint.)  
- quit (Quits the game and displays the score.)

- I Must also create additional commands, I chose open door for my extra feature which I will discuss later.

**Minimum game requirements**
---  
- At least 10 unique rooms.    
- At least 2 puzzles.  
- At least 4 items.  

**Additional features** //
---  
- Lockable doors (The entrance to a room is locked unless you have the specific key required. and once the key is obtained the door becomes unlocked and the route is then travelable, which I also included into my additional commands.)
- Room Questions ().

**Classes Required**
---  
- [Position](./Version%201/Position.java) (The position class stores a position in terms of x and y.)  
- [Room](./Version%201/Room.java) (The room class stores information about a room, including a name, description, a symbol, and a position.)  
- [Map](./Version%201/Map.java) (The Map class stores information about the game map, including the map array, a width and height, and the value used for empty map areas for which I chose "." .)  
- [Inventory](./Version%201/Inventory.java) (The Inventory class stores the player's inventory and is made using an array, It includes the maximum number of items a player can store, current number of items stored.)
- [Score](./Version%201/Score.java) (The score class stores and calculates the player's score, It includes the starting score, the current score, number of rooms visited, the number of puzzles solved and the score per puzzle.)
- [Game](./Version%201/Game.java) (The game class runs the main game loop which allows you to play the game and is used to bring together all of the classes.)

- [View all code here...](./Version%201/)

**Submitted Video and github link**
---  
[Github Project](https://git.cs.bham.ac.uk/oop-24-25/exh444)  
[Version 1 Video](https://youtu.be/IiBGIig8pdA?si=kOlHR6YKxWycIPDh)

**Assesement of My Project**
---  

Feedback from assessor: "Good game, well-structured code and some nice additional features."  
The mark I recieved is 93/100 for this project.  

---  
**Version 2** //
---  

-In version two I was asked to update my Zork style text based game from version 1. To be able to complete version 2 I was required to start from scratch due to the redesign of the game structure, I was allowed to resue my story line but I chose not to and created a new game story with new rooms, items, and features.

-The game continues to be played by entering various commands e.g "move south", "look", "get key", "use key on chest"), to which my game should return a text based output like "You pick up the rusty key".

-combine, new help, get drop use, containers, equipment, PARSER (GAME AND TEXT FILE) PARA EACH. TEXT FILE ASWELL
....


**Minimum Expected Commands**
---  
- move <"exit name"> (I chose to keep names for the exits NSEW <"exit name"> = north | south | east | west)(Moves player in the specified direction.)    
- Look <"room | exit | features"> | <"item name"> | <"equipment name"> | <"feature name"> (Displays a description of the current room, exits in the current room, the specified item, equipment, exit, or feature.)    
- get <"item name | equipment name"> (Picks up the specified item if you are in the same room as it and adds it to the players inventory.)    
- drop <"item name | equipment name"> (Drops the item into the current room and removes the item from inventory.)    
- use <"equipment name"> on/with <"feature"> (Uses an item in your inventory on its own or to interact with the specified feature.)      
- status <"inventory | player | item name | equipment name | map | score"> (Ouputs the current status of the specified parameter in a text based format, this is how you view your map, score and inventory unlike version 1.)    
- help | help <"topic"> (Displays a general help message | Displays a help message for your specified topic.)  
- combine <"item1"> with <"item 2"> (Checks if your items are combinable and if so combines them into a new singular item removing item1/2 from your inventory and adding the new combined item back.)   
- quit (Quits the game and displays the score and map.)  

**Minimum game requirements**
---  
- At least 10 unique rooms.    
- At least 2 features/chests/containers.  
- At least 4 items.
- At least 2 pieces of equipment.

**Additional features** //
---  
- Hidden rooms ()  
- Room Questions ()  

**Score/Map**
  - This version Score and Map were labelled as compulsory extra features as we weere guven free reign over their design and build.  
  - Score (Used through the status command I used the same formula to calculate the score as version 1 .)  
  - Map (Used through the status command .)  

**Classes Required** 
---  
**Commands**
- [Command (abstract)](./version%202/Command.java) ()
- [Drop](./version%202/Drop.java) ()
- [Get](./version%202/Get.java) ()
- [Help](./version%202/Help.java) ()
- [Look](./version%202/Look.java) ()
- [Move](./version%202/Move.java) ()
- [Quit](./version%202/Quit.java) ()
- [Status](./version%202/Status.java) ()
- [Use](./version%202/Use.java) ()
- [CommandErrorException](./version%202/CommandErrorException.java) ()
- [CommandType (enum)](./version%202/CommandType.java) ()

**GameObjects**
- [GameObject (abstract)](./version%202/GameObject.java) ()
- [Container (extends Feature)](./version%202/Container.java) ()
- [Equipment (implements Usable)](./version%202/Equipment.java) ()
- [Exit](./version%202/Exit.java) ()
- [Feature](./version%202/Feature.java) ()
- [Item](./version%202/Item.java) ()
- [GameState](./version%202/GameState.java) ()
- [Player](./version%202/Player.java) ()
- [Room](./version%202/Room.java) ()
- [Map](./version%202/Map.java) ()
- [Usable (interface)](./version%202/Usable.java) ()  
- [UseInformation](./version%202/UseInformation.java) ()   

**Command Parser**
- [Parser](./version%202/Parser.java) ()
- [Token](./version%202/Token.java) ()
- [TokenType](./version%202/TokenType.java) ()
- [Tokeniser](./version%202/Tokeniser.java) ()  

**Game State File Parser**
- [GameStateFileParser](./version%202/GameStateFileParser.java) ()  

- [View all code here...](./version%202/)  

**Submitted Video and github link**
---  
[Github Project](https://git.cs.bham.ac.uk/oop-24-25-2/exh444)  
[Version 2 Video](https://youtu.be/fpqI0m9TT8E?si=-DEkj-MkbVfnxlzh)

**Assesement of My Project**
---  
General Feedback: "Excellent Game, with well written code."  
Additional Feedback: "Sufficiently complicated additional features implemented."  
New Feature Feedback: "Score code is complex and well integrated, Map code is complex and well integrated, Combine code works and is well implemented and uses the existing built code structure."  
The mark I recieved is 93.4/100 for this project.    
