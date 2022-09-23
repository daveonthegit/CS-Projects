package BubbleSort;
import java.util.*;
import java.lang.*;
public class SortMethods {
  public static void bubbleSort(ArrayList<Integer> al) {
      long sTime = System.currentTimeMillis();
      SortUtil.swaps =0;
      SortUtil.compares = 0;
      do {
         for (int i =0; i<al.size();i++) {
            SortUtil.compares++;
            if (i+1<al.size()&&al.get(i) > al.get(i+1)) {
               SortUtil.swap(al,i,i+1);
               SortUtil.swaps++;
            }
         }
      } while (SortUtil.isSorted(al) == false);
      long eTime = System.currentTimeMillis();
      long time = eTime-sTime;
      System.out.println("Swaps: " + SortUtil.swaps + " Compares: " + SortUtil.compares + " Time: " + time + " Size: " + al.size());
      
  }
  public static void selectionSort(ArrayList<Integer> al, int startInd) {
      SortUtil.swaps =0;
      SortUtil.compares = 0;
      int sInd = startInd;
      do {
         Integer[] minVal = {startInd,Integer.MAX_VALUE};
         for (int i = sInd; i<al.size();i++) {
            SortUtil.compares++;
            if (al.get(i) < minVal[1]) {
               minVal[1] = al.get(i);
               minVal[0] = i;
            }
         }
         SortUtil.swap(al,minVal[0].intValue(),sInd);
         SortUtil.swaps++;
         sInd++;
      } while (SortUtil.isSorted(al) == false);
      System.out.println("Swaps: " + SortUtil.swaps + " Compares: " + SortUtil.compares);
  }
  public static void insertSort(ArrayList<Integer> al)
  {
      SortUtil.swaps =0;
      SortUtil.compares = 0;
     for(int i = 0; i < al.size(); i++){
        SortUtil.compares++;
        Integer value = al.remove(i);
        SortUtil.insertValue(value, i, al);
        
     }
     System.out.println("Swaps: " + SortUtil.swaps + " Compares: " + SortUtil.compares);
  }
}  