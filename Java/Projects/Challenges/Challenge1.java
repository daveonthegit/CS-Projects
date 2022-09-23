package Projects.Challenges;
import java.util.*;
//David Xiao, Challenge1
/*Challenge: 1. Write a program that welcomes the user by name, asks them to input 3 different numbers, then prints the average of those numbers.
  The user should be able to provide an integer or a decimal value for any of the three values.  For example, the user should be able to provide
   12, 15.6, and 25, and the program should print 17.5333...*/
public class Challenge1 {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.println("Please insert three numbers to average:");
        double numbers = 0;
        for (int i = 0; i < 3; i++){
            numbers += scan.nextDouble();
        }
        double average = numbers / 3;
        System.out.println("Your average is " + average + ".");
        scan.close();
    }
}