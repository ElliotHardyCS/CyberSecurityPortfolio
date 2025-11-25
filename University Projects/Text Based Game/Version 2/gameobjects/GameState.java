package org.uob.a2.gameobjects;

public class GameState 
{
    private Map map;
    private Player player;

    public GameState(){}

    public GameState(Map map, Player player)
    {
        this.map = map;
        this.player = player;
    }

    public Map getMap()
    {
        return map;
    }

    public Player getPlayer()
    {
        return player;
    }
    
    @Override
    public String toString() {
        return "GameState {" +
               "map=" + (map != null ? map.toString() : "null") + ", " +
               "player=" + (player != null ? player.toString() : "null") +
               '}';
    }
}
