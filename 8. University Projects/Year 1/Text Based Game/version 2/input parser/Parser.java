package org.uob.a2.parser;

import java.util.ArrayList;

import org.uob.a2.gameobjects.*;
import org.uob.a2.commands.*;

public class Parser 
{
    public Parser(){}

    public Command parse(ArrayList<Token> tokens) throws CommandErrorException
    {
        String firstT = tokens.get(0).getTokenType().toString().toLowerCase();
        Command c;

        int tokenNo = 0;
        for (int i = 0; i < tokens.size(); i++)
        {
            if (!(tokens.get(i).getTokenType().equals(TokenType.EOL)))
            {
                tokenNo += 1;
            }
        }
        
        //uses the tokenNo to decide which tokens it could be. then builds the command
        if (tokenNo == 4)
        {
            switch (firstT) 
            {   
                case "use":
                    c = new Use(tokens.get(1).getValue().toLowerCase(), tokens.get(3).getValue().toLowerCase());
                    return c;
                case "combine":
                    c = new Combine(tokens.get(1).getValue().toLowerCase(), tokens.get(3).getValue().toLowerCase());
                    Item cItem = new Item("CS", "cosmic screwdriver", "-A cosmic Screw Driver", false);
                    ((Combine) c).addCItem(tokens.get(1).getValue().toLowerCase(), tokens.get(3).getValue().toLowerCase(), cItem);
                    return c;
                default:
                    throw new CommandErrorException("Invalid command.");
            }
        }
        else if (tokenNo == 2) 
        { 
            switch (firstT) 
            {
                case "drop":
                    c = new Drop(tokens.get(1).getValue().toLowerCase());
                    return c;
                case "get":
                    c = new Get(tokens.get(1).getValue().toLowerCase());
                    return c;
                case "help": 
                    c = new Help(tokens.get(1).getValue().toLowerCase());
                    return c;
                case "look":
                    c = new Look(tokens.get(1).getValue().toLowerCase());
                    return c;
                case "move":
                    c = new Move(tokens.get(1).getValue().toLowerCase());
                    return c;
                case "status":
                    c = new Status(tokens.get(1).getValue().toLowerCase());
                    return c;
                default:
                    throw new CommandErrorException("Invalid command.");
            }
        } 
        else if (tokenNo == 1)
        { 
            switch (firstT) 
            {
                case "help":
                    c = new Help(null);
                    return c;    
                case "look":
                    c = new Look("room");
                    return c;
                case "quit":
                    c = new Quit();
                    return c;
                default:
                    throw new CommandErrorException("Invalid command.");
            }                
        }
        return null;
    }
}