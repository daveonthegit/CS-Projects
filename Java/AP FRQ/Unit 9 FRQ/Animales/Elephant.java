public class Elephant extends Herbivore {
   double tuskLength;
   public Elephant(String n, double tL){
      super("elephant", n); 
      tuskLength = tL;
   }
   public String toString() {
      return super.toString() + " with tusks " + tuskLength + " meters long";
   }
}