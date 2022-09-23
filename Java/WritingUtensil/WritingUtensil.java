public class WritingUtensil
{
   private String color;
   
   public WritingUtensil(String color)
   {
      this.color = color;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public void setColor(String color)
   { 
      this.color = color;
   }
   
   public void write(String message)
   {
      System.out.println(this.getClass().getSimpleName()+ " writing \"" + message + "\" in " + color+ ".");
   }
 }