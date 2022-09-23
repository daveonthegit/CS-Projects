public class ArraysOfObjects
{

  public static void main(String[] args)
  {
     Triangle[] triAr = new Triangle[100];
     Point p1,p2,p3;
     for (int i = 0; i < triAr.length; i++)
     {
        //Make three random points - using a "do-while" to make sure there are
        //no repeats.
        do {
             p1 = new Point((int) (Math.random()*6), (int) (Math.random()*6));
             p2 = new Point((int) (Math.random()*6), (int) (Math.random()*6));
             p3 = new Point((int) (Math.random()*6), (int) (Math.random()*6));
        } while (p1.equals(p2) || p1.equals(p3) || p3.equals(p2));
        
        //Construct a new Triangle from the points and put them into the array.
        triAr[i] = new Triangle(p1,p2,p3);
     }
   /* for (Triangle tri:triAr)
     {
        System.out.println(tri);
     }*/
     //Count the right triangles
     int count = 0;
    for (Triangle tri:triAr) {
        if (tri.isRight()) {
            count++;
        }
    }
    System.out.println("Right Triangles: " + count + " or " + count +"%");

     //Find the average perimeter of the whole list.
      int avg = 0;
      for (Triangle tri:triAr) {
         avg+=tri.perimeter();
      }
      avg/=100;
      System.out.println("The average perimeter is: " + avg);
     //Look for your favorite property in the array of Triangles
    count = 0;
    for (Triangle tri:triAr) {
        if (tri.isosceles()) {
            count++;
        }
    }
    System.out.println("Isosceles Triangles: " + count + " or " + count +"%");
     //Do something similar with Fraction 
     //Step 1: make an array of Fractions
           Fraction[] fraAr = new Fraction[100];
     int nume,demo;
     for (int i = 0; i < fraAr.length; i++)
     {
        nume = (int)(Math.random()*100);
        demo = (int)(Math.random()*100);
        fraAr[i] = new Fraction(nume,demo);
     }
     //Step 2: Construct random Fractions to fill out the array
     /*for (Fraction f:fraAr)
     {
        System.out.println(f);
     */
     //Step 3: Find how many of the Fractions have your favorite property.
     count = 0;
     for (Fraction b:fraAr) {
         if (b.mixFra()){
            count++;
         }
     }
     System.out.println("There are " + count + " mixed fractions.");
  }
}