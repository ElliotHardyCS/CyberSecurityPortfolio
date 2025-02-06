package org.uob.a1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

public class MapTest {
   
    @Test
    public void testConstructor() {
        Map map = new Map(4,4);
        
        String pass = "FAIL";
        pass = (map.display().equals("....\n....\n....\n....\n")) ? "PASS" : "FAIL";
        
        System.out.println("AUTOMARK::Map.testConstructor: " + pass);
    }

    @Test
    public void testPlaceRoom() {
        Map map = new Map(4,4);
        map.placeRoom(new Position(0,0),'r');
        String pass = "FAIL";
        pass = (map.display().equals("r...\n....\n....\n....\n")) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Map.testPlaceRoom: " + pass);
    }

    @Test
    public void testDisplay() {
        Map map = new Map(4,4);
        map.placeRoom(new Position(0,0),'r');
        map.placeRoom(new Position(3,1),'c');
        String pass = "FAIL";
        pass = (map.display().equals("r...\n...c\n....\n....\n")) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Map.testDisplay: " + pass);
    }

   

}