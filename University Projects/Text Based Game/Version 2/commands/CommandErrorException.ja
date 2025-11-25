package org.uob.a2.commands;

public class CommandErrorException extends Exception 
{
    private String error;
    
    public CommandErrorException(String error)
    {
        this.error = error;
    }

    public String getMessage()
    {
        return error;
    }
    
    @Override
    public String toString() {
        return "CommandError: " + getMessage();
    }
}
