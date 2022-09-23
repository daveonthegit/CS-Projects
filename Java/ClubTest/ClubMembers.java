import java.util.ArrayList;

public class ClubMembers
{
  private ArrayList<MemberInfo> memberList;
  
  // **ADDED FOR PURPOSE OF CREATING TEST CODE**
  public ClubMembers()
  {
    memberList = new ArrayList<MemberInfo>();
  }
  
  // **ADDED FOR PURPOSE OF CREATING TEST CODE**
  public ArrayList<MemberInfo> getMemberList()
  {
    return memberList;
  }
  
  /** Adds new club members to memberList, as described in part (a).
  * Precondition: names is a non-empty array.
  */
  public void addMembers(String[] names, int gradYear)
  {
    for(String n: names) {
	MemberInfo mI = new MemberInfo(n,gradYear,true);
	memberList.add(mI);
}

  }
  
  /** Removes members who have graduated and returns a list of members who have graduated
  * and are in good standing, as described in part (b).
  */
  public ArrayList<MemberInfo> removeMembers(int year)
  {
      ArrayList<MemberInfo> gM = new ArrayList<MemberInfo>();
    for(int i = memberList.size()-1; i >= 0; i--) {
	   
	   if (memberList.get(i).getGradYear() == year) {
		   if(memberList.get(i).inGoodStanding())
			   gM.add(memberList.get(i));
		   memberList.remove(i);
	   }
	   }
   return gM;
   }
}

  
