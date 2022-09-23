public class SpinnerGameRunner{ 
   public static void main(String[] args) {
      SpinnerGame g1 = new SpinnerGame();
      g1.playRound();
      g1.round();
      g1.playRound();
      g1.playRound();
      g1.playRound();
      System.out.println(g1.spin(1,10));
   }
}