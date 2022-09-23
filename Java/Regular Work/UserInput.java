import java.util.Scanner;
//UserInput by D.X
public class UserInput {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     string n1;
     string n2;
     string n3;
     
     System.out.print("Input the first name:");
    n1 = scan.nextString();
    System.out.print("Input the second name:");
    n2 = scan.nextString();
    System.out.print("Input the last name:");
    n3 = scan.nextString();
    scan.close();
    }
}