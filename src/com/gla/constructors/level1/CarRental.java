class CarRental {
    String customerName, carModel;
    int rentalDays;
    double rate = 1000;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double totalCost() {
        return rentalDays * rate;
    }

    public static void main(String[] args) {
        CarRental r = new CarRental("Abhay", "Swift", 3);
        System.out.println(r.totalCost());
    }
}
