import java.util.*;

//comment out lines with // to auto run a game
public class War{ 
   public static void main(String[] args){
      String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
      int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
      Scanner scan = new Scanner(System.in);

      Deck startD = new Deck(ranks, suits, values, 52);
      startD.shuffle();
      Deck playerD = new Deck();
      Deck computerD = new Deck();
      
      //game starts here
      System.out.println("It's a war of cards!");
      while(!startD.isEmpty()){
         playerD.addCard(startD.deal());
         computerD.addCard(startD.deal());
      }
      System.out.println("Deck sizes: " + playerD.size() + " (yours) vs. " + computerD.size() + " (computer's)");
      while(!(playerD.isEmpty() || computerD.isEmpty())){                                                         //
         System.out.println("Press 'ENTER' to fight or 'S' to shuffle your deck!");                               //
         String response = scan.nextLine();                                                                       //
         if(response.equals("")){
            int pIndex = 0;
            int cIndex = 0;
            System.out.println("You drew the " + playerD.getCard(pIndex));
            System.out.println("The computer drew the " + computerD.getCard(cIndex));
            int warCount = 0;
            while(playerD.getCard(pIndex).matches(computerD.getCard(cIndex))){
               System.out.println("It's a tie! Battle again!");
               warCount++;
               if(playerD.size()-1 < warCount * 4){
                  pIndex = playerD.size()-1;
               }
               else{
                  pIndex += 4;
               }
               if(computerD.size()-1 < warCount*4){
                  cIndex = computerD.size()-1;
               }
               else{
                  cIndex += 4;
               }
               System.out.println("You drew the " + playerD.getCard(pIndex));
               System.out.println("The computer drew the " + computerD.getCard(cIndex));
            }
            int count = 0;
            if(playerD.getCard(pIndex).pointValue() > computerD.getCard(cIndex).pointValue()){
               for(int i = 0; i <= cIndex; i++){
                  playerD.addCard(computerD.deal());
                  count++;
               }
               System.out.println("You won " + count*2 + " cards! Deck sizes: " + playerD.size() + " (yours) vs. " + computerD.size() + " (computer's)");
               playerD.shuffle();
            }
            else{
               for(int i = 0; i <= pIndex; i++){
                  computerD.addCard(playerD.deal());
                  count++;
               }
               System.out.println("The computer won " + count*2 + " cards! Deck sizes: " + playerD.size() + " (yours) vs. " + computerD.size() + " (computer's)");
               computerD.shuffle();
            }
            System.out.println();
         }                                                                                                        //
         
         if(response.equals("s") || response.equals("S")){                                                        //
            playerD.shuffle();                                                                                    //
            System.out.println("Your deck has been shuffled");                                                    //
            System.out.println();                                                                                 //
         }                                                                                                        //
      }
      if(playerD.isEmpty()){
         System.out.println("You lost the war.");
      }
      else{
         System.out.println("You won the war!");
      }
   }
}