package WhileandFor;

public class MultiplicationTable {
    public static void main(String [] args) {
        System.out.println("            Multiplication Table");
        System.out.println("        1   2   3   4   5   6   7   8   9");
        System.out.print("------------------------------------------");
        for (int i = 1; i < 10; i ++) {
            System.out.print("\n" + i +" |  ");
            for (int a = 1; a < 10; a ++) {
                int b = (i*a);
                if (b > 9) {
                    System.out.print("  " + b);
                } else {
                    System.out.print("   " + b);
                }
            }
        }
    }
}
