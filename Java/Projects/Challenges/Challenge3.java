package Projects.Challenges;
import java.util.*;
//David Xiao, Challenge3
/* Write a program that asks the user for 5-digit integer, takes the number and increments all digits by 1, then prints the new number.
For digits that are 9, the program should increment to 0.  For example, the user should be able to provide 25497 and the program should print 36508.*/
public class Challenge3 {
    public static void main(String[] args) {
        System.out.println("Please insert a 5-digit integer:");
        Scanner scan = new Scanner(System.in);
        int fiveDigit = scan.nextInt();
        scan.close();
        String digitS = String.valueOf(fiveDigit);
        String digitIncreased = "";
        for (int i = 0; i < digitS.length(); i++) {
            int digit = Character.digit(digitS.charAt(i), 10);
            if (digit == 9) {
                digit = 0;
            } else {
                digit += 1;
            }
            digitIncreased += digit;
        }
        System.out.println(digitIncreased);
    }
}