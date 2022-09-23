package Die;
/** A class for running and testing Die
  * All three constructors will be tested.  
  * Create a Die using each of the constructors.
  * print the value for a roll for each of the Die.
  * */
public class DieRunner{
    public static void main(String[] args)
    {
    Die d1 = new Die();
    System.out.println(d1.roll());
    Die d2 = new Die(8);
    System.out.println(d2.roll());
    Die d3 = new Die(8, 2);
    System.out.println(d3.roll());
    }
}