import java.util.*;
public class Distance{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance (in feets):");
		double f=sc.nextDouble();
		System.out.println("Your distance in yards is "+(f/3)+" while in miles is "+(f/5280));
	}
}