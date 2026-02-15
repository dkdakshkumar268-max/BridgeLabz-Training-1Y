import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number < 0) {
            number = -number;
        }
        
        int tempNumber = number;
        int count = 0;
        
        while (tempNumber != 0) {
            count++;
            tempNumber /= 10;
        }
        
        if (count == 0) {
            count = 1;
        }
        
        int[] digits = new int[count];
        tempNumber = number;
        int index = 0;
        
        while (index < count) {
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
            index++;
        }
        
        int[] reversed = new int[count];
        
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }
        
        System.out.print("Reversed number: ");
        
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
        
        sc.close();
    }
}
