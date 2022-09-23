import java.util.*;
public class HumanPlayer{
   char mark;
   public HumanPlayer () {
      System.out.println("Input your mark: ");
      Scanner n = new Scanner(System.in);
      this.mark = n.next().charAt(0); 
   }
   public void makeMove(TicTacToe b) {
      if (!(b.getWon())) {
         Scanner n = new Scanner(System.in);
         System.out.println("Input your move: ");
         String[] arr = n.nextLine().split(" ", 2);
         b.putMark(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),mark);
         b.printBoard();
         if (b.winner(mark)) {
            System.out.println("You won!");
         }
      }
   }
}