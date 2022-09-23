package Projects.Challenges;
import java.util.*;
//David Xiao, Challenge2
/* Write a program that asks the user for any 3-digit integer, then prints that number in reverse.
 For example, the user should be able to provide 759 and the program should print 957.*/
public class Challenge2 {
    public static void main(String[] args){
        System.out.println("Insert a 3-digit integer please:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digitOne = num / 100;
        int digitThree = num %10;
        int digitTwo = (num - ((digitOne*100) + digitThree)) / 10;
        System.out.println("Your reversed integer is " + digitThree + digitTwo + digitOne + ".");
        scan.close();
    }
}