class BankAccount {
    String name;
    String type;

    BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class User implements Runnable {
    BankAccount account;

    User(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("User: " + account.name + " | Type: " + account.type + " | Priority: " + Thread.currentThread().getPriority() + " | Checking Balance...");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount premium = new BankAccount("Daksh", "Premium");
        BankAccount regular = new BankAccount("Abhay", "Regular");
        BankAccount basic = new BankAccount("Anubhav", "Basic");

        Thread t1 = new Thread(new User(premium));
        Thread t2 = new Thread(new User(regular));
        Thread t3 = new Thread(new User(basic));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}