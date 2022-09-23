import java.util.Scanner;
//Fahrenheit to Celsius by David Xiao
public class FahrenheitToCelsius
{
   public static void main(String[] args)
   {
      System.out.print("Enter a temperature in fahrenheit ");
      Scanner scan = new Scanner(System.in);
      double fahrenheit = scan.nextDouble();
      System.out.println("Fahrenheit = "+fahrenheit);
      double celsius = (fahrenheit-32) * 5/9;
      System.out.println("Celsius = "+celsius);
   }
}