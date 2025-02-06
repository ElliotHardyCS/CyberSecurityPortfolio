package org.uob.a1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

public class RoomTest {
   
    @Test
    public void testConstructor() {
        Position position = new Position(2,2);
        Room room = new Room("Room","a room",'r',new Position(2,2));
        
        String pass = "FAIL";
        pass = (room.getName().equals("Room")) &&
            (room.getDescription().equals("a room")) &&
            (room.getSymbol() == 'r') &&
            (room.getPosition().x == 2 && room.getPosition().y == 2)
            ? "PASS" : "FAIL";
      
        
        System.out.println("AUTOMARK::Room.testConstructor: " + pass);
    }

    @Test
    public void testGetName() {
        Position position = new Position(2,2);
        Room room = new Room("Room","a room",'r',new Position(2,2));
        String pass = "FAIL";
        pass = (room.getName().equals("Room")) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Room.testGetName: " + pass);
    }

    @Test
    public void testGetDescription() {
        Position position = new Position(2,2);
        Room room = new Room("Room","a room",'r',new Position(2,2));
        String pass = "FAIL";
        pass = (room.getDescription().equals("a room")) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Room.testGetDescription: " + pass);
    }

    @Test
    public void testGetPosition() {
        Position position = new Position(2,2);
        Room room = new Room("Room","a room",'r',new Position(2,2));
        String pass = "FAIL";
        pass = (room.getPosition().x == 2 && room.getPosition().y == 2) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Room.testGetPosition: " + pass);
    }
   

}