public class LifeGame{
   public static void main(String[] args) {
      //subclass reference!
      Animal fox = new Animal("Fox", 10, 100, 0, 25, true);
      //superclass obj V
      LivingThing rabbit = new LivingThing("Rabbit", 35, 50, 0, 10, false);
      //polymorphism V 
      LivingThing rabbit2 = new Animal("Rabbit", 35, 50, 0, 35, false);
      System.out.println(fox);
      System.out.println(rabbit);
      rabbit.Attack(fox);
      rabbit2.Attack(fox);
      fox.Attack(rabbit);
      fox.Attack(rabbit);
      fox.Attack(rabbit);
      fox.Eat(rabbit);
      fox.Eat(rabbit);
      rabbit2.Attack(fox);
      rabbit2.Attack(fox);
      rabbit2.Attack(fox);
      rabbit2.Eat(fox);
   }
}