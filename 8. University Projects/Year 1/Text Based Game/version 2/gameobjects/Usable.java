package org.uob.a2.gameobjects;

public interface Usable 
{
    public String getName();
    public void setUseInformation(UseInformation useInfo);
    public UseInformation getUseInformation();
}