import java.util.*;
public class RandomStringChooser {
   private String[] sA;
   HashMap<String, Boolean> sMap = new HashMap<String, Boolean>();
   public RandomStringChooser(String[] wordArray) {
      sA = wordArray;
      for (String k:sA) {
         sMap.put(k,false);
      }
   }
   public String getNext() {
      boolean got = false;
      int tries = 0;
      int rand;
      while (got==false) {
         tries++;
         rand = (int) (Math.floor(Math.random()*sA.length));
         if (sMap.get(sA[rand])==false) {
            sMap.put(sA[rand],true);
            got = true;
            return sA[rand];
         }
          if (tries > sA.length) {
            got = true;
         }
      }
      return "NONE";
   }
}