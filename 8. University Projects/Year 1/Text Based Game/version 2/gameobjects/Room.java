package org.uob.a2.gameobjects;

import java.util.ArrayList;

public class Room extends GameObject 
{
    private ArrayList<GameObject> gameObject;
    private ArrayList<Exit> exits;
    private ArrayList<Feature> features;
    private ArrayList<Item> items;
    private ArrayList<Equipment> equipment;
    private boolean visited;

    public Room(){}

    public Room(String id, String name, String description, boolean hidden)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hidden = hidden;
        this.gameObject = new ArrayList<>();
        this.exits = new ArrayList<>();
        this.features = new ArrayList<>();
        this.items = new ArrayList<>();
        this.equipment = new ArrayList<>();
        this.visited = false;
    }
    
    public void addEquipment(Equipment equipmentName)
    {
        equipment.add(equipmentName);
        gameObject.add(equipmentName);
    }
    
    public void addExit(Exit exit)
    {
        exits.add(exit);
        gameObject.add(exit);
    }
    
    public void addFeature(Feature feature)
    {
        features.add(feature);
        gameObject.add(feature);
    }
    
    public void addItem(Item item)
    {
        items.add(item);
        gameObject.add(item);
    }

    public GameObject getGameObject(String id) {
        for (GameObject obj : gameObject) {
            if (obj.getId().equals(id)) {
                return obj;
            }
        }
        return null;
    }
    
    public boolean hasGameObjectById(String id) {
        for (GameObject obj : gameObject) {
            if (obj.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<GameObject> getAll()
    {
        return gameObject;
    }
    
    public String getDescription()
    {
        return description;
    }

    public void setVisited(boolean Visited)
    {
        visited = Visited;
    }

    public boolean getVisited()
    {
        return visited;
    }
    
    public Equipment getEquipment(String id)
    {
        for(Equipment e : equipment)
        {
            if (e.getId().equals(id))
            {
                return e;
            }
        }
        return null;
    }
    
    public Equipment getEquipmentByName(String name)
    {
        for(Equipment e : equipment)
        {
            if (e.getName().equals(name))
            {
                return e;
            }
        }
        return null;
    }
    
    public ArrayList<Equipment> getEquipments()
    {
        return equipment;
    }

    public void removeEquipment(String equipmentName)
    {
        for (Equipment equipments : equipment)
        {
            if(equipments.getName().equals(equipmentName))
            {
                equipment.remove(equipments);
            }
        }
    }
    
    public Exit getExit(String id)
    {
        for(Exit e : exits)
        {
            if (e.getId().equals(id))
            {
                return e;
            }
        }
        return null;
    }

    public Exit getExitByName(String name)
    {
        for(Exit e : exits)
        {
            if (e.getName().equals(name))
            {
                return e;
            }
        }
        return null;
    }
    
    public ArrayList<Exit> getExits()
    {
        return exits;
    }

    public boolean hasExit(String exitName)
    {
        for (Exit e : exits)
        {
            if(e.getName().equals(exitName))
            {
                return true;
            }
        }
        return false;
    }
    
    public Feature getFeature(String id)
    {
        for(Feature f : features)
        {
            if (f.getId().equals(id))
            {
                return f;
            }
        }
        return null;
    }
    
    public Feature getFeatureByName(String name)
    {
        for(Feature f : features)
        {
            if (f.getName().equals(name))
            {
                return f;
            }
        }
        return null;
    }

    public boolean hasFeature(String name)
    {
        for (Feature f : features)
        {
            if(f.getName().equals(name))
            {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Feature> getFeatures()
    {
        return features;
    }
    
    public Item getItem(String id)
    {
        for(Item i : items)
        {
            if (i.getId().equals(id))
            {
                return i;
            }
        }
        return null;
    }
    
    public Item getItemByName(String name)
    {
        for(Item i : items)
        {
            if (i.getName().equals(name))
            {
                return i;
            }
        }
        return null;
    }
    
    public ArrayList<Item> getItems()
    {
        return items;
    }

    public void removeItem(String itemName)
    {
        for (Item item : items)
        {
            if(item.getName().equals(itemName))
            {
                items.remove(item);
            }
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean hasEquipment(String name)
    {
        for (Equipment equipment : equipment)
        {
            if(equipment.getName().equals(name))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean hasItem(String itemName)
    {
        for (Item item : items)
        {
            if(item.getName().equals(itemName))
            {
                return true;
            }
        }
        return false;
    }
    
    public void setDescription(String description)
    {
        description = description;
    }
    
    public void setName(String Name)
    {
        name = Name;
    }
  
    @Override
    public String toString() {
        String out = "[" + id + "] Room: " + name + "\nDescription: " + description + "\nIn the room there is: ";
        for (Item i : this.items) {
            out += i + "\n";
        }
        for (Equipment e : this.equipment) {
            out += e + "\n";
        }
        for (Feature f : this.features) {
            out += f + "\n";
        }
        for (Exit e : this.exits) {
            out += e + "\n";
        }
        return out + "\n";
    }
}
