class CartItem {
    String itemName;
    double price;
    int quantity;

    void add(String n, double p, int q) {
        itemName = n;
        price = p;
        quantity = q;
    }

    void remove() {
        quantity = 0;
    }

    void total() {
        System.out.println(price * quantity);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.add("Book", 200, 2);
        c.total();
        c.remove();
    }
}
