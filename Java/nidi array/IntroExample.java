import java.util.Scanner;

public class IntroExample
{
   public static void main(String[] args)
   {
      //Create a 2D integer array by asking the user how many rows and columns they would like
      Scanner input = new Scanner(System.in);
      System.out.println("This is an intro to 2D arrays exercise.");
      System.out.print("Enter many rows would you like your array to be: ");
      int rows = input.nextInt();
      System.out.print("Enter many columns would you like your array to be: ");
      int columns = input.nextInt();
      System.out.println("Now we'll create the 2D array with "+rows+" rows, and "+columns+" columns.");
      //declare and initialize (with "new") the array here
      int[][] intArr = new int[rows][columns];
            
      //fill it with random integers from 0 to 9
      for (int i = 0; i <intArr.length; i++) {
         for (int j = 0;j <intArr[i].length; j++) {
            intArr[i][j] = (int)(Math.random()*9);
         }
      }
           
      //Print it out
      for (int i = 0; i <intArr.length; i++) {
         for (int j = 0;j <intArr[i].length; j++) {
            System.out.print(intArr[i][j] + " ");
         }
         System.out.println();
      }
      //Find the sum of all the values
      int allSum = 0;
      for (int i = 0; i <intArr.length; i++) {
         for (int j = 0;j <intArr[i].length; j++) {
            allSum+= intArr[i][j];
         }
      }
      System.out.println("Sum of all values: " + allSum);
      //Find the sum of each individual row
      for (int i = 0; i <intArr.length; i++) {
         int rowSum = 0;
         for (int j = 0;j <intArr[i].length; j++) {
            rowSum+= intArr[i][j];
         }
         System.out.println("Sum of all values in row"+ i +": " + rowSum);
      }

      //Find the sum of each individual column
       for (int i = 0; i <columns; i++) {
         int columnSum = 0;
         for (int j = 0;j <intArr.length; j++) {
            columnSum+= intArr[j][i];
         }
         System.out.println("Sum of all values in column"+ i +": " + columnSum);
      }
   }
}

      