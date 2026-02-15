import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            
            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
        }
        
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        System.out.println();
        System.out.println("Youngest friend is: " + names[youngestIndex]);
        System.out.println("Tallest friend is: " + names[tallestIndex]);
        
        sc.close();
    }
}
