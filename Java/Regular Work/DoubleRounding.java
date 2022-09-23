import java.util.Scanner;
//David Xiao Double Rounding
public class DoubleRounding {
    public static void main(String[] args){
        System.out.println("Please insert your number you want to round.");
        Scanner scan = new Scanner(System.in);
        double unrounded = scan.nextDouble();
        scan.close();
        int rounded;
        if (unrounded > 0) {
            rounded = (int)(unrounded + 0.5);
            System.out.println("Your rounded number is " + rounded + ".");
        } else if (unrounded < 0) {
            rounded = (int)(unrounded - 0.5);
            System.out.println("Your rounded number is" + rounded + ".");
        } else {
            System.out.println("Your number can't be rounded.");
        }
    }
}