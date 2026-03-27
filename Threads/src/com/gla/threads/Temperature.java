class Temperature implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Temperature Sensor | Time: " + System.currentTimeMillis() + " | Reading temperature");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        }
    }
}

class SecurityCamera extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Security Camera | Time: " + System.currentTimeMillis() + " | Recording...");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}

class Light implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Light Controller | Time: " + System.currentTimeMillis() + " | Adjusting lights");
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
            }
        }
    }
}

class Door implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Door Lock | Time: " + System.currentTimeMillis() + " | Checking lock");
            try {
                Thread.sleep(6000);
            } catch (Exception e) {
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Temperature());
        Thread t2 = new SecurityCamera();
        Thread t3 = new Thread(new Light());
        Thread t4 = new Thread(new Door());

        t2.setPriority(10);
        t1.setPriority(7);
        t3.setPriority(5);
        t4.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {
        }
    }
}