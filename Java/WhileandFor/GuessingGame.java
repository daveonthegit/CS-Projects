package WhileandFor;
import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        int rand = (int) ((Math.random())*100);
        Scanner answer = new Scanner(System.in);
        int a = -1;
        System.out.println("Try and guess a number between 0-100");
        while (a != rand) {
            System.out.print("Enter your guess: ");
            a = answer.nextInt();
            if(a > rand) {
                System.out.println("Your guess is too high!");
            } else {
                System.out.println("Your guess is too low!");
            }
        }
        System.out.println("Yes, the number is " + rand);
    }
}
