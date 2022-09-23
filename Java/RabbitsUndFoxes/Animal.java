public class Animal extends LivingThing {
   //child class!
   private boolean carnivore;
   //subclass constructor!
   public Animal (String sN, int nV, int h, int gS, int atk, boolean carn) {
      //super is used here!
      super("Animal", sN, nV, h, gS, atk);
      carnivore = carn;
  }
   //override of toString
   public String toString() {
      return "The Animal of species " + super.getName() + " is carnivore: " + carnivore + " and has " + super.getHealth() + "/" + super.getMaxHealth() + " health, it is on year " + super.getGrowthStage() + " and is " + super.getGrowthPercent() + "% to growing up, it has an attack power of " + super.getAttack() + " and it's living state is: " + super.getLivingState() + " it's eaten sate is: " + super.getEatenState();
  }
   // override of Eat
  public void Eat(LivingThing k) {
      if (carnivore && k.getKingdom().equals("Animal")) {
         super.Eat(k);
      } else if (carnivore) {
         System.out.println(getName() + " cannot eat plants, it's a carnivore!");
      }
      if (!carnivore && k.getKingdom().equals("Plant")) {
         super.Eat(k);
      }  else if (!carnivore) {
         System.out.println(getName() + " cannot eat animals, it's a herbivore!");
      }
   }
}