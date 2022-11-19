package Patterns;

public abstract class Team {
    private String teamName;
    private TeamStrategy teamStrategy;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public TeamStrategy getTeamStrategy() {
        return teamStrategy;
    }

    public void setTeamStrategy(TeamStrategy teamStrategy) {
        this.teamStrategy = teamStrategy;
    }

    public abstract void teamInfo();

    public void playGame() {
        teamStrategy.play(teamName);
    }
}


//    Team teamCT = new TeamCT();
//        teamCT.setTeamStrategy(new AttackStrategy());
//                teamCT.setTeamName("Counter-terrorist");
//                teamCT.teamInfo();
//                teamCT.playGame();
//
//                System.out.println();
//
//                Team teamT = new TeamT();
//                teamT.setTeamStrategy(new DefendStrategy());
//                teamT.setTeamName("Terrorist");
//                teamT.teamInfo();
//                teamT.playGame();
//
//                System.out.println();
//                System.out.println("A few hours later: ");
//                System.out.println();
//
//                teamCT.setTeamStrategy(new DefendStrategy());
//                teamCT.teamInfo();
//                teamCT.playGame();
//
//                System.out.println();
//                teamT.setTeamStrategy(new AttackStrategy());
//                teamT.teamInfo();
//                teamT.playGame();