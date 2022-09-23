package Point;

public class Point {
    private double x;
    private double y;
    public Point(double setX, double setY){
        x = setX;
        y = setY;
    }
    public boolean equals(Point a) {
        if (x == a.getX() && y == a.getY()){
            return true;
        }
        return false;
    }
    public void copy(Point a) {
        x = a.getX();
        y = a.getY();
    }

    public void setX(double setX) { 
         x = setX;
    }
     
    public void setY(double setY){
         y = setY;
        }
     
    public double getX(){
        return x;
    }
     
    public double getY(){
         return y;
    }
     
    public String toString(){
        return "("+getX()+","+getY()+")";
    }
}

