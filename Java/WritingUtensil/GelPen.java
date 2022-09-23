public class GelPen extends Pen {
   public GelPen(String color) {
      super(color);
   }
   public void write(String message)
   {
      System.out.println(this.getClass().getSimpleName()+ " writing \"" + message + "\" in gel-looking " + this.getColor() + ".");
   }
}