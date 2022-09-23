import java.util.*;

public class Card{
   private String rank;
   private String suit;
   private int pointValue;
   
   public Card(String cardRank, String cardSuit, int cardPointValue){
      rank = cardRank;
      suit = cardSuit;
      pointValue = cardPointValue;
   }
   
   public String rank(){
      return rank;
   }
   
   public String suit(){
      return suit;
   }
   
   public int pointValue(){
      return pointValue;
   }
   
   public boolean matches(Card otherCard){
      if(this.pointValue() == otherCard.pointValue()){
         return true;
      }
      return false;
   }
   
   public String toString(){
      return this.rank() + " of " + this.suit() + ", value: " + this.pointValue();
   }
   
   public static void main(String args[]){
      Card test = new Card("Jack", "Clubs",  10);
      System.out.println(test);
   }
}