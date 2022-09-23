package cowClass;
/* Cow.java
 * @author David
 * @since 11/18/20
 * This is a class that creates a cow people can milk.
 */
public class Cow {
    // *************************************
    // Fields
    // *************************************
    private int MN = 0; //MN represents number of times cow has been milked
    private String type = ""; //type of cow
    private String sound = ""; // cow noise
    // *************************************
    // Constructor
    // *************************************
    public Cow(String cowtype, String noise) { //constructor, 
        type = cowtype; //@param String cowtype sets type to cowtype,
        sound = noise; //@param String noise sets sound to noise,
    }
    // *************************************
    // Methods
    // *************************************
    public String getType(){ //returns type of the cow
        return type;
    }
    public String getSound() { //returns the sound of the cow
        return sound;
    }
    public int getNumMilkings() { //returns amount of times cow has been milked.
        return MN;
    }
    public void milkCow(){  // milks cow by incrementing MN;
        MN++;
    }
}
