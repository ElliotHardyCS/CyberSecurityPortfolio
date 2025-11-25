package org.uob.a2.parser;

import java.util.ArrayList;

public class Tokeniser 
{
    private ArrayList<Token> tokens;

    public Tokeniser()
    {
        this.tokens = new ArrayList<Token>();
    }

    public ArrayList<Token> getTokens()
    {
        return tokens;
    }
    
    public String sanitise(String s)
    {
        String sanS = s.toLowerCase().trim().replaceAll("\\s+", " ");
        return sanS;
    }
    
    public void tokenise(String s) 
    {
        String[] S = s.split(" ");
        
        for (int i = 0; i < S.length; i++) 
        {
            String t = S[i];
            if (i == 0) 
            {
                if (t.equals("use")) 
                {
                    tokens.add(new Token(TokenType.USE));
                } 
                else if (t.equals("combine")) 
                {
                    tokens.add(new Token(TokenType.COMBINE));
                }
                else if (t.equals("get")) 
                {
                    tokens.add(new Token(TokenType.GET));
                } 
                else if (t.equals("drop")) 
                {
                    tokens.add(new Token(TokenType.DROP));
                } 
                else if (t.equals("look")) 
                {
                    tokens.add(new Token(TokenType.LOOK));
                } 
                else if (t.equals("status")) 
                {
                    tokens.add(new Token(TokenType.STATUS));
                } 
                else if (t.equals("help")) 
                {
                    tokens.add(new Token(TokenType.HELP));
                } 
                else if (t.equals("quit")) 
                {
                    tokens.add(new Token(TokenType.QUIT));
                } 
                else if (t.equals("move")) 
                {
                    tokens.add(new Token(TokenType.MOVE));
                } 
                else
                {
                    tokens.add(new Token(TokenType.VAR, t));
                }
            } 
            else 
            {
                if (t.equals("on") || t.equals("in") || t.equals("with") || t.equals("at") || t.equals("for")) 
                {
                    tokens.add(new Token(TokenType.PREPOSITION, t));
                } 
                else 
                {
                    tokens.add(new Token(TokenType.VAR, t));
                }
            }
        }
        tokens.add(new Token(TokenType.EOL));
    }
}
