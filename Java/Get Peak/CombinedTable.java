public class CombinedTable {
   private SingleTable t1;
   private SingleTable t2;

   public CombinedTable(SingleTable t1, SingleTable t2) {
      this.t1 = t1;
      this.t2 = t2;
   }
   
   public boolean canSeat(int x) {
      if (x <=(t1.getNumSeats() + t2.getNumSeats()-2))
         return true;
      return false;
   }
   
   public double getDesirability() {
      if (t1.getHeight() != t2.getHeight())
         return (t1.getViewQuality()+t2.getViewQuality())/2 - 10;
      return  (t1.getViewQuality()+t2.getViewQuality())/2;
   }
}