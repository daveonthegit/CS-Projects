package Time;

public class Time{
   int hrs;
   int mins;
   int secs;
   
   //initialize everything to zero
   public Time(){
       hrs = 0;
       mins = 0;
       secs = 0;
   }
   //initialzie to h, m and s
   public Time(int h, int m, int s){
       hrs = h;
       mins = m;
       secs = s;
   }
   //reset time
   public void reset(int h, int m, int s){
       hrs = h;
       mins = m;
       secs = s;
   }
   private void timeCheck(){
        if (secs >= 60) {
        secs = 0;
        mins++;
        }
        if (mins >= 60) {
        mins = 0;
        hrs++;
        }
        if (hrs >= 24) {
        hrs = 0;
        }
   }
   //Advances time by 1 second - Tricky!  Let me know if you need a hint!
   public void increment(){
        timeCheck();
        secs ++;
        timeCheck();
   }
   public void printTime(){
       System.out.println(hrs + ":" + mins +":" + secs);
   }
 }