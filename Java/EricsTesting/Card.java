import java.util.*;

/** Represents a single card in a standard 52 card deck.
* @author Eric Lin, Jeff Lin, David Xiao
*/
public class Card{
   private String rank;
   private String suit;
   private int pointValue;
   
   /** Creates a card with the specified rank, suit, and value.
   * @param cardRank The card's rank.
   * @param cardSuit The card's suit.
   * @param cardPointValue The card's point value in a game of war.
   */
   public Card(String cardRank, String cardSuit, int cardPointValue){
      rank = cardRank;
      suit = cardSuit;
      pointValue = cardPointValue;
   }
   
   /** Gets the card's rank.
   * @return A String representing the card's rank.
   */
   public String rank(){
      return rank;
   }
   
   /** Gets the card's suit.
   * @return A String representing the card's suit.
   */
   public String suit(){
      return suit;
   }
   
   /** Gets the card's point value.
   * @return An int representing the card's point value.
   */
   public int pointValue(){
      return pointValue;
   }
   
   /** Sets the card's point value to a different integer.
   * @param newValue The new point value for the card.
   * Precondition: Object used to call method is a Card.
   */
   public void setPointValue(int newValue){
      this.pointValue = newValue;
   }
   
   /** Compares two cards' point values with one another.
   * @param otherCard The other card being comapred to the one used to call the method.
   * @return A boolean representing whether the card's point values match.
   */
   public boolean matches(Card otherCard){
      if(this.pointValue() == otherCard.pointValue()){
         return true;
      }
      return false;
   }
   
   /** A toString method used to print Card objects.
   * @return A String representing the rank, suit, and point value of a Card.
   */
   public String toString(){
      return this.rank() + " of " + this.suit();
   }
   
   /** A test method to check if toString works as it is suppsoed to.
   * Creates a Jack of Clubs Card object and prints it using the toString method.
   * @return A String representing the Jack of Clubs Card object with rank, suit, and point value all listed.
   */
   public static void main(String args[]){
      Card test = new Card("J", "Cl",  11);
      System.out.println(test);
   }
}