public class LightSequenceRunner {
   public static String segmentRemover(String ogSeq, String seg) {
      int ind;
      String nSeq = "";
      if (!(ogSeq.contains(seg))) {
         return ogSeq;
      } else {
         ind = ogSeq.indexOf(seg);
         nSeq = ogSeq.substring(0, ind) + ogSeq.substring(ind);
      }
      return nSeq;
   }
   public static void main(String[] args) {
      double a = 52;
      double b = 40;
      String oldSeq = "1100000111";
      String newSeq = "";
      LightSequence gradShow = new LightSequence("0101 0101 0101");
      gradShow.display();
      gradShow.changeSequence("0011 0011 0011");
      gradShow.display();
      String resultSeq = gradShow.insertSegment("1111 1111", 4);
      gradShow.changeSequence(resultSeq);
      gradShow.display();
      newSeq =segmentRemover(oldSeq, "11");
      System.out.println("New Sequence: " + newSeq + " Old Sequence: " + oldSeq);
      oldSeq = "0000011";
      newSeq =segmentRemover(oldSeq, "11");
      System.out.println("New Sequence: " + newSeq + " Old Sequence: " + oldSeq);
      oldSeq = "1100000111";
      newSeq = segmentRemover(oldSeq, "00");
      System.out.println("New Sequence: " + newSeq + " Old Sequence: " + oldSeq);
      oldSeq = "11111";
      newSeq = segmentRemover(oldSeq, "00");
      System.out.println("New Sequence: " + newSeq + " Old Sequence: " + oldSeq);
      System.out.print("The straight line distance between two lights is: ");
      double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
      System.out.println(c);
   }
}
