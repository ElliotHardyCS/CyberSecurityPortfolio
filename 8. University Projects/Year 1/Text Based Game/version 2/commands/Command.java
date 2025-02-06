package org.uob.a2.commands;

import org.uob.a2.gameobjects.*;

public abstract class Command
{
    public CommandType commandType;
    public String value;
    public Command(){}
    public abstract String execute(GameState gameState);
}
