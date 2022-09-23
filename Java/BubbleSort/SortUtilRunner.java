package BubbleSort;
import java.util.*;
public class SortUtilRunner {
   public static void main (String[] args) {
     ArrayList<Integer> testAL = SortUtil.randomIntegerList(10,10);
     System.out.println("randomIntegerList(10,10) = "+testAL);
     ArrayList<Integer> testAL2 = SortUtil.copyIntegerList(testAL);
     System.out.println("Are testAL and testAL2 the same: " + SortUtil.sameSum(testAL,testAL2));
     ArrayList<Integer> testAL3 = SortUtil.randomIntegerList(10,10);
     System.out.println("Is testAL3 sorted: " + SortUtil.isSorted(testAL3));
     SortMethods.bubbleSort(testAL3);
     System.out.println("Is testAL3 sorted: " + SortUtil.isSorted(testAL3));
     ArrayList<Integer> testAL4 = SortUtil.randomIntegerList(10,10);
     System.out.println("Is testAL4 sorted: " + SortUtil.isSorted(testAL4) + testAL4);
     SortMethods.selectionSort(testAL4,0);
     System.out.println("Is testAL4 sorted: " + SortUtil.isSorted(testAL4) + testAL4);
     ArrayList<Integer> testAL5 = SortUtil.randomIntegerList(10,10);
     System.out.println("Is testAL5 sorted: " + SortUtil.isSorted(testAL5) + testAL5);
     SortMethods.insertSort(testAL5);
     System.out.println("Is testAL5 sorted: " + SortUtil.isSorted(testAL5) + testAL5);
     
     for (int i = 10; i<1001;) {
         ArrayList<Integer> testAL6 = SortUtil.randomIntegerList(i,10);
         if (i == 10) {
            i*=10;
         } else {
          i+=100;
         }
         SortMethods.bubbleSort(testAL6);
     }
   }
}