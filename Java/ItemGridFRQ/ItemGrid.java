public class ItemGrid

{

private Item[][] grid;

 

public ItemGrid(int rows,int columns){
   grid = new Item[rows][columns];
}
 

/** Returns true if xPos is a valid row index and yPos is a valid

* column index and returns false otherwise.

*/

public boolean isValid(int xPos, int yPos)

{ if ( 0 <=xPos&& xPos<grid.length) {
   if (0 <=yPos&& yPos<grid[0].length){
      return true;
      }
   }
   return false;
}

 

/** Compares the item in row r and column c to the items to its

* left and to its right. Returns the name of the item with

* the greatest value, as described in part (a).

* Precondition: r and c are valid indices

*/

public String mostValuableNeighbor(int r, int c)

{
   int[] greatest = {r, c};
   if (isValid(r,c-1) && grid[r][c-1].getValue() > grid[greatest[0]][greatest[1]].getValue()) {
      greatest[0] = r;
      greatest[1] = c-1;
   }
   if (isValid(r,c+1) && grid[r][c+1].getValue() > grid[greatest[0]][greatest[1]].getValue()) {
      greatest[0] = r;
      greatest[1] = c+1;
   }
   return grid[greatest[0]][greatest[1]].getName();
}

 

/** Returns the average value of all the items in grid,

* as described in part (b).

*/

public double findAverage()

{ 
   double avg = 0;
   for (Item[] g:grid) {
      for(Item i:g) {
      avg+=i.getValue();
      }
   }
   avg/=(grid.length*grid[0].length);
   return avg;
}
public static void main(String[] args){
   ItemGrid ig = new ItemGrid(3, 4);
   Item j = new Item("acorn", 7);
   ig.grid[0][0] = j;
   j = new Item("book", 10);
   ig.grid[0][1] = j;
   j = new Item("carrot", 8);
   ig.grid[0][2] = j;
   j = new Item("desk", 9);
   ig.grid[0][3] = j;
   j = new Item("egg", 5);
   ig.grid[1][0] = j;
   j = new Item("flag", 8);
   ig.grid[1][1] = j;
   j = new Item("globe", 8);
   ig.grid[1][2] = j;
   j = new Item("harp", 9);
   ig.grid[1][3] = j;
   j = new Item("island", 7);
   ig.grid[2][0] = j;
   j = new Item("jacket", 19);
   ig.grid[2][1] = j;
   j = new Item("kale", 8);
   ig.grid[2][2] = j;
   j = new Item("lunch", 16);
   ig.grid[2][3] = j;
   System.out.println(ig.mostValuableNeighbor(0, 2));
   System.out.println(ig.mostValuableNeighbor(1, 1));
   System.out.println(ig.mostValuableNeighbor(2, 0));
   System.out.println(ig.mostValuableNeighbor(2, 3));
   System.out.println(ig.findAverage());
}
}