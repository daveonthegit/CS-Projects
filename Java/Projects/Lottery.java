package Projects;
import java.util.*;
public class Lottery {
    public static void main(String[] args) {
        int lottoDigit1 =  (int) (Math.random()*10);
        int lottoDigit2 =  (int) (Math.random()*10);
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter your two digit number:");
        int guess = answer.nextInt();
        int aD1 = guess/10;
        int aD2 = guess%10;
        if ((aD1 == lottoDigit1) && (aD2 == lottoDigit2)) {
            System.out.println("You've won $10.");
        } else if ((aD2 == lottoDigit1) && (aD1 == lottoDigit2)) {
            System.out.println("You've won $3.");
        } else if (((aD1 == lottoDigit1) || (aD1 == lottoDigit2))|| ((aD2 == lottoDigit2) || (aD2 == lottoDigit1))) {
            System.out.println("You've won $1.");
        } else {
            System.out.println("You lost.");
        }
    }
}
