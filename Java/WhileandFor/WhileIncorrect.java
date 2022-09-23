package WhileandFor;
import java.util.*;

public class WhileIncorrect {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        int a = (int) ((Math.random())*10);
        int b = (int) ((Math.random())*10);
        int sum = a + b;
        System.out.print("What is " + a + "+" + b + "? ");
        int x = answer.nextInt();
        while (x != sum) {
            System.out.print("\n Wrong answer. Try again. What is " + a + "+" + b + "? ");
            x = answer.nextInt();
        }
        System.out.println("You got it!");
    }
}
