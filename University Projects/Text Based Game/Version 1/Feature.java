package org.uob.a1;

public class Feature 
{
    private String featureName;
    private String featureDescription;
    private Room room;
    private Item item;

    public Feature(String featureName, String featureDescription, Room room, Item item)
    {
        this.featureName = featureName;
        this.featureDescription = featureDescription;
        this.room = room;
        this.item = item;
    }

    public String getFeatureDescription()
    {
        return featureDescription;
    }

    public String getName()
    {
        return featureName;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public Item getItem()
    {
        return item;
    }
}
