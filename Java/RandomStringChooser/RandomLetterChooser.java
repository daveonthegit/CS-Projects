public class RandomLetterChooser extends RandomStringChooser {
   public RandomLetterChooser(String word) {
      super(getSingleLetters(word));
   }
   public static String[] getSingleLetters (String str){
      return str.split("");
   }
}
