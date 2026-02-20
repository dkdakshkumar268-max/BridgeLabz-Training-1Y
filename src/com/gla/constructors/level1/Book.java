class Book {
    String title, author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 500);
        System.out.println(b1.title + " " + b2.title);
    }
}
