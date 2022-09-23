public class SpinnerGame {
   /** Precondition: min < max
   * Simulates a spin of a spinner by returning a random integer
   * between min and max, inclusive.
   */
   int playerPoints =0;
   int rounds = 0;
   public void round() {
      System.out.println("You have gone " + rounds + " rounds.");
      System.out.println("You have " + playerPoints + " points in total");
   }
   public int spin(int min, int max)
   { return (int)(Math.random()*max+ min);}
 
   /** Simulates one round of the game as described in part (b).
   */
   public void playRound(){
      int p1 = 0, c1 = 0, points = 0;
      p1 = spin(1,10);
      c1 = spin(2,8);
      if (p1 > c1) {
         points = p1-c1;
         System.out.println("You win! " + points + " points.");
         playerPoints+=points;
      } else if (c1 > p1) { 
         points = c1-p1;
         System.out.println("You lost! " + points + " points.");
         playerPoints+=points;
      } else {
         c1 = spin(2,8) +c1;
         p1 = spin(1,10) +p1;
         if (p1 > c1) {
            points = 1;
            System.out.println("You win! " + points + " points.");
            playerPoints+=points;
         } else if (c1 > p1) {
            points = -1;
           System.out.println("You lose! " + points + " points.");
            playerPoints+=points;
         } else {
            System.out.println("Tie! 0 points.");
         }
      }
      rounds++;
   }
}