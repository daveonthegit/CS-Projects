public class ArrayAlgorithmsRunner 
{
  public static void main(String[] args) 
  {
    int[] testArray = {51,81,49,0,1,13,7,9,2,3,5,2,2};
  
    System.out.println("test array: "+ArrayAlgorithms.print(testArray));
    System.out.println("findMax:"+ArrayAlgorithms.findMax(testArray));
    System.out.println("findMin:"+ArrayAlgorithms.findMin(testArray));
    System.out.println("findSum:"+ArrayAlgorithms.findSum(testArray));
    System.out.println("findAverage:"+ArrayAlgorithms.findAverage(testArray));
    System.out.println("findMode:"+ArrayAlgorithms.findMode(testArray));
    System.out.println("findIndex:"+ArrayAlgorithms.findIndex(testArray, 5));
    System.out.println("reverseArray:"+ArrayAlgorithms.reverseArray(testArray));
    System.out.println("findOdd:"+ArrayAlgorithms.findOdd(testArray));
    System.out.println("hasDupe:"+ArrayAlgorithms.hasDupe(testArray));
    System.out.println("findCons:"+ArrayAlgorithms.findCons(testArray));
    System.out.println("numBet:"+ArrayAlgorithms.numBet(testArray, 5, 50));
    System.out.println("shiftRight:"+ArrayAlgorithms.shiftRight(testArray));
    System.out.println("shiftLeft:"+ArrayAlgorithms.shiftLeft(testArray));
  }
}