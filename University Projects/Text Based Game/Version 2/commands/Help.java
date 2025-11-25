package org.uob.a2.commands;

import org.uob.a2.gameobjects.*;

public class Help extends Command 
{
    private String topic;

    public Help(String topic)
    {
        this.topic = topic;
        this.commandType = commandType.HELP;
    }

    public CommandType getCommandType() 
    {
        return this.commandType;
    }

    public String execute(GameState gameState)
    {
        String help = "";
        
        if (topic == null)
        {
            help = "Welcome to the game! \nHelp: \n The commands you can use are: \n- MOVE (move <direction> (NSEW)).\n- USE (use <item> or <equipment>).\n- GET (get <item> or <equipment>).\n- DROP (drop <item> or <equipment>).\n- LOOK (look).\n- STATUS (status).\n- HELP (help).\n- QUIT (quit).";
        }
        else
        {
            switch(topic)
            {
                case "move":
                    help = "MOVE Command: \n-Use the 'move' command and ensure you specify a direction.";
                    break;
                case "use":
                    help = "USE Command: \n-Use the 'use' command and ensure you specify a piece of equipment.";
                    break;
                case "combine":
                    help = "COMBINE Command: \n-Use the 'combine' command and ensure you specify two items.";
                    break;
                case "get":
                    help = "GET Command: \n-Use the 'get' command and ensure you specify an item or piece of equipment.";
                    break;
                case "drop":
                    help = "DROP Command: \n-Use the 'drop' command and ensure you specify an item or piece of equipment.";
                    break;
                case "look":
                    help = "LOOK Command: \n-Use the 'look' command.";
                    break;
                case "status":
                    help = "STATUS Command: \n-Use the 'status' command.";
                    break;
                case "quit":
                    help = "QUIT Command: \n-Use the 'quit' command.";
                    break;
                default:
                    help = "No help available for the topic: "+topic+"";
            }
        }
        return help;
    }

    public String toString()
    {
        return "HELP: the topic is: "+topic+"";
    }
    
}
