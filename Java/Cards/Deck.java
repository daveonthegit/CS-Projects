import java.util.*;

public class Deck{
   private ArrayList<Card> cards;
   
   public Deck(){
      cards = new ArrayList<Card>();
   }
   
   public Deck(String[] ranks, String[] suits, int[] values, int deckSize){
      cards = new ArrayList<Card>();
      for(int i = 0 ; i < deckSize/4; i++){
         for(int x = 0; x <= 3; x++){
            Card temp = new Card(ranks[i], suits[x], values[i]);
            cards.add(temp);
         }
      }
   }
   
   public Card deal(){
      return cards.remove(0);
   }
   
   public boolean isEmpty(){
      if(cards.size() == 0){
         return true;
      }
      return false;
   }
   
   public void shuffle(){
      for(int i = 0; i < cards.size(); i++){
         int random = (int)(Math.random() * cards.size());
         Card temp = cards.get(i);
         cards.set(i, cards.get(random));
         cards.set(random, temp);
      }
   }
   
   public void addCard(Card card){
      cards.add(card);
   }
   
   public int size(){
      return cards.size();
   }
   
   public Card getCard(int index){
      return cards.get(index);
   }
   
   public String toString(){
      String temp = "";
      for(int i = 0; i < cards.size(); i++){
         temp += cards.get(i) + "\n";
      }
      return temp;
   }
   
   public static void main(String[] args){
      String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
      int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
      Deck test = new Deck(ranks, suits, values, 52);
      System.out.println(test);
      test.shuffle();
      System.out.println();
      System.out.println(test);
   }
}