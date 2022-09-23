public class PrintGrid
{
  public static void main(String[] args)
  {
     String[][] grid = {{"A","B","C","D","E"},
                        {"F","G","H","I","J"},
                        {"K","L","M","N","O"},
                        {"P","Q","R","S","T"}};
     //Printing Grid using Regular For Loops
     for (int i = 0; i <grid.length; i++) {
         for (int j = 0;j <grid[i].length; j++) {
            System.out.print(grid[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println();
     //Printing Grid using For Each Loops
     for (String[] k: grid) {
         for(String b: k) {
            System.out.print(b +" ");
         }
         System.out.println();
     }
      System.out.println();
     //Printing Grid in Row Major Order
     for (String[] k:grid) {
         for(String b: k) {
            System.out.print(b +" ");
         }
     }
      System.out.println();
     //Printing Grid in Column Major Order
     for (int i = 0; i < grid[0].length;i++) {
         for (int j = 0; j <grid.length;j++) {
            System.out.print(grid[j][i] + " ");
         }
     }
  }   
}
