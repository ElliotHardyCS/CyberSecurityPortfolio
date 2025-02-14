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

**Additional features**
---  
- Lockable doors (The entrance to a room is locked unless you have the specific key required. and once the key is obtained the door becomes unlocked and the route is then travelable, which I also included into my additional commands.)
- Room Questions (In certain rooms across the map once you enter you cannot leave until you have answered the question in the room, in this instance of the game all movement becomes restricted until the question is answered correctly each question is only repeated until correct, if you return to the room later on you are not asked again. this is the original version of this extra feature.)

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

**Table Comparison**
| Version 1 | Version 2 |
|----------|----------|
| move <NSEW>   | Move <exit>   |
| look, look <feature/item>   | look <topic>   |
| inventory   | status <inventory>/status   |
| map   | status <map>/status   |
| score   | status <score>/status   |
| help   | help/help <topic/command>   |
| **New Features:**   |    |
| Get   |    |
| drop   |    |
| use   |    |
| combine   |    |


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

**Additional features**
---  
- Hidden rooms (The entrance to a room is hidden unless you have the specific key required and have used the wires equipment on the electrical cabinet. and once the key is obtained and the wires have been used a message that the room is accessable appears in the output and is repeated after every command like a pop up on screen.)  
- Room Questions (In certain rooms across the map once you enter you cannot leave until you have answered the question in the room, in this instance of the game all exits become locked/hidden until the question is answered correctly each question is only repeated until correct, if you return to the room later on you are not asked again. this is a continuation from the original in version 1.)  

**Score/Map**
  - This version Score and Map were labelled as compulsory extra features as we weere guven free reign over their design and build.  
  - Score (Used through the status command I used the same formula to calculate the score as version 1 .)  
  - Map (Used through the status command .)  

**Classes Required** 
---  
**Commands**
- [Command (abstract)](./version%202/commands/Command.java) (An abstract command that can be executed within the game.)  
- [Drop](./version%202/commands/Drop.java) (The drop command, allowing the player to drop an item from their inventory into the current room.)  
- [Get](./version%202/commands/Get.java) (The get command, allowing the player to pick up an item from the current room and add it to their inventory.)  
- [Help](./version%202/commands/Help.java) (The help command, providing the player with instructions or information about various topics related to the game.)  
- [Look](./version%202/commands/Look.java) (The look command, allowing the player to examine various elements of the game world.)  
- [Move](./version%202/commands/Move.java) (The move command, allowing the player to navigate to a different room in the game world.)  
- [Quit](./version%202/commands/Quit.java) (The quit command, allowing the player to exit the game.)  
- [Status](./version%202/commands/Status.java) (The status command, allowing the player to retrieve information about their inventory, specific items,see the map or their score, or their overall status.)  
- [Use](./version%202/commands/Use.java) (The use command, allowing the player to use equipment on a specific target in the game.)  
- [CommandErrorException](./version%202/commands/CommandErrorException.java) (An exception thrown when an unrecognized or invalid command is encountered.)  
- [CommandType (enum)](./version%202/commands/CommandType.java) (The various types of commands that can be executed in the game.)  

**GameObjects**
- [GameObject (abstract)](./version%202/game%20objects/GameObject.java) (A generic game object that can be part of the game world.)
- [Container (extends Feature)](./version%202/game%20objects/Container.java) (A conatiner in the game, which is a type of feature that may contain items or serve as an interactable object within a room.)
- [Equipment (implements Usable)](./version%202/game%20objects/Equipment.java) (A usable item in the game, which is a type of GameObject.)
- [Exit](./version%202/game%20objects/Exit.java) (An exit in the game, allowing the player to move from one room to another.)
- [Feature](./version%202/game%20objects/Feature.java) (A feature in the game, which is a type of game object that can be part of a room or environment.)
- [Item](./version%202/game%20objects/Item.java) (An item in the game, which is a type of GameObject.)
- [GameState](./version%202/game%20objects/GameState.java) (The current state of the game, including the map and the player.)
- [Player](./version%202/game%20objects/Player.java) (The player in the game, including their name, inventory, and equipment.)
- [Room](./version%202/game%20objects/Room.java) (A room in the game, which is a type of GameObject.)
- [Map](./version%202/game%20objects/Map.java) (The game map, which consists of a collection of rooms and the current room the player is in.)
- [Usable (interface)](./version%202/game%20objects/Usable.java) (An interface for objects that can be used within the game.)  
- [UseInformation](./version%202/game%20objects/UseInformation.java) (Information about how an object can be used in the game.)   

**Command Parser**
- [Parser](./version%202/input%20parser/Parser.java) (The Parser class processes a list of tokens and converts them into Command objects that can be executed by the game.)
- [Token](./version%202/input%20parser/Token.java) (A token in the parsing process, consisting of a TokenType and an optional value.)
- [TokenType](./version%202/input%20parser/TokenType.java) (Represents the types of tokens that can be identified and processed by the parser.)
- [Tokeniser](./version%202/input%20parser/Tokeniser.java) (The Tokeniser class is responsible for converting a string input into a list of tokens that can be parsed into commands by the game.)  

**Game State File Parser**
- [GameStateFileParser](./version%202/text%20file%20parser/GameStateFileParser.java) (Utility class for parsing a game state from a written text file.)
- [Text File | game File](./version%202/text%20file%20parser/GameStateFileParser.java) (Text file used to create a game state by parsing it through the game state file parser.)

**View the Java Doc specification**
- [Link to Java Doc](./version%202/index.html)
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
