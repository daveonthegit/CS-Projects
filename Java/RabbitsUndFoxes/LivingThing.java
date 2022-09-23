public class LivingThing {
   //parent class!
   private String kingdom;
   private boolean alive;
   private boolean eaten;
   private String speciesName;
   private int nutritionValue;
   private int health;
   private int maxHealth;
   private int growthStage;
   private int growthPercent;
   private int attack;
   
   public LivingThing (String k, String sN) {
      kingdom = k;
      speciesName = sN;
      alive = true;
      nutritionValue = 25;
      health = 100;
      maxHealth = 100;
      growthStage = 0;
   }
   
   public LivingThing (String k, String sN, int nV, int h, int gS, int atk) {
      kingdom = k;
      speciesName = sN;
      alive = true;
      eaten = false;
      nutritionValue = nV;
      health = h;
      maxHealth = h;
      growthStage = gS;
      growthPercent = 0;
      attack = atk;
   }
   public boolean getLivingState() {
      return alive;
   }
   public int getGrowthStage() {
      return growthStage;
   }
   public int getAttack() {
      return attack;
   }
   public int getGrowthPercent() {
      return growthPercent;
   }
   public boolean getEatenState() {
      return eaten;
   }
   public int getNutritionValue() {
      return nutritionValue;
   }
   public String getName() {
      return speciesName;
   }
   public String getKingdom() {
      return kingdom;
   }
   public void calculateGrowth(int nutrition) {
      growthPercent+=nutrition;
      if (growthPercent > 100) {
         growthPercent-=100;
         growthStage++;
         attack+=10;
         maxHealth+=(int)(maxHealth*.1);
         System.out.println(kingdom + " " + speciesName + " has grown up by 1 year!");
      }
   }
   public void setEatenState(boolean k) {
      eaten = k;
   }
   public void Eat(LivingThing k) {
      int healAmt = k.getNutritionValue();
      if (!(k.getLivingState())&&!(k.getEatenState())) {
         k.setEatenState(true);
         health+=k.getNutritionValue();
         System.out.println(kingdom + " " + speciesName + " has eaten " + k.getKingdom() + " " + k.getName()+ "!");
         if (health < maxHealth) {
            if (health > maxHealth) {
               healAmt = health-maxHealth;
               calculateGrowth(health-maxHealth);
               health=maxHealth;
            }
         }
      } else{
         System.out.println(kingdom + " " + speciesName + " was not able to eat " + k.getKingdom() + " " + k.getName()+ " as it's already been eaten!");
         return;
      }
      System.out.println(kingdom + " " + speciesName + " has healed for " + healAmt + "!");
   }
   public void lowerHealth(int atk) {
      health-= atk;
   }
   public int getHealth(){
      return health;
   }
   public int getMaxHealth(){
      return maxHealth;
   }
   public void Die() {
      alive = false;
   }
   public void Attack(LivingThing other) {
      if (other.getLivingState() == false) {
         System.out.println(other.getKingdom() + " " + other.getName() + " is already dead!");
         return;
      }
      other.lowerHealth(attack);
      System.out.println(kingdom + " " + speciesName + " has attacked " + other.getKingdom() + " " + other.getName() + " for " + attack + " damage!");
      if (other.getHealth() <= 0) {
         other.Die();
         System.out.println(kingdom + " " + speciesName + " has killed " + other.getKingdom() + " " + other.getName() + "!");
      }
   }
   public String toString() {
      return "The " + kingdom + " of species " + speciesName + " has " + health + "/" + maxHealth + " health, it is on year " + growthStage + " and is " + growthPercent + "% to growing up, it has an attack power of " + attack + " and it's living state is: " + alive + " it's eaten sate is: " + eaten;
   }
}