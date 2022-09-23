package ThingClass;
public class Thing {
    String name;
    public Thing(String myName)
    {name = myName;}
    public String getName()
    {return name;}
    /** Sets this Thing’s name to newName*/   
    public void setName(String newName)
    {name = newName;}
    /** Returns a message as described in part (b)*/   
    public void printMessage()
    {System.out.println(name + "_is_great");}
}
