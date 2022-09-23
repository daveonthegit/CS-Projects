public class TicTacToe{
   private boolean won = false;
   private Board tb;
   public TicTacToe(int boardX, int boardY) {
      tb = new Board(boardX,boardY);
   }
   public boolean getWon() {
      return won;
   }
   public char getMark(int row, int col) {
      return tb.getBoard()[row][col];
   }
   public void clearBoard() {
      tb.clearBoard();
      won = false;
   }
   public Board getBoard() {
      return tb;
   }
   public void putMark(int row, int col, char mark) {
   if (won== false) {
      tb.setIndex(row,col,mark);
   }
   }
   
   public void printBoard()
   {
      System.out.println("Board: " );
      for (char[] k: tb.getBoard()) {
         for (char i: k) {
            System.out.print(i + " ");
         }
         System.out.println();
      }
   }
   public boolean winner(char mark) {
      for (char[] k: tb.getBoard()) {
         boolean all3 = true;
         for(char j:k) {
            if (j!=mark) {
               all3 = false;
            }
         }
         if (all3 == true) {
            won = true;
            return all3;
         }
      }
      for (int i = 0; i < tb.getHeight(); i++) {
         boolean all3 = true;
         for (char[] k:tb.getBoard()) {
            if (k[i] != mark) {
               all3=false;
            }
         }
         if (all3 == true) {
            won = true;
            return all3;
            
         }
      }
      boolean all3 = true;
      for (int i = 0; i < tb.getHeight(); i++) {
         if (tb.getBoard()[i][i] != mark) {
            all3 = false;
         }
      }
      if (all3 == true) {
         won = true;
         return all3;
      }
      all3 = true;
      for (int i = tb.getHeight()-1; i>=0; i--) {
         if (tb.getBoard()[i][i] != mark) {
            all3 = false;
         }
      }
      if (all3 == true) {
         won = true;
         return all3;
      }
      return false;
   }
}