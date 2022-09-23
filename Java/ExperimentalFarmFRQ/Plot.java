//Be sure to add Java Docs documentation and fix the indentation
public class Plot
{

   private String cropType;

   private int cropYield;

   public Plot(String crop, int yield)
   {
      cropType = crop;
      cropYield = yield;
   }
   
   public String getCropType()
   {
   return cropType;
   }
   
   public int getCropYield()
   {
   return cropYield;
   }
   public String toString() {
      return "Crop Type: " + cropType + " Crop Yield: " + cropYield;ing t
   }
}