package org.uob.a1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

public class ScoreTest {
   
    
    @Test
    public void testConstructor() {
        Score score = new Score(100);
        String pass = "FAIL";
        pass = (score.getScore() == 100) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Score.testConstructor: " + pass);
    }

    @Test
    public void testGetScore() {
        Score score = new Score(100);
        String pass = "FAIL";
        pass = (score.getScore() == 100) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Score.testGetScore: " + pass);
    }

    @Test
    public void testVisitRoom() {   
        Score score = new Score(100);
        score.visitRoom();
        score.visitRoom();
        String pass = "FAIL";;
        pass = (score.getScore() == 98) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Score.testVisitRoom: " + pass);
    }

    @Test
    public void testSolvePuzzle() {   
        Score score = new Score(100);
        score.solvePuzzle();
        String pass = "FAIL";
        pass = (score.getScore() == 110) ?"PASS" : "FAIL";
        System.out.println("AUTOMARK::Score.testSolvePuzzle: " + pass);
    }

   

}