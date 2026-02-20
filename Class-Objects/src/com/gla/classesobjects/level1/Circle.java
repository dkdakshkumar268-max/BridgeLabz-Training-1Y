class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void display() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println(area + " " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
    }
}
