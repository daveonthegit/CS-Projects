package Projects.Party;

import java.util.*;
import java.awt.*;

public class Party {
    int numberOfPeople = 0;
    boolean discoLightsOn = false;
    boolean partyStarted = false;
    boolean isPartyFun = false;
    public Party(){
        numberOfPeople = 3;
        startTheParty();
        isPartyFun = true;
    }
    public Party(boolean started){
        if (started = true){
            startTheParty();
        }
    }
    public Party(boolean started, int people, boolean fun) {
        if (started = true){
            startTheParty();
            numberOfPeople = people;
            isPartyFun = fun;
        }
    }
    public void addPersonToparty() {
        numberOfPeople++;
    }
    private void turnOnTheLights() {
        discoLightsOn = true;
    }
    private void turnOffTheLights() {
        discoLightsOn = false;
    }
    public void startTheParty() {
        turnOnTheLights();
        partyStarted = true;
    }
    public void stopTheParty() {
        turnOffTheLights();
        partyStarted = false;
    }
    public void printPartyStatus() {
        System.out.println("Number of people = " + String.valueOf(numberOfPeople));
        if (discoLightsOn = true) {
            System.out.println("The lights are on.");
        } else {
            System.out.println("The lights are off.");
        }
        if (partyStarted = true) {
            System.out.println("The party is started.");
        } else {
            System.out.println("The party hasn't started.");
        }
    }
}