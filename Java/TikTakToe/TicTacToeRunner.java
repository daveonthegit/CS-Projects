public class TicTacToeRunner{
   public static void main(String[] args) {
      TicTacToe ttt = new TicTacToe(3,3);
      //HumanPlayer p1 = new HumanPlayer();
      //HumanPlayer p2 = new HumanPlayer();
      //do{
      //   p1.makeMove(ttt);
      //   ttt.printBoard();
      //   p2.makeMove(ttt);
      //   ttt.printBoard();
      //} while (ttt.getWon() == false);
      //ttt.clearBoard();
      //HumanPlayer p3 = new HumanPlayer();
      //RandomPlayer p4 = new RandomPlayer();
      //do{
      //   p3.makeMove(ttt);
      //   p4.makeMove(ttt);
      //} while (ttt.getWon() == false); 
      RandomPlayer p5 = new RandomPlayer();
      RandomPlayer p6 = new RandomPlayer();
      do{
         p5.makeMove(ttt);
         p6.makeMove(ttt);
      } while (ttt.getWon() == false); 
      
   }
}