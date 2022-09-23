public class Main {
   public static void changer (String x, int y) {
   x = x +"peace";
   y = y *2;
   }
   public static void test() {
   String s = "world";
   int n = 6;
   changer(s, n);
   System.out.println(s+" " + n);
   }
   public static void main(String[] args) {
      Worker bob = new Worker(20.0, 40.0);

System.out.println(bob.getEarnings());
   }
}