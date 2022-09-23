public class Animal {
   String diet;
   String species;
   String name;
   public Animal (String d, String s, String n) {
      diet = d;
      species = s;
      name = n;
   }
   public String toString() {
      return name + " the " + species  + " is a " + diet;
   }
}