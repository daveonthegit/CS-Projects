package Point;

public class TriangleRunner {
    public static void main(String[] args) {
        Point p1 = new Point(350,100);
        Point p2 = new Point(500,100);
        Point p3 = new Point(600,400);
        Triangle t1 = new Triangle(p1,p2,p3);
        System.out.println("Area:" + t1.getArea());
        System.out.println(t1.toString());
        System.out.println("Perimeter:" + t1.getPerimeter());
        t1.setP2(p3);
        t1.setP3(p2);
        System.out.println(t1.getDistance(t1.p1, t1.p2));
        System.out.println("Perimeter:" + t1.getPerimeter());
        System.out.println("Area:" + t1.getArea());
        System.out.println(t1.toString());
    }
}
