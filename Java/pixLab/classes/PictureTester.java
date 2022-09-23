/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue(String pic)
  {
    Picture test = new Picture(pic);
    test.explore();
    test.zeroBlue();
    test.explore();
  }
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue(String pic)
  {
    Picture test = new Picture(pic);
    test.keepOnlyBlue();
    test.explore();
  }
  /** Method to test negate */
  public static void testNegate(String pic)
  {
    Picture test = new Picture(pic);
    test.negate();
    test.explore();
  }
  /** Method to test grayScale */
  public static void testGrayscale(String pic)
  {
    Picture test = new Picture(pic);
    test.grayScale();
    test.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("penguin.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("penguin.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("penguin.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("penguin.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  /** Method to test mirrorGulls */
  public static void testMirrorGulls()
  {
    Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGulls();
    gull.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testMyCollage()
  {
    Picture canvas = new Picture("penguin.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testFlowersOnMoonCollage(){
  Picture canvas = new Picture("moon-surface.jpg");
    canvas.flowersOnMoonCollage();
    canvas.explore();
}
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue("beach.jpg");
    //testKeepOnlyBlue("beach.jpg");
    //testKeepOnlyBlue("penguin.jpg");
    //testKeepOnlyBlue("weather.jpg");
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate("beach.jpg");
    //testNegate("weather.jpg");
    //testNegate("penguin.jpg");
    //testGrayscale("beach.jpg");
    //testGrayscale("weather.jpg");
    //testGrayscale("penguin.jpg");
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGulls();
    //testMirrorDiagonal();
    //testCollage();
    testMyCollage();
    //testCopy();
    //testFlowersOnMoonCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}