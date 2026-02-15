import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number < 0) {
            number = -number;
        }
        
        int temp = number;
        int count = 0;
        
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        
        if (count == 0) {
            count = 1;
        }
        
        int[] digits = new int[count];
        temp = number;
        int index = 0;
        
        while (index < count) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }
        
        int[] frequency = new int[10];
        
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        
        System.out.println("Digit Frequencies:");
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " = " + frequency[i]);
            }
        }
        
        sc.close();
    }
}
