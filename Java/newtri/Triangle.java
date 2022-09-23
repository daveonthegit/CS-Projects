public class Triangle
{
public static void main(String[] args)
{
System.out.println("hi!");
}
   private Point p1;
   private Point p2;
   private Point p3;
   
   public Triangle(Point p1,Point p2, Point p3)
   {
     this.p1 = p1;
     this.p2 = p2;
     this.p3 = p3;
   }
   public Triangle() {
      p1 = new Point();
      p2 = new Point();
      p3 = new Point();
   }
   //Getters (aka accessors)
   public Point getP1()
   {
      return p1;
   }
   public Point getP2()
   {
      return p2;
   }
   
   public Point getP3()
   {
      return p3;
   }
   
   //Setters (aka mutators)
   public void setP1(Point p1)
   {
      this.p1 = p1;
   }
   public void setP2(Point p2)
   {
      this.p2 = p2;
   }
   public void setP3(Point p3)
   {
      this.p3 = p3;
   }
   public String angles() {
      double l1 = p1.distance(p2); double l2 = p2.distance(p3); double l3 = p3.distance(p1);
      return "Angle 1: " + Math.toDegrees(Math.acos(l1/l3)) + " Angle 2: " + Math.toDegrees(Math.asin(l2/l3)) + " Angle 3: " + Math.toDegrees(Math.atan(l2/l1));
   }
   public double perimeter()
   {
      return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
   }
   public String distance() {
      return "Side 1: " + p1.distance(p2) + " Side 2: " + p2.distance(p3) + " Side 3: " + p3.distance(p1);
   }
   public String toString()
   {
      return "(" + p1 +","+p2+","+p3+")\n";
   }
}
   
   
   
   