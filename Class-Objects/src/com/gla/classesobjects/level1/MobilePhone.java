classclass MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println(brand + " " + model + " " + price);
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Samsung", "S23", 75000);
        m.display();
    }
}
 
