public class Detector{
    static boolean eric = false;
    static boolean issac = false;

    public static String Minisack() {
        if (eric) {
            return "hi";
        }
        if (issac) {
        return "bye";
      }
      return "nye";
    }
    public static void main(String[] args) {
      double x = Math.random();
      if (x > .5) {
        eric = true;
      } else if (x < .2) {
        issac = true;
      }
      System.out.println(Minisack());
  }
}