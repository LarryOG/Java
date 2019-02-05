package week4.RugbyLeague;

import java.util.ArrayList;

public class League {
    private ArrayList <Team> teams;

    public League() {
        this.teams = new ArrayList<Team>();
    }

    public League(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public void addTeam(Team newTeam){
        this.teams.add(newTeam);
    }

    @Override
    public String toString() {
        String x = "";

        x = "Betfred Super League:\n";

        for (Team z: this.teams) {
            x += z.toString ();
            x += "\n";
        }

        return x;
    }

    public static void main (String[] args) {


        Team stHelens = new Team("St Helens");
        Team castleford = new Team("Castleford Tigers");
        Team catalans = new Team("Catalan Dragons");
        Team huddersfield = new Team("Huddersfield Giants");
        Team hull = new Team("Hull FC");
        Team kingston = new Team("Hull Kingston Rovers");
        Team leeds = new Team("Leeds Rhinos");
        Team london = new Team("London Broncos");
        Team salford = new Team("Salford Red Devils");
        Team wakefield = new Team("Waakefield Trinity");
        Team warrington = new Team("Warrington Wolves");
        Team wigan = new Team("Wigan Warriors");

        League belferdSuper = new League();

        belferdSuper.addTeam(stHelens);
        belferdSuper.addTeam(castleford);
        belferdSuper.addTeam(catalans);
        belferdSuper.addTeam(huddersfield);
        belferdSuper.addTeam(hull);
        belferdSuper.addTeam(kingston);
        belferdSuper.addTeam(leeds);
        belferdSuper.addTeam(london);
        belferdSuper.addTeam(salford);
        belferdSuper.addTeam(wakefield);
        belferdSuper.addTeam(warrington);
        belferdSuper.addTeam(wigan);

        System.out.println(belferdSuper );

    }
}
