package BMI;
import java.util.*;
public class BMIRunner {
    public static void main(String[] args){
        BMI bmi = new BMI();
        double lbs = 0;
        double in = 0;
        double kg = 0;
        double m = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Imperial or Metric?");
        if (scan.nextLine().equals("Imperial")) {
            System.out.println("Enter your weight:");
            lbs = scan.nextDouble();
            System.out.println("Enter your height:");
            in = scan.nextDouble();
            System.out.println("Your BMI is:" + bmi.Imperial(lbs, in));
        } else {
            System.out.println("Enter your weight:");
            kg = scan.nextDouble();
            System.out.println("Enter your height:");
            m = scan.nextDouble();
            System.out.println("Your BMI is:" + bmi.Calculate(kg,m));
        }
        scan.close();
    }

}
