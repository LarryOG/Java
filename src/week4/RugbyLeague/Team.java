package week4.RugbyLeague;

public class Team {

    private String name;
    private int wins;
    private int loses;
    private int draws;
    private int points;
    private int gamesPlayed;


    public Team(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public String getName() {
        return name;
    }

    public void playGame(int scoreHome, int scoreAway) {
        this.gamesPlayed += 1;
        if (scoreHome > scoreAway) {
            this.wins += 1;
            this.points += 2;
        } else if (scoreHome == scoreAway) {
            this.draws += 1;
            this.points += 1;
        } else if (scoreHome < scoreAway) {
            this.loses += 1;
        }
    }

    @Override
    public String toString() {
        return "Team Name:  " + name +
                " | Played: " + gamesPlayed +
                " | Wins: " + wins +
                " | Loses: " + loses +
                " | Draws: " + draws +
                " | Points: " + points;
    }

    public static void main(String[] args) {
        Team Hudd = new Team("Huddersfield ");
        Team Hull = new Team("Hull ");
        Hudd.playGame(10, 20);
        Hull.playGame(20, 10);
        System.out.println(Hudd);


    }
}
