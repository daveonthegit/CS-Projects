package WhileandFor;
import java.util.*;
public class Sentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 1;
        for (int x = -1; x != 0; x = input.nextInt()) {
            System.out.println("\n Enter an integer (the input ends if it is 0):");
            total += x;
        }
        System.out.println("The sum is " + total);
    }
}
