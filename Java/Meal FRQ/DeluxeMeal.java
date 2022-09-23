public class DeluxeMeal extends Meal {
   private String sideDish;
   private String drink;
   
   public DeluxeMeal(String entree, String sideDish, String drink, double cost) {
      super(entree,cost+3);
      this.sideDish = sideDish;
      this.drink = drink;
   }
   public String toString() {
      return "deluxe " + super.getEntree() + " meal, $" + super.getCost();
   }
   public static void main(String[] args) {
      DeluxeMeal burrito = new DeluxeMeal("burrito", "chips", "lemonade", 7.49);
      System.out.println(burrito.toString());
   }
}