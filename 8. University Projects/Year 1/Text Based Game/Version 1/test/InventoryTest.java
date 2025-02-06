package org.uob.a1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

public class InventoryTest {
   
    
    @Test
    public void testConstructor() {
        Inventory inventory = new Inventory();
        String pass = "FAIL";
        pass = ("".equals(inventory.displayInventory())) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Inventory.testConstructor: " + pass);
    }

    @Test
    public void testAddItem() {
        Inventory inventory = new Inventory();
        inventory.addItem("sword");
        String pass = "FAIL";
        pass = (inventory.hasItem("sword") > -1) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Inventory.testAddItem: " + pass);
    }

    @Test
    public void testHasItem() {
        Inventory inventory = new Inventory();
        inventory.addItem("sword");
        String pass = "FAIL";
        pass = (inventory.hasItem("sword") > -1) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Inventory.testHasItem: " + pass);
    }

    @Test
    public void testRemoveItem() {
        Inventory inventory = new Inventory();
        inventory.addItem("sword");
        inventory.addItem("spear");
        inventory.removeItem("sword");
        String pass = "FAIL";
        pass = (inventory.hasItem("sword") == -1) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Inventory.testRemoveItem: " + pass);
    }

    @Test
    public void testDisplayInventory() {
        Inventory inventory = new Inventory();
        inventory.addItem("sword");
        inventory.addItem("spear");
        String pass = "FAIL";
        pass = ("sword spear ".equals(inventory.displayInventory())) ? "PASS" : "FAIL";
        System.out.println("AUTOMARK::Inventory.testDisplayInventory: " + pass);
    }

   

}