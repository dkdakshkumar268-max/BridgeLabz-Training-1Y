import java.util.Scanner;

public class StudentGradeWith2DArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            System.out.print("Physics: ");
            double physics = sc.nextDouble();
            
            System.out.print("Chemistry: ");
            double chemistry = sc.nextDouble();
            
            System.out.print("Maths: ");
            double maths = sc.nextDouble();
            
            if (physics < 0 || chemistry < 0 || maths < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
                continue;
            }
            
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;
        }
        
        for (int i = 0; i < n; i++) {
            double total = 0;
            
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            
            percentage[i] = total / 3.0;
            
            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } 
            else if (percentage[i] >= 80) {
                grade[i] = "A";
            } 
            else if (percentage[i] >= 70) {
                grade[i] = "B";
            } 
            else if (percentage[i] >= 60) {
                grade[i] = "C";
            } 
            else if (percentage[i] >= 50) {
                grade[i] = "D";
            } 
            else {
                grade[i] = "F";
            }
        }
        
        System.out.println("\nResults:");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                               " | Physics: " + marks[i][0] +
                               " | Chemistry: " + marks[i][1] +
                               " | Maths: " + marks[i][2] +
                               " | Percentage: " + percentage[i] +
                               " | Grade: " + grade[i]);
        }
        
        sc.close();
    }
}
