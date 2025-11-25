package org.uob.a2.gameobjects;

public class UseInformation 
{
    public boolean isUsed; 
    public String action;
    public String target; 
    public String result;
    public String message;
    
    public UseInformation(boolean isUsed, String action, String target, String result, String message)
    {
        this.isUsed = isUsed;
        this.action = action;
        this.target = target;
        this.result = result;
        this.message = message;
    }

    public String getAction()
    {
        return action;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public String getResult()
    {
        return result;
    }
    
    public String getTarget()
    {
        return target;
    }
    
    public boolean isUsed()
    {
        return isUsed;
    }
    
    public void setAction(String Action)
    {
        action = Action;
    }
    
    public void setMessage(String Message)
    {
        message = Message;
    }
    
    public void setResult(String Result)
    {
        result = Result;   
    }
    
    public void setTarget(String Target)
    {
        target = Target;
    }
    
    public void setUsed(boolean IsUsed)
    {
        isUsed = IsUsed;
    }
    
    @Override
    public String toString() 
    {
        return "UseInformation{" +
                "isUsed=" + isUsed +
                ", action='" + action + '\'' +
                ", target='" + target + '\'' +
                ", result='" + result + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
