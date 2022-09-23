public class Main{
   public static void main(String[] args) {
      String[] wordArray = {"wheels", "on", "the", "bus"};
      RandomStringChooser sChooser = new RandomStringChooser(wordArray);
      for (int k = 0; k<6; k++) {
         System.out.print(sChooser.getNext()+ " ");
      }
      RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
      System.out.println();
      for (int i = 0; i <4; i++) {
         System.out.print(letterChooser.getNext());
      }
   }
}