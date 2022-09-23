public class APLine {
   int a, b, c;
   double slope;
   public APLine(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
      slope = (double) -a/b;
   }
   public double getSlope() {
      return slope;
   }
   public boolean isOnLine(int x, int y) {
      if ((a*x)+(b*y)+c ==0) {
         return true;
      }
      return false;
   }
   
   public static void main (String[] args) {
   APLine line1 = new APLine(5,4,-17);
   double slope1 = line1.getSlope();
   boolean onLine1= line1.isOnLine(5,-2);
   System.out.println("Slope1: " + slope1+ " onLine1: " +onLine1);
   APLine line2 = new APLine(-25,40,30);
   double slope2 = line2.getSlope();
   boolean onLine2= line2.isOnLine(5,-2);
   System.out.println("Slope2: " + slope2+ " onLine1: " +onLine2);
   }
}