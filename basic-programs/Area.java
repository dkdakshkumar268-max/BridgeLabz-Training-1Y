import java.util.*;
public class Area{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of the triangle (in cm(s)):");
	    double b=sc.nextDouble();
		System.out.println("Enter height of the triangle (in cm(s)):");
		double h=sc.nextDouble();
		double iarea=(1.0/2)*(h/2.54)*(b/2.54);
		double cmarea=(1.0/2)*h*b;
		System.out.println("Your Area in square cm(s) is "+cmarea+ " while in square inches is "+iarea);
	}
}