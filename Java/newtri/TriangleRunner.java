public class TriangleRunner
{
   public static void main(String[] args)
   {
      Point p1 = new Point(0.0,0.0);
      Point p2 = new Point(3.0,0.0);
      Point p3 = new Point(3.0,4.0);
             double c = 1.0;
        System.out.println(Math.asin(c));
 
      Triangle t1 = new Triangle(p1,p2,p3);
      System.out.print(t1);
      System.out.println("p1.distance(p2) = "+p1.distance(p2));
      System.out.println("p2.distance(p3) = "+p2.distance(p3));
      System.out.println("p3.distance(p1) = "+p3.distance(p1));
      System.out.println("t1.perimeter() = " + t1.perimeter());
      Triangle t2 = new Triangle();
      System.out.print(t2);
      System.out.println(t2.distance());
      System.out.println(t1.angles());
   }
}