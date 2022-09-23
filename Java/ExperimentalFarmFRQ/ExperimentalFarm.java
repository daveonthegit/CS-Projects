//Be sure to add any Java Docs that are missing and fix the indentation
public class ExperimentalFarm
{
private Plot[][] farmPlots;

public ExperimentalFarm(Plot[][] p)
{
   farmPlots = p;
}

/** Returns the plot with the highest yield for a given crop type, as described in part (a). */
public Plot getHighestYield(String c)
{
   Plot largest = new Plot(c, -1);
   for (Plot[] e: farmPlots) {
      for (Plot x:e) {
         if(x.getCropType().equals(c) && x.getCropYield() > largest.getCropYield()) {
            largest = x;
         }
      }
   }
   if (largest.getCropYield() < 0) {
      return null;
   }
   return largest;
}

/** Returns true if all plots in a given column in the two-dimensional array farmPlots
* contain the same type of crop, or false otherwise, as described in part (b).
*/
public boolean sameCrop(int col)
{
   String cropType = farmPlots[0][col].getCropType();
   boolean sCrop = true;
   for (Plot[] k:farmPlots) {
      if (!k[col].getCropType().equals(cropType)){
         sCrop = false;
      }
   }
   return sCrop;
}

}