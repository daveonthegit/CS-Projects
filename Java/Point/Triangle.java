package Point;

public class Triangle {
    public Point p1 = new Point(0,0);
    public Point p2 = new Point(0,0);
    public Point p3 = new Point(0,0);
    public void copy(Triangle a) {
        p1.copy(a.p1);
        p2.copy(a.p2);
        p3.copy(a.p3);
    }
    public boolean equals(Triangle a) {
        if (p1.equals(a.p1) && p2.equals(a.p2) && p3.equals(a.p3)) {
            return true;
        }
        return false;
    }
    public Triangle(Point nP1, Point nP2, Point nP3) {
        p1 = nP1;
        p2 = nP2;
        p3 = nP3;
    }
    public Point  getP1(){
        return p1;
    }
    public Point  getP2(){
        return p2;
    }
    public Point  getP3(){
        return p3;
    }
    public void setP1(Point newP1){
        p1 = newP1;
    }
    public void setP2(Point newP2){
        p2 = newP2;
    }
    public void setP3(Point newP3){
        p3 = newP3;
    }
    public double getDistance(Point p1, Point p2) {
        double x2 = p2.getX();
        double x1 = p1.getX();
        double y2 = p2.getY();
        double y1 = p2.getY();
        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
    }
    public double getPerimeter() {
        return getDistance(p2,p1) + getDistance(p3, p2) + getDistance(p1, p3);
    }
    
    public double getArea() {
        double baseLength = getDistance(p1, p2);
        Point midpt = new Point(0,0);
        double bigX;
        double smallX;
        double bigY;
        double smallY;
        double height;
        if (p2.getX() > p1.getX()) {
            bigX = p2.getX();
            smallX =p1.getX();
        } else {
            bigX = p1.getX();
            smallX = p2.getX();
        }
        if (p2.getY() > p1.getY()) {
            bigY = p2.getY();
            smallY =p1.getY();
        } else {
            bigY = p1.getY();
            smallY = p2.getY();
        }
        midpt.setX((bigX-smallX)/2 + smallX);
        midpt.setY((bigY-smallY)/2 + smallY);
        height = getDistance(midpt, p3);
        return (baseLength*height)/2;
    }
    public String toString(){
        return "[" + p1 + ", " + p2 + ", " + p3 + "]\n";
    }
}

