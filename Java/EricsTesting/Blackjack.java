import java.util.*;

public class Blackjack
{
   public static void checkAce(ArrayList<Card> hand)
   {
      for(int i = 0; i < hand.size(); i++)
      {
         if(getSum(hand)>21 && findAce(hand) && hand.get(i).pointValue() == 11)
         {
            hand.get(i).setPointValue(1);
         }
      }
   }
   
   public static int getSum(ArrayList<Card> hand)
   {
      int sum = 0;
      for(int i = 0; i < hand.size(); i++)
      {
         sum += hand.get(i).pointValue();
      }
      return sum;
   }
   
   public static boolean findAce(ArrayList<Card> hand)
   {
      for(int i = 0; i < hand.size(); i++)
      {
         if(hand.get(i).rank().equals("Ace"))
         {
            return true;
         }
      }
      return false;
   }
   
   public static void main(String[] args)
   {
      //printing rules of the game
      System.out.println("Blackjack \n   Each player starts with two cards, the goal is to get cards that add up to 21. \n   A player can choose to stay (keep hand) or (hit) draw a card. \n   If a player goes over 21, they instantly bust (lose). \n   Number cards are worth their specified number, face cards are worth 10. \n   Aces are worth 11 if your current hand is less than 21 and 1 if your hand is over 21. \n   The player that is closest to 21 after both players choose to stay wins. \n");
      
      //initializing objects and variables
      String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
      int[] values = {11,2,3,4,5,6,7,8,9,10,10,10,10};
      Deck deck = new Deck(ranks, suits, values, 52);
      Scanner scan = new Scanner(System.in);
      ArrayList<Card> pHand = new ArrayList<Card>();
      ArrayList<Card> cHand = new ArrayList<Card>(); 
      boolean pBust = false;
      boolean pBJ = false;
      boolean cBust = false;
      boolean cBJ = false;
      
      //initialize players' hands
      deck.shuffle();
      for(int i = 0; i < 2; i++)
      {
         pHand.add(deck.deal());
         cHand.add(deck.deal());
      }
      
      //game start
      while(!pBust && !cBust && !pBJ && !cBJ)
      {
         //checks to see if ace value needs to be changed and changes them if need be
         checkAce(pHand);
         checkAce(cHand);
         
         //prints hand for player and asks for turn
         System.out.println("Your hand: " + pHand + ", Total: " + getSum(pHand));
         System.out.println("Type h to hit.\nEnter anything to stay.");
         String response = scan.nextLine();
         if(response.equals("h") || response.equals("H"))
         {
            pHand.add(deck.deal());
            System.out.println();
         }
         
         //computer turn
         
         
         //checks for blackjacks
         if(getSum(pHand)==21 && getSum(cHand)==21)
         {
            System.out.println("Double Blackjack! Both players tie.");
         }
         else if(getSum(pHand)==21)
         {
            System.out.println("Blackjack! You won!");
         }
         else if(getSum(cHand)==21)
         {
            System.out.println("Blackjack! Computer won.");
         }
         }
         //checks for busts
         if(getSum(pHand)>21 && getSum(cHand)>21)
         {
            System.out.println("Double bust! Both players tie.");
         }
         else if(getSum(pHand)>21)
         {
            System.out.println("Bust! You lose.");
         }
         else if(getSum(cHand)>21)
         {
            System.out.println("Bust! Computer lost.");
         }
      }
   }
