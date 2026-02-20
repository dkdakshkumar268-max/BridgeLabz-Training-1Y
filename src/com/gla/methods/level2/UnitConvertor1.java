import java.util.Scanner;

public class UnitConvertor1 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();

        System.out.println("Miles: " + convertKmToMiles(km));
        System.out.println("Kilometers: " + convertMilesToKm(convertKmToMiles(km)));
        System.out.println("Feet: " + convertMetersToFeet(1));
        System.out.println("Meters: " + convertFeetToMeters(1));

        sc.close();
    }
}
