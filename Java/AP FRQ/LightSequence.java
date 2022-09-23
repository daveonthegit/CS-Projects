public class LightSequence {
   // attributes not shown
  String currentSeq = "";
  boolean lightsOn = false;
  /** The parameter seq is the initial sequence used for
    * the light display */
  public LightSequence(String seq){
   currentSeq = seq;
  }
  
  /** Inserts the string segment in the current sequence,
    * starting at the index ind. Returns the new sequence. */
  public String insertSegment(String segment, int ind){ 
   return currentSeq.substring(0,ind) + segment + currentSeq.substring(ind);
  }
  
  /** Updates the sequence to the value in seq*/
  public void changeSequence(String seq){
   currentSeq = seq;
  }
  
  /** Uses the current sequence to turn the light on and off for the show */
  public void display(){
   String[] seq = currentSeq.split("");
   for (String k:seq) {
   if (k.equals("1")) {
      lightsOn=true;
      System.out.print("On ");
    } else {
      lightsOn=false;
      System.out.print("Off ");
    }
   }
   System.out.println();
  }
}
   