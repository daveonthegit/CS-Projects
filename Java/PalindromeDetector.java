import java.util.*;
public class PalindromeDetector {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your possible palindrome:");
        String in = input.nextLine();
        String[] ins = in.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        in = "";
        for (String s: ins) {
            in+=s;
        }
        String temp = "";
        System.out.println(in);
        ins = in.split("");
        for (int i = ins.length-1; i > -1 ; i--){
            temp += ins[i];
        }
        System.out.println(temp);
        if (temp.equalsIgnoreCase(in)) {
            System.out.println("Yes: " + temp + " is a palindrome");
        } else {
            System.out.println("No: " + temp + " is not a palindrome");
        }
    }
}
