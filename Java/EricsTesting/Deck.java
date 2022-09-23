import java.util.*;

/** Represents an entire deck of playing cards.
* @author Eric Lin, Jeff Lin, David Xiao
*/
public class Deck{
   private ArrayList<Card> cards;
   
   /** Creates an empty Deck object.
   */
   public Deck(){
      cards = new ArrayList<Card>();
   }
   
   /** Creates a Deck object composed of as many Card objects as specified in the deck size.
   * @param ranks All the ranks in a standard playing card deck.
   * @param suits All the suits in a standard playing card deck.
   * @param values All the point values in a standard playing card deck when playing war.
   * @param deckSize The size of the deck
   */
   public Deck(String[] ranks, String[] suits, int[] values, int deckSize){
      cards = new ArrayList<Card>();
      for(int i = 0 ; i < deckSize/4; i++){
         for(int x = 0; x <= 3; x++){
            Card temp = new Card(ranks[i], suits[x], values[i]);
            cards.add(temp);
         }
      }
   }
   
   /** Deals the top card from a Deck object, removing the card from the deck in the process.
   * @return A Card object from the top of the deck.
   * Precondition: Deck.size() > 0
   */
   public Card deal(){
      return cards.remove(0);
   }
   
   /** Checks to see if a deck is empty.
   * @return A boolean representing if the deck is empty or not.
   */
   public boolean isEmpty(){
      if(cards.size() == 0){
         return true;
      }
      return false;
   }
   
   /** Shuffles a deck, randomly mixing up the indexes of the Card objects it contains.
   */
   public void shuffle(){
      for (int k = cards.size() - 1; k > 0; k--) {
			int howMany = k + 1;			
			int randPos = (int) (Math.random() * howMany);
			Card temp = cards.get(k);
			cards.set(k, cards.get(randPos));
			cards.set(randPos, temp);
		}
   }
   
   /** Adds a Card object to the bottom of the deck.
   */
   public void addCard(Card card){
      cards.add(card);
   }
   
   /** Gets the size of the deck.
   * @return The size or number of cards in the deck.
   */
   public int size(){
      return cards.size();
   }
   
   /** Gets the Card object at the specified index.
   * @param index The index of the Card object in the deck.
   * @return The Card object at the specified index of the deck.
   */
   public Card getCard(int index){
      return cards.get(index);
   }
   
   /** A toString method for printing a deck.
   * @return A String representing all of the Card objects within a Deck object.
   */
   public String toString(){
      String temp = "";
      for(int i = 0; i < cards.size(); i++){
         temp += cards.get(i) + "\n";
      }
      return temp;
   }
   
   /** A method for testing to test the initializing, shuffling, and printing of a deck.
   * @return Two Strings of the same Deck object, the first String in order and the second STring after shuffled.
   */
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