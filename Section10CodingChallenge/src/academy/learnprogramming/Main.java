package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("This League");
        FootballPlayer joe = new FootballPlayer("Joe");


        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);


        System.out.println(adelaideCrows.numPlayers());


        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);
        footballLeague.add(melbourne);
        footballLeague.add(adelaideCrows);
        melbourne.matchResult(adelaideCrows, 1, 0);
        footballLeague.showLeagueTable();
    }
}
