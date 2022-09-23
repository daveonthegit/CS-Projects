public class Board{
   //creates a private 2d board array using characters.
   private char[][] boardAr;
   //constructs a boardAr with the inputted width and height parameters, then fills each empty index with '-'
   public Board(int width, int height) {
      boardAr = new char[width][height];
      for (int a =0; a < boardAr.length;a++) {
         for (int i = 0; i < boardAr[0].length;i++) {
            boardAr[a][i] = '-';
         }
      }
   }
   public void clearBoard() {
      for (int a =0; a < boardAr.length;a++) {
         for (int i = 0; i < boardAr[0].length;i++) {
            boardAr[a][i] = '-';
         }
      }
   }
   //sets boardAr to another board.
   public Board(char[][] boardArTwo) {
      char[][] boardAr = boardArTwo;
   }
   //returns Width
   public int getWidth() {
      return boardAr.length;
   }
   //returns Height
   public int getHeight() {
      return boardAr[0].length;
   }
   //sets an index to a character.
   public void setIndex(int row,int col, char type) {
        boardAr[row][col] = type;
   }
   public char[][] getBoard() {
      return boardAr;
   }
}