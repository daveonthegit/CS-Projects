package WhileandFor;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        int gcd = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter first integer:");
        int num1 = input.nextInt();
        System.out.print("\nEnter second integer:");
        int num2 = input.nextInt();
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
        System.out.print("\nThe greatest common denominator for " + num1 + " and " + num2 + " is " + gcd);
    }
}
