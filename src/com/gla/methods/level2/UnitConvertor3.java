import java.util.Scanner;

public class UnitConvertor3 {

    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        System.out.println("Celsius: " + convertFahrenheitToCelsius(f));
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(convertFahrenheitToCelsius(f)));
        System.out.println("Pounds to Kg (1lb): " + convertPoundsToKg(1));
        System.out.println("Kg to Pounds (1kg): " + convertKgToPounds(1));
        System.out.println("Gallons to Liters (1gal): " + convertGallonsToLiters(1));
        System.out.println("Liters to Gallons (1L): " + convertLitersToGallons(1));

        sc.close();
    }
}
