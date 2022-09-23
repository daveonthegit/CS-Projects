import java.util.ArrayList;

public class Tester
{
  public static void main(String[] args)
  {
    System.out.println("---- TESTING PART A ----\n");
    ClubMembers club = new ClubMembers();
    String[] namesPartA = {"YOUNG, STACEY", "BURTON, TIMOTHY", "SAMSON, TOM"};

    club.addMembers(namesPartA, 2015);
    ArrayList<MemberInfo> members = club.getMemberList();
    for (MemberInfo member : members)
    {
      System.out.println(member.getName() + " " + member.getGradYear());
    }
    
    System.out.println("\n---- TESTING PART B ----");
    ClubMembers club2 = new ClubMembers();
    String[] name1 = {"SMITH, JANE"};
    club2.addMembers(name1, 2019);
    String[] name2 = {"FOX, STEVE"};
    club2.addMembers(name2, 2018);
    String[] name3 = {"XIN, MICHAEL"};
    club2.addMembers(name3, 2017);
    String[] name4 = {"GARCIA, MARIA"};
    club2.addMembers(name4, 2020);
    ArrayList<MemberInfo> members2 = club2.getMemberList();
    members2.get(0).setHasGoodStanding(false);
    members2.get(2).setHasGoodStanding(false);
    
    System.out.println("\nBefore call to removeMembers:");
    for (MemberInfo member : members2)
    {
      System.out.println(member.getName() + " " + member.getGradYear() + " " + member.inGoodStanding());
    }
    
    ArrayList<MemberInfo> returnList = club2.removeMembers(2018);
    
    System.out.println("\nAfter call to removeMembers:");
    for (MemberInfo member : members2)
    {
      System.out.println(member.getName() + " " + member.getGradYear() + " " + member.inGoodStanding());
    }
    
    System.out.println("\nArrayList returned by removeMembers:");
    for (MemberInfo member : returnList)
    {
      System.out.println(member.getName() + " " + member.getGradYear() + " " + member.inGoodStanding());
    }
  }
}