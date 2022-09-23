import java.util.*;
import java.text.*;
public class Payroll
{
   DecimalFormat df = new DecimalFormat("#.##");
   private int[] itemsSold; // number of items sold by each employee
   private double[] wages; // wages to be computed in part (b)
   public Payroll(int[] itemzSold) {
      itemsSold = itemzSold;
   }
   /** Returns the bonus threshold as described in part (a).
   */
   public double computeBonusThreshold()
   {

      int[] lowest = {0, Integer.MAX_VALUE}; int[] largest = {0, Integer.MIN_VALUE}; int[] indexes = {0,0};
      double threshold = 0;
      ArrayList<Integer> sold = new ArrayList<Integer>();
      for (int i:itemsSold) {
         sold.add(i);
      }
      for (int i = 0;i<sold.size();i++) {
         if (sold.get(i) < lowest[1]) {
            lowest[0] = i;
            lowest[1] = sold.get(i);
         }
         if (sold.get(i) > largest[1]) {
            largest[0] = i;
            largest[1] = sold.get(i);
         }
      }
      if (largest[0] > lowest[0]) {
         indexes[1] = largest[0];
         indexes[0] = lowest[0];
      } else {
         indexes[1] = lowest[0];
         indexes[0] = largest[0];
      }
         sold.remove(indexes[1]);
         sold.remove(indexes[0]);
      for (int i =0; i<sold.size();i++) {
         threshold+=(sold.get(i)).intValue();
      }
      threshold/=sold.size();
      return Double.valueOf(df.format(threshold));
   }
   public void printWages(){
      for (int i = 0; i <wages.length;i++){
         System.out.println("Employee" + i+ ": " + wages[i] + "$");
         }
   }
   /** Computes employee wages as described in part (b)
   * and stores them in wages.
   * The parameter fixedWage represents the fixed amount each employee
   * is paid per day.
   * The parameter perItemWage represents the amount each employee
   * is paid per item sold.
   */
   public void computeWages(double fixedWage, double perItemWage)
   {
      wages = new double[itemsSold.length];
      double threshold = computeBonusThreshold();
      for (int i = 0; i<itemsSold.length;i++) {
         wages[i] = itemsSold[i]*fixedWage*perItemWage;
         if (itemsSold[i] > threshold) {
            wages[i] *=1.1;
         }
         wages[i] = Double.valueOf(df.format(wages[i]));
      }
   }
 
   // Other instance variables, constructors, and methods not shown.
   public static void main(String[] args) {
      int[] sold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
      Payroll b = new Payroll(sold);
      System.out.println("Bonus Threshold: " + b.computeBonusThreshold());
      b.computeWages(10.0,1.5);
      b.printWages();
     
   }
}
