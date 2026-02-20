class Book1 {
    String title, author;
    double price;
    boolean available = true;

    Book1(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void borrow() {
        if (available) available = false;
    }

    public static void main(String[] args) {
        Book1 b = new Book1("Java", "James", 400);
        b.borrow();
        System.out.println(b.available);
    }
}
