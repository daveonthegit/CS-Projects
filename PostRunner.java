public class PostRunner
{
   public static void main(String args[])
   {
      Post mp = new MessagePost("David", "I had a great day");
      mp.addComment("Nice message");
      mp.display();
      Post pp = new PhotoPost("David", "goodday.jpg", "It's nice outside today");
      pp.addComment("Nice image");
      pp.display();
      NewsFeed nf = new NewsFeed();
      nf.addPost(mp);
      nf.addPost(pp);
      nf.show();
   }
}