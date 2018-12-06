package week3.christmas.club;

/**
 * Created by u1864886 on 06/12/2018.
 */

import java.util.ArrayList;

public class Club {

    private ArrayList <Member> members;

    public Club () {
        this.members = new ArrayList <Member>();
    }

    public Club (ArrayList <Member> members){
        this.members = members;
    }

    public void addMember (Member newMember) {
        this.members.add (newMember);
    }

    public int totalContributions () {
        int total = 0;
        for (Member x: members) {
            total += x.getContribution();
        }
        return total;
    }

    public int totalTurkeys (int turkeyPrice) {

        return totalContributions()/turkeyPrice;
    }






    @Override
    public String toString() {
        String s = "";

        s = "Club Members:\n\n";

        for (Member c: this.members) {
            s += c.toString ();
            s += "\n";
        }

        return s;
    }

    public static void main (String[] args) {

        Member gary = new Member("Gary",27);
        Member tony = new Member("Tony",21);
        Member rubiya = new Member("Rubiya",20);
        Member steve = new Member("Steve",28);

        Club christmasClub = new Club ();

        christmasClub.addMember(gary);
        christmasClub.addMember(tony);
        christmasClub.addMember(rubiya);
        christmasClub.addMember(steve);
        System.out.println(christmasClub);
        System.out.println("Total amount of contributions: "+christmasClub.totalContributions());
        System.out.println("Total amount of turkeys that can be purchased at the moment: " +christmasClub.totalTurkeys(20));
    }



}
