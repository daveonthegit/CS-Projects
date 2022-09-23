package Point;

public class TriangleRunnerEqualsTests {
    public static void main(String[] args) {
     Point p1 = new Point(0.0,0.0);
     Point p2 = new Point(0.0,3.0);
     Point p3 = new Point(3.0,4.0);
     Point p4 = new Point(0.5,0.5);
     Triangle t1 = new Triangle(p1,p2,p3);
     Triangle t2 = new Triangle(p1, p1, p1);
    System.out.println("p4 = " + p4);
     System.out.println("t1 = "+t1);
     System.out.println("t2 = "+t2);
     t2.copy(t1);
     System.out.println("t2 = " +t2);
     p4.copy(p1);
     System.out.println("p4.equals(p1) is "+p4.equals(p1));
     System.out.println("t2.equals(t1) is "+t2.equals(t1));
     System.out.println("p1.equals(p2) is "+p1.equals(p2));
     System.out.println("p1 == p2 is "+(p1 == p2));
   }
}
