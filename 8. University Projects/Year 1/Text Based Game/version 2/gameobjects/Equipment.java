package org.uob.a2.gameobjects;

public class Equipment extends GameObject implements Usable 
{
    
    protected UseInformation useInformation;

    public Equipment(String id, String name, String description, boolean hidden, UseInformation useInformation)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hidden = hidden;
        this.useInformation = useInformation;
    }

    public void setUseInformation(UseInformation useInformation)
    {
        useInformation = useInformation;
    }
    
    public UseInformation getUseInformation()
    {
        return useInformation;
    }

    public String use(GameObject target, GameState gameState) 
    {
    Room tR = gameState.getMap().getCurrentRoom();

    if (this.useInformation.isUsed()) 
    {
        return "You have already used " + this.name;
    }

    if (target.getId() == null || target.getId().isEmpty() || target.getHidden()) 
    {
        return "Invalid use target";
    }

    if (target.getId().equals(this.useInformation.getTarget())) 
    {
        if (tR.hasGameObjectById(this.useInformation.getResult())) 
        {
            GameObject resultObject = tR.getGameObject(this.useInformation.getResult());
            resultObject.setHidden(false);
        }
        return this.useInformation.getMessage();
    }

    return "Invalid use target";
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + ", useInformation=" + useInformation;
    }
}
