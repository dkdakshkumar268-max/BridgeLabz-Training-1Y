import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000.0 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (m): ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2 (m): ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3 (m): ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);

        System.out.println("Rounds needed to complete 5km: " + rounds);

        sc.close();
    }
}
