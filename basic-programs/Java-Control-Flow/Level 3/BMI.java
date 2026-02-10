import java.util.*;
public class BMI{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight in kg:");
        double w=sc.nextDouble();
        System.out.println("Enter height in cm:");
        double hcm=sc.nextDouble();
        double hm =hcm/100;
        double bmi=w/(hm*hm);
        System.out.println("BMI = "+bmi);
        if(bmi<18.5){
            System.out.println("Status: Underweight");
        }
        else if(bmi<25){
            System.out.println("Status: Normal weight");
        }
        else if(bmi<40){
            System.out.println("Status: Overweight");
        }
        else {
            System.out.println("Status: Obese");
        }
    }
}
