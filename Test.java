import java.util.*;

public class Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your nationality: ");
    String nationality = input.nextLine();
    switch(nationality) {
      case "British":
        System.out.println("Yer rather schtewpid innit");
        break;
      default:
        System.out.println("Bye.");
    }
  }
}