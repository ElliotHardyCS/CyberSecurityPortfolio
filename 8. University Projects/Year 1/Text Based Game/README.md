**Text Based Game**
---

**Version 1**
---

In version one I was asked to create a basic text-based game in the style of Zork.  
The game is designed to be played by entering various commands e.g "move south", "look", "get key"), to which my game should return a text based output like "You pick up the rusty key".  

I was tasked with creating my own narrative for the game of any genre and the game must consist of rooms which can be travelled to and the player can perform actions in.    
The game must also present puzzles to the player, the puzzles must involve the player using an item from their inventory they have previously collected.  
The game must also provide a score based on puzzles solved and rooms visited the formula is: (startingScore - rooms + puzzles)*PUZZLE_SCORE  

And finally the game must display a text-based map of the world as the user explores the world.

**Minimum Expected Commands**
---
- move <direction> (<direction> = north | south | east | west)(Moves player in the specified direction.)  
- look (Displays a description of the current room.)  
- look <feature> (Displays a more detailed description of an feature in the room.)  
- look <item> (Displays a description of the specified item.)  
- Inventory (Displays the inventory of the player.)  
- Score (Displays the users current score.)  
- Map (Displays a text-based map of the currently explored world.)  
- Help (Displays a help message / hint.)  
- Quit (Quits the game and displays the score.)

- Must also create additional commands, I chose open door for my extra feature which i discuss later.

**Minimum game requirements**
---
- At least 10 unique rooms.    
- At least 2 puzzles.  
- At least 4 items.  

**Additional features**
---
-Lockable doors (The entrance to a room is locked unless you have the specific key required. and once the key is obtained the door becomes unlocked and the route is then travelable, which I also included into my additional commands.)

**Classes Required**
---
- [Position](./Version%201/Position.java) (The position class stores a position in terms of x and y.)  
- [Room](./Version%201/Room.java) (The room class stores information about a room, including a name, description, a symbol, and a position.)  
- [Map](./Version%201/Map.java) (The Map class stores information about the game map, including the map array, a width and height, and the value used for empty map areas for which I chose "." .)  
- [Inventory](./Version%201/Inventory.java) (The Inventory class stores the player's inventory and is made using an array, It includes the maximum number of items a player can store, current number of items stored.)
- [Score](./Version%201/Score.java) (The score class stores and calculates the player's score, It includes the starting score, the current score, number of rooms visited, the number of puzzles solved and the score per puzzle.)
- [Game](./Version%201/Game.java) (The game class runs the main game loop which allows you to play the game and is used to bring together all of the classes.)

**Submitted Video and github link**
---
[Github Project]()
()[./video/version1_video.mp4]
