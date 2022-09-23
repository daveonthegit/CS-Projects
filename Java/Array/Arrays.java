import java.util.*;

public class Arrays {
   public static void main(String[] args) {
      double average = 0;
      int count = 0;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of items: ");
      double[] a1 = new double[scan.nextInt()];
      System.out.print("Enter the numbers: ");
      for (double j:a1) {
         j = scan.nextDouble();
         average+=j;
      }
      average/=a1.length;
      System.out.println("Average is " + average);
      for (double b:a1) {
         if (b>average) {
            count++;
         }
      }
      System.out.println("Numbers of elements above the average is " + count);
   }
}
      
      