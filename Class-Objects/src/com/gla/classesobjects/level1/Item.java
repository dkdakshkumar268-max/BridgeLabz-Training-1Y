class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int c, String n, double p) {
        itemCode = c;
        itemName = n;
        price = p;
    }

    void display(int qty) {
        System.out.println(itemCode + " " + itemName + " " + (price * qty));
    }

    public static void main(String[] args) {
        Item i = new Item(1, "Pen", 10);
        i.display(5);
    }
}
