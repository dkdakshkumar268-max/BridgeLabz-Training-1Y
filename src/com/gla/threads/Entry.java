class Entry implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Entry Monitoring | State: " + Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

class QuestionPaper implements Runnable {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        System.out.println("Question Paper Distribution Started | State: " + Thread.currentThread().getState());
    }
}

class Attendance implements Runnable {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        System.out.println("Attendance Marking Started | State: " + Thread.currentThread().getState());
    }
}

class Collection implements Runnable {
    public void run() {
        try {
            Thread.sleep(15000);
        } catch (Exception e) {
        }
        System.out.println("Answer Sheet Collection Started | State: " + Thread.currentThread().getState());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Entry(), "Entry");
        Thread t2 = new Thread(new QuestionPaper(), "QuestionPaper");
        Thread t3 = new Thread(new Attendance(), "Attendance");
        Thread t4 = new Thread(new Collection(), "Collection");

        t2.setPriority(10);
        t3.setPriority(8);
        t4.setPriority(7);
        t1.setPriority(5);

        System.out.println("Initial State:");
        System.out.println(t1.getName() + ": " + t1.getState());
        System.out.println(t2.getName() + ": " + t2.getState());
        System.out.println(t3.getName() + ": " + t3.getState());
        System.out.println(t4.getName() + ": " + t4.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("After Start:");
        System.out.println(t1.getName() + ": " + t1.getState());
        System.out.println(t2.getName() + ": " + t2.getState());
        System.out.println(t3.getName() + ": " + t3.getState());
        System.out.println(t4.getName() + ": " + t4.getState());

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {
        }

        System.out.println("Final State:");
        System.out.println(t1.getName() + ": " + t1.getState());
        System.out.println(t2.getName() + ": " + t2.getState());
        System.out.println(t3.getName() + ": " + t3.getState());
        System.out.println(t4.getName() + ": " + t4.getState());
    }
}