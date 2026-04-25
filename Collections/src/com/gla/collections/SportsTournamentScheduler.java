package com.gla.collections;

import java.util.*;

class Team implements Comparable<Team> {
    int id;
    String name;
    int points;
    Team(int id, String name) {
        this.id = id;
        this.name = name;
        this.points = 0;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        return id == ((Team)o).id;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
    public int compareTo(Team t) {
        if (this.points != t.points)
            return t.points - this.points;
        return this.id - t.id;
    }
    public String toString() {
        return name + " : " + points;
    }
}
class Match {
    Team t1, t2;

    Match(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
}
class Result {
    Match match;
    Team winner;
    Result(Match m, Team w) {
        this.match = m;
        this.winner = w;
    }
}
public class SportsTournamentScheduler {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();
        Queue<Match> matchQueue = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();
        Team a = new Team(1, "India");
        Team b = new Team(2, "Australia");
        Team c = new Team(3, "England");
        teams.add(a);
        teams.add(b);
        teams.add(c);
        teams.add(new Team(1, "India"));
        leaderboard.addAll(teams);
        matchQueue.add(new Match(a, b));
        matchQueue.add(new Match(b, c));
        matchQueue.add(new Match(a, c));
        Random rand = new Random();
        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();
            System.out.println("Match: " + m.t1.name + " vs " + m.t2.name);
            Team winner = rand.nextBoolean() ? m.t1 : m.t2;
            results.add(new Result(m, winner));
            leaderboard.remove(winner);
            winner.points += 3;
            leaderboard.add(winner);
        }
        System.out.println("\nResults:");
        for (Result r : results) {
            System.out.println(r.match.t1.name+" vs "+r.match.t2.name+" -> Winner: "+r.winner.name);
        }
        System.out.println("\n Leaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }
}