import java.util.*;
public class Total{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter unit price of the product:");
	    double up=sc.nextDouble();
		System.out.println("Enter quantity of the product:");
		int qt=sc.nextInt();
		System.out.println("The total purchase price is INR "+(up*qt)+" if the quantity "+qt+ " and unit price is INR "+up);
	}
}