import java.util.HashMap;

public class ArrayAlgorithms
{
  public static int findMax(int[] array)
  {
    int max = 0;
    for (int z:array) {
      if (z > max) {
         max = z;
      }
    }
    return max;
  }
  public static int findMin(int[] array)
  { int min = 999999999;
    for (int c: array) {
      if (c < min) {
         min = c;
      }
    }
    return min;
  }
  public static String print(int[] array)
  {
   String pr = "";
   for (int x:array) {
      pr+= x + " ";
   }
    return pr;
  }
  public static int findSum(int[] array) {
      int sum = 0;
      for (int n:array) {
         sum+= n;
      }
   return sum;
  }
  public static String reverseArray(int[] array) {
   int[] a2 = new int[array.length];
   int i = array.length-1;
      for (int l:array) {
         a2[i] = l;
         i--;
      }
   return print(a2);
   }
  public static int findMode(int[] array) {
   HashMap<Integer, Integer> numA = new HashMap<Integer, Integer>();
   for (int o: array ) {
      if (numA.containsKey(o)) {
         numA.put(o, numA.get(o)+1);
      } else {
         numA.put(o, 1);
      }
   }
   int key = 0;
   int most = 0;
   for (int t:numA.keySet()) {
      if (numA.get(t) > most) {
         key = t;
         most = numA.get(t);
      }
   }
   return key;
   }
  public static int findIndex(int[] array, int element) {
      int i = 0;
      while (i <array.length) {
         if (array[i] == element) {
            break;
         }
      i++;
      }
      return i;
   }         
  public static int findAverage(int[] array) {
   int avg = 0;
      for (int p:array) {
         avg+=p;
      }
   avg/= array.length;
   return avg;
  }
  public static String findOdd(int[] array) {
   int[] odd;
   int indexes = 0;
   for (int p: array) {
      if (p%2==1) {
         indexes++;
      }
   }
   odd = new int[indexes];
      indexes = 0;
      for (int p: array) {
         if (p%2==1) {
            odd[indexes] = p;
            indexes++;
         }
      }
      return print(odd);
   }
   public static boolean hasDupe(int[] array) {
      HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
      for (int b:array) {
         if (nums.containsKey(b)) {
            return true;
         } else {
            nums.put(b, 1);
         }
      }
      return false;
   }
   public static String findCons(int[] array) {
      String consPairs = "";
      int pairs = 1;
      for (int i = 0; i <array.length; i++) {
         if (i+1>= array.length) {
            break;
         }
         if (array[i]+1 == array[i+1]) {
            consPairs+= "Pair " + pairs + ": " + array[i] +", " + array[i+1]+ " ";
            pairs++;
         }
      }
      return consPairs;
   }
   public static int numBet(int[] array, int a, int b) {
      int count = 0;
      for (int j:array) {
         if (j > a && j <b) {
            count++;
         }
      }
      return count;
   }
   public static String shiftRight(int[] array) {
      int temp = 0;
      int temp2 = 0;
      int[] arr2 = new int[array.length];
      for (int i = 0; i<arr2.length;i++) {
         arr2[i] = array[i];
      }
      for (int d = 0; d< arr2.length; d++) {
         if (d == 0) {
            temp = arr2[d];
            arr2[d] = arr2[arr2.length-1];
         } else {
            temp2 = arr2[d];
            arr2[d] = temp;
            temp = temp2;
         }
         if (d == arr2.length-1) {
            break;
         }
      }
      return print(arr2);
   }
   public static String shiftLeft(int[] array) {
        int f=array[0];
        int[] arr2 = new int[array.length];
        for (int i = 0; i<arr2.length;i++) {
            arr2[i] = array[i];
        }
        int ind=1;
        for(;ind<arr2.length;ind++){
            arr2[ind-1]=arr2[ind];
        }       

        arr2[ind-1]=f;
    
      
      return print(arr2);
   }
}