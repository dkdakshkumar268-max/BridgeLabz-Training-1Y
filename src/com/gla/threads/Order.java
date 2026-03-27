class Order implements Runnable {
    int id;
    String restaurant;
    int deliveryTime;
    String type;

    Order(int id, String restaurant, int deliveryTime, String type) {
        this.id = id;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
        this.type = type;
    }

    public void run() {
        long start = System.currentTimeMillis();

        System.out.println("Agent: " + Thread.currentThread().getName() + " | Order: " + id + " | " + type + " | Picked up from " + restaurant);

        try {
            Thread.sleep(deliveryTime * 1000 / 2);
        } catch (Exception e) {
        }

        System.out.println("Agent: " + Thread.currentThread().getName() + " | Order: " + id + " | In Transit");

        try {
            Thread.sleep(deliveryTime * 1000 / 2);
        } catch (Exception e) {
        }

        long end = System.currentTimeMillis();

        System.out.println("Agent: " + Thread.currentThread().getName() + " | Order: " + id + " | Delivered | Total Time: " + (end - start) + " ms");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Order(1, "Dominos", 4, "Express"), "Agent-1");
        Thread t2 = new Thread(new Order(2, "KFC", 6, "Standard"), "Agent-2");
        Thread t3 = new Thread(new Order(3, "McDonalds", 5, "Economy"), "Agent-3");
        Thread t4 = new Thread(new Order(4, "BurgerKing", 3, "Express"), "Agent-4");
        Thread t5 = new Thread(new Order(5, "PizzaHut", 7, "Standard"), "Agent-5");

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(10);
        t5.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}