import java.util.*;

class Ticket extends Thread {
    static long totalTime = 0;
    static Map<Integer, List<Long>> stats = new HashMap<>();

    int id;
    String type;
    int priority;

    Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
    }

    public void run() {
        long start = System.currentTimeMillis();
        System.out.println("Start | Ticket: " + id + " | Type: " + type + " | Agent: " + getName() + " | Priority: " + priority);

        int sleepTime = new Random().nextInt(5) + 1;
        try {
            Thread.sleep(sleepTime * 1000);
        } catch (Exception e) {
        }

        long end = System.currentTimeMillis();
        long time = end - start;

        synchronized (Ticket.class) {
            totalTime += time;
            stats.putIfAbsent(priority, new ArrayList<>());
            stats.get(priority).add(time);
        }

        System.out.println("End   | Ticket: " + id + " | Completed | Time: " + time + " ms");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Ticket[] tickets = new Ticket[10];

        tickets[0] = new Ticket(1, "Critical Bug", 10);
        tickets[1] = new Ticket(2, "Feature Request", 4);
        tickets[2] = new Ticket(3, "General Query", 2);
        tickets[3] = new Ticket(4, "Feedback", 1);
        tickets[4] = new Ticket(5, "Critical Bug", 10);
        tickets[5] = new Ticket(6, "General Query", 2);
        tickets[6] = new Ticket(7, "Feature Request", 4);
        tickets[7] = new Ticket(8, "Feedback", 1);
        tickets[8] = new Ticket(9, "Critical Bug", 10);
        tickets[9] = new Ticket(10, "General Query", 2);

        Arrays.sort(tickets, (a, b) -> b.priority - a.priority);

        for (int i = 0; i < tickets.length; i++) {
            tickets[i].setName("Agent-" + (i + 1));
            tickets[i].setPriority(tickets[i].priority);
            System.out.println("Queue Position " + (i + 1) + " -> Ticket: " + tickets[i].id + " | Type: " + tickets[i].type + " | Priority: " + tickets[i].priority);
        }

        long systemStart = System.currentTimeMillis();

        for (Ticket t : tickets) t.start();
        for (Ticket t : tickets) t.join();

        long systemEnd = System.currentTimeMillis();

        System.out.println("Total Processing Time: " + (systemEnd - systemStart) + " ms");

        for (int p : Ticket.stats.keySet()) {
            List<Long> list = Ticket.stats.get(p);
            long sum = 0;
            for (long t : list) sum += t;
            System.out.println("Priority " + p + " Avg Time: " + (sum / list.size()) + " ms");
        }
    }
}