package ThingClass;

public class ThingRunner {
    public static void main(String[] args) {
        Thing snack = new Thing("potato chip");
        snack.printMessage();
        snack.getName();
        snack.setName("pizza");
        snack.printMessage();
    }
}
