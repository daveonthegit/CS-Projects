package Projects.Party;

public class PartyRunner {
    public static void main(String[] args){
        Party p1 = new Party();
        p1.printPartyStatus();
        Party p2 = new Party(true);
        p2.printPartyStatus();
        Party p3 = new Party(true, 4, true);
        p3.printPartyStatus();
    }
}