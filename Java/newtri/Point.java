public class Point
{
  private double x;
  private double y;
  
  public Point(double x, double y)
  {
      this.x = x;
      this.y = y;
  }
  public Point() {
   this(0.0,0.0);
 }  
   public void setX(double x) 
   { 
       this.x = y;
   }
   
   public void setY(double y)
   {
       this.y = y;
   }
   
   public double getX()
   {
      return x;
     
   }
   
   public double getY()
   {
       return y;
   }
   public double distance(Point other) {
      return Math.sqrt(Math.pow(other.y-this.y,2) + Math.pow(other.x-this.x,2));
   }
   public String toString()
   {
      return "(" + getX() + ","+getY()+")";
   }
}