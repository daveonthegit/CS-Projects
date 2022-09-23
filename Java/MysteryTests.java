import java.util.*;
public class MysteryTests {
   public static void mysteryone(ArrayList<Integer> list) {  
      for (int i = list.size() -1;i>0;i--) {
         if(list.get(i) <list.get(i-1)) {
            int element = list.get(i);
            list.remove(i);
            list.add(0,element);
         }
      }
      System.out.println(list);
   }
   public static void main (String[] args) {
      ArrayList<Integer> one = new ArrayList<Integer>();
      one.add(2);
      one.add(6);
      one.add(1);
      one.add(8);
      mysteryone(one);
   }
}