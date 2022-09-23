import java.util.*;
public class RandomPlayer{
   char mark;
   public RandomPlayer () {
      System.out.println("Input random player mark: ");
      Scanner n = new Scanner(System.in);
      this.mark = n.next().charAt(0); 
   }
   public void makeMove(TicTacToe b) {
      if (!(b.getWon())) {
         int x;
         int y;
         boolean successfulMove = false;
         while (successfulMove == false) {
            x = (int)(Math.random()*b.getBoard().getHeight());
            y = (int)(Math.random()*b.getBoard().getWidth());
            if (b.getMark(x,y) == '-') {
               System.out.println(x + " " + y);
               successfulMove = true;
               b.putMark(x,y,mark);
               b.printBoard();
            }
         }
         if (b.winner(mark)) {
            System.out.println("Random won!");
         }
      }
   }
}