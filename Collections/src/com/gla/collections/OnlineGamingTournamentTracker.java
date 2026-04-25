import java.util.*;

class Player {
    int id;
    String name;
    Player(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return id == p.id;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
}
class Match {
    Player p1, p2;
    Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}
class Result {
    Match match;
    Player winner;
    Result(Match match, Player winner) {
        this.match = match;
        this.winner = winner;
    }
}
class Score implements Comparable<Score> {
    Player player;
    int points;
    Score(Player player) {
        this.player = player;
        this.points = 0;
    }
    public int compareTo(Score s) {
        if (this.points != s.points)
            return s.points - this.points;
        return this.player.id - s.player.id;
    }
}
public class OnlineGamingTournamentTracker {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        Queue<Match> matchQueue = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();
        Map<Integer, Score> scoreMap = new HashMap<>();
        Player p1 = new Player(1, "Akshat");
        Player p2 = new Player(2, "Shikhar");
        Player p3 = new Player(3, "Praveen");

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(new Player(1, "AKshat"));
        for (Player p : players) {
            Score s = new Score(p);
            leaderboard.add(s);
            scoreMap.put(p.id, s);
        }
        matchQueue.add(new Match(p1, p2));
        matchQueue.add(new Match(p2, p3));
        matchQueue.add(new Match(p1, p3));
        Random rand = new Random();
        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();
            Player winner = rand.nextBoolean() ? m.p1 : m.p2;
            Result r = new Result(m, winner);
            results.add(r);
            Score s = scoreMap.get(winner.id);
            leaderboard.remove(s);
            s.points += 10;
            leaderboard.add(s);
        }
        System.out.println("Match Results:");
        for (Result r : results) {
            System.out.println(r.match.p1.name+" vs "+r.match.p2.name+" -> Winner: "+r.winner.name);
        }
        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s.player.name + " : " + s.points);
        }
    }
}