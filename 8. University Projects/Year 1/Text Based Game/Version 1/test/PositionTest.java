package org.uob.a1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

public class PositionTest {
   
    
    @Test
    public void testConstructor() {
        Position position = new Position(2,3);
        String pass = "FAIL";
        pass = (position.x == 2) &&
               (position.y == 3) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Position.testConstructor: " + pass);
    }

    @Test
    public void testX() {
        Position position = new Position(2,3);
        String pass = "FAIL";
        pass = (position.x == 2) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Position.testX: " + pass);
    }

    @Test
    public void testY() {
        Position position = new Position(2,3);
        String pass = "FAIL";
        pass = (position.y == 3) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Position.testY: " + pass);
    }


   

}