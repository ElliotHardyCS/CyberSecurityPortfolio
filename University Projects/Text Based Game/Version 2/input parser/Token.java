package org.uob.a2.parser;

public class Token 
{
    private TokenType tokenType;
    private String value;
    
    public Token(TokenType tokenType)
    {
        this.tokenType = tokenType;
    }
    
    public Token(TokenType tokenType, String value)
    {
        this.tokenType = tokenType;
        this.value = value;
    }

    public TokenType getTokenType()
    {
        return tokenType;
    }

    public String getValue()
    {
        return value;
    }
}
