import java.util.Scanner;

public class BMIWith2DArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            System.out.print("Weight (kg): ");
            double weight = sc.nextDouble();
            
            System.out.print("Height (meters): ");
            double height = sc.nextDouble();
            
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }
            
            personData[i][0] = weight;
            personData[i][1] = height;
        }
        
        for (int i = 0; i < number; i++) {
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;
            
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } 
            else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } 
            else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } 
            else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nResults:");
        
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                               " | Height: " + personData[i][1] +
                               " m | Weight: " + personData[i][0] +
                               " kg | BMI: " + personData[i][2] +
                               " | Status: " + weightStatus[i]);
        }
        
        sc.close();
    }
}
