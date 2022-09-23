public class Swapping{
   public static void swapPairs(String[] array) {
      String temp = "";
      for (int i = 0; i<array.length; i+=2){
         if(i+1>=array.length) {
            break;
         }
         temp = array[i];
         array[i] = array[i+1];
         array[i+1] = temp;
      }
   }
   public static void main(String[] args) {
      String[] a = {"four", "score", "and", "seven", "years", "ago"};
      swapPairs(a);
      for (String b:a) {
      System.out.println(b + " ");
      }
   }
}