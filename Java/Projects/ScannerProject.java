package Projects;
import java.util.*;
//David Xiao, this is a basic grade average calculator.
public class ScannerProject {
    public static void main(String[] args){ 
        System.out.println("How many classes do you have?");
        Scanner scan = new Scanner(System.in);
        int classes = scan.nextInt();
        int gradeSum = 0;
        System.out.println("Insert your " + classes + " grades:");
        for (int i = 0 ; i < classes; i++){
            gradeSum += scan.nextInt();
        }
        double gradeAverage = (double) gradeSum / classes;
        System.out.println("Your grade average is " + gradeAverage);
        scan.close();
    }
}