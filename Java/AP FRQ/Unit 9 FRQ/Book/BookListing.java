public class BookListing{
   Book b;
   double price;
   public BookListing(Book b1, double p) {
      b = b1;
      price = p;
   }
   public void printDescription() {
      b.printBookInfo();
      System.out.print(", $" + price);
   }
}