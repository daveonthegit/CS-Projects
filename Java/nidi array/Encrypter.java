import java.util.*;
public class Encrypter{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a phrase to encrypt: ");
      String phrase = input.nextLine();
      System.out.println("Your phrase is: " + phrase + " Length: " + phrase.length());
      int rows = (int)Math.floor(Math.sqrt(phrase.length()));
      int col =(int)Math.ceil(Math.sqrt(phrase.length()));
      if (rows*col < phrase.length()){
         rows++;
      }
      System.out.println("Rows: " + rows + "Columns: " + col);
      String[][] textArray = new String[rows][col];
      int textInd = 0;
      for (String[] rowz:textArray) {
         for (int i = 0; i <rowz.length;i++) {
            if (textInd <phrase.length()){
               rowz[i] = phrase.substring(textInd,textInd+1);
               textInd++;
            } else {
               rowz[i] = " ";
            }
         }
      }
      System.out.println("Uncrypted: ");
      for (String[] rowz:textArray) {
         for (String i:rowz) {
            System.out.print(i +" ");
         }
         System.out.println();
      }
     String encrypted = "";
      for (int c = 0; c<col;c++) {
         for (int r = 0; r<rows;r++) {
            encrypted += textArray[r][c];
         }
      }
     System.out.println("Encrypted: " + encrypted);
   }
}