import java.util.*;

public class UserName
{
   // The list of possible user names, based on a user’s first and last names and initialized by the constructor.
   private ArrayList<String> possibleNames = new ArrayList<String>();
   private String fName;
   private String lName;
   /** Constructs a UserName object as described in part (a).
    * Precondition: firstName and lastName have length greater than 0   
    * and contain only uppercase and lowercase letters.
    */
   public UserName(String firstName, String lastName)
   {
      fName = firstName;
      lName = lastName;
      for(int i = 1; i <= firstName.length(); i++)
      {
         String possible = lastName.toLowerCase() + firstName.substring(0, i); //Adds possible usernames with the last Name and a substring of firstName.
         possibleNames.add(possible);
      }
   }
     
   
   /** Returns true if arr contains name, and false otherwise. */
   public boolean isUsed(String name, String[] arr)
   {
      for (String k:arr) {
         if(k.equals(name)){ //Checks each string in the array to the name string.
            return true;
         }
      }
      return false; 
   }
   
   /** Removes strings from possibleNames that are found in usedNames as described in part (b).
     */
    public void setAvailableUserNames(String[] usedNames)
   {
      for (int i = possibleNames.size()-1;i >=0;i--) {
         if(isUsed(possibleNames.get(i),usedNames)) {
            possibleNames.remove(i);                     // removes any strings that are already used in the usedNames array.
         }
      }
   }
   
   /** gets contents of possibleNames */
   //put the method for that here...
   public String toString(){
      return fName+lName+"PossibleNames = " + possibleNames; //Returns a string version of possibleNames.
   }
   public static void main(String[] args)
   {
      UserName p1 = new UserName("john", "Smith");
      System.out.println(p1);
      String[] used = {"harta", "hartm", "harty"};
      UserName p2 = new UserName("mary", "Hart");
      System.out.println("Original " + p2);
      System.out.println("resetting available names... with used[] = " +Arrays.toString(used));
      p2.setAvailableUserNames(used);
      System.out.println("After setting " + p2);
      System.out.println("Additional test: ");
      UserName p3 = new UserName("dorothy", "Vaughan");
      System.out.println("Original " + p3);
      used = new String[]{"vaughand","vaughando"};
      System.out.println("resetting available names... with used[] = " +Arrays.toString(used));
      p3.setAvailableUserNames(used);
      System.out.println("After setting " + p3);
   }
}