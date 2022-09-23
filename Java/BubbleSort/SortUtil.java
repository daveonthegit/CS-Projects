package BubbleSort;
import java.util.ArrayList;
import java.util.Arrays;
/** 
 * A class for managing the sorting algorithms of the AP Java A course
 */
public class SortUtil
{
  /**
   * Keeps track of the number of swaps
   */
  public static int swaps;
  /**
   * Keeps track of the number comparisons
   */
  public static int compares;
  /** 
   * Swap the two values at index i and j
   * @param al is  ArrayList of type Integer
   * @param i is an index of the ArrayList
   * @param j is an index of the ArrayList
   */
  public static void swap(ArrayList<Integer> al, int i, int j)
  {
       swaps++;
       int temp = al.get(j);
       al.set(j,al.get(i));
       al.set(i,temp);
  }

  /**
   * Checks to see that the order of the ArrayList al is non-descending
   * @param al is an ArrayList of type Integer
   * @return true if the Integers are in non-descending order false otherwise
   */
  public static boolean isSorted(ArrayList<Integer> al)
  {
        boolean sorted = true;
        for (int i = 0; i < al.size();i++) {
            if(i+1 <al.size()&&al.get(i) > al.get(i+1)) {
               sorted = false;
            }
        }
        return sorted;
  }
    
  
  /**
   * Creates an ArrayList of typpe Integer of length arrayLength with the range 0.0..maxVal
   * @param listLength the number of elements of the array
   * @param maxVal each element of the ArrayList has a value in the range 0..maxVal
   * @return an ArrayList of type Integer of length arrayLength
   */
  public static ArrayList<Integer> randomIntegerList(int listLength, Integer maxVal)
  {
     ArrayList<Integer> rand = new ArrayList<Integer>();
         for(int i = 0; i<listLength;i++) {
               rand.add((int)(Math.random()*(maxVal+1)));
         }
     return rand;
  }
  
  /**
   * Checks that the ArrayLists have the same sum
   * (it's a simple way to check if our sort is working correctly)
   * @param a an ArrayList of type Integer
   * @param b an ArrayList of type Integer
   * @return true if they have the same sum false otherwise 
   * Precondition: a and b have the same length
   */
  public static boolean sameSum(ArrayList<Integer> a, ArrayList<Integer> b)
  {
      int sum1 =0; int sum2 =0;
         for (Integer k:a) {
            sum1+=k.intValue();
         }
         for (Integer k:b) {
            sum2+=k.intValue();
         }
      if (sum1==sum2) {
         return true;
      }
      return false;
    }
   /**
   * Copy an ArrayList of type Integer.  To be used for checking the correctness sort
   * @param al an ArrayList of type Integer
   * @return an ArryList of type Integer that is a copy of al
   */
  public static ArrayList<Integer> copyIntegerList(ArrayList<Integer> al)
  {
    ArrayList<Integer> copy = new ArrayList<Integer>(); 
    for (Integer b:al) {
      copy.add(b);
    }
    return copy;
  }
  public static void insertValue(Integer value, int stopIndex, ArrayList<Integer> al)
  {
     for(int i = 0; i < stopIndex; i++){
        SortUtil.swaps++;
        if(value < al.get(i)){
           al.add(i, value);
           return;
        }
     }
     al.add(stopIndex, value);
  }
  public static void main(String[] args)
  {
     ArrayList<Integer> testAL = randomIntegerList(10,10);
     System.out.println("randomIntegerList(10,10) = "+testAL);

  }
}