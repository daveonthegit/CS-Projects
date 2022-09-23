/** Youfll have to add the JavaDocs comments for the class here! 
*/
 public class PrimitiveTypes
{
  /** Displays an example of a string literal that
   *  uses escape  characters to display the single
   *  quote the double quote, the new line and the tab.
   */
   public static void stringLiterals(){
   String stringLiterals = "\' j \" k \n bye \t hi";
   System.out.println(stringLiterals);
   }
 
  /** Displays the three primitive types and
   *  their ranges used in the AP Java A course.
   */  
   public static void primitiveTypes(){
   System.out.println("The AP Java A course uses the primitive types, integers, doubles, and booleans. Which each hold different values. \nIntegers hold integer values such as -2, 3, -76, and 20393." +
   " \nDoubles hold floating point numbers such as 6.3, -0.5, and 3423.2342");
   }
  /** Displays the five arithmetic operators.
   *  Gives examples of division and modulo.
   *  Gives an example of order of operations.
   */
   public static void arithmeticOperators(){
   System.out.println("The five arithmetic operators are /,*,+,-,%.");
   System.out.println("6 divided by 3 is " + (6/3));
   System.out.println("9 divided by 3 is " + (9/3));
   System.out.println("5 modulo 3 is " + (5%3));
   System.out.println("14 modulo 7 is " + (14%7));
   System.out.println("An example of order of operations is 9/3+5*2/10 which is equal to " + (9/3+5*2/10));
   }
 
  /** Displays and explains the five compound assignment operators.
   *  Displays and explains the increment and decrement
   *  for both prefix and postfix form.
   */
   public static void compoundAssignmentOperators(){
   System.out.println("The five compound assignment operators are /=, *=, +=, -=, %=. /n/= sets the value to the left by the value divided by the value to the right. " +
   "/n*= sets the value to the left by the value multiplied by the value to the right./n-= sets the value to the left by the value subtracted by the value to the right." +
   "/n+= sets the value to the left by the value added to the value to the right. /n%= sets the value to the left to the remainder of the value divided by the value to the right.");
   System.out.println("The increment assignment operator ++, and decrement -- decrease or increase the value being assigned by 1. In prefix form, such as y = ++x;, x is increased by 1 first, then y is set to the value of x.");
   System.out.println("In postfix form, such as y = x++;, y is assigned to the value of x, then x increases by 1. This applies for decrement as well.");
   }
 
   /** Displays and explains casting between two different data types.
    *  Displays important examples regarding precision. 
    *  Displays how proper correct rounding can be implemented.
    */
    public static void castingVariables(){
    System.out.println("Casting between two different data types allows for you to change a value from a smaller data type to a larger one or vice versa. An example is (int)(5.0/2.0) which gives you: ");
    System.out.print((int) (5.0/2.0));
    System.out.println("This is because, with the parenthesis around the operation (5.0/2.0), first 5.0 is divided by 2.0, which gives you the double 2.5.");
    System.out.print("However, then it is casted into an integer value, dropping the decimal, giving you 2");
    System.out.println("This is also important for precision, as if you were to do an operation using only integer values, you'd only be returned an integer so, you need to cast a double onto them to get a more precise result.");
    System.out.println("This is shown in the examples 5/2, and (double) 5.0/2, which I will now print.");
    System.out.println("5/2 is : " + (5/2));
    System.out.println("(double) 5/2 is : " + ((double) 5/2));
    System.out.println("This shows how casting is necessary in order to get precise results");
    System.out.println("Using casting, you can also do rounding. Which I will now demonstrate");
    System.out.println("5.0/2.0 is 2.5, so with an if loop you can check if the resulting value's decimal is greater than or less than .5 using a % operator. Then add .5 and cast and integer onto it after, which gives you: ");
    double x = 5.0/2.0;
    if (x%1 >=.5) {
      x = (int) (x+.5);
    }
    System.out.println(x);
    } 
  }
