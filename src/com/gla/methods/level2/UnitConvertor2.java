import java.util.Scanner;

public class UnitConvertor2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();

        System.out.println("Feet: " + convertYardsToFeet(yards));
        System.out.println("Yards: " + convertFeetToYards(convertYardsToFeet(yards)));
        System.out.println("Meters to Inches (1m): " + convertMetersToInches(1));
        System.out.println("Inches to Meters (1in): " + convertInchesToMeters(1));
        System.out.println("Inches to Cm (1in): " + convertInchesToCm(1));

        sc.close();
    }
}
