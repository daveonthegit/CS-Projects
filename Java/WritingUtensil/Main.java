import java.util.*;

class Main {
  public static void main(String[] args) {
    WritingUtensil w = new WritingUtensil("green");
       Marker m = new Marker("red");
       Pen p = new Pen("blue");
       GelPen g = new GelPen("pink");
       Pen h = new GeliPen("red");
       
       ArrayList<WritingUtensil> bagOfStuff = new ArrayList<>();
       bagOfStuff.add(w);
       bagOfStuff.add(m);
       bagOfStuff.add(p);
       bagOfStuff.add(g);
       int i = 1; 
       for (WritingUtensil thing: bagOfStuff)
       {
          thing.write("message" + i); 
          i++;
       }
      /** This should have this output:
      WritingUtensil writing "message1" in green.
      Marker writing "message2" in red.
      Pen writing "message3" in blue.
      GelPen writing "message4" in gel-looking pink.
      */
  }
}