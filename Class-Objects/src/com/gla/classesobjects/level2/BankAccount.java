class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String h, int n, double b) {
        accountHolder = h;
        accountNumber = n;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (balance >= amt) balance -= amt;
    }

    void display() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("Abhay", 1234, 1000);
        a.deposit(500);
        a.withdraw(200);
        a.display();
    }
}
