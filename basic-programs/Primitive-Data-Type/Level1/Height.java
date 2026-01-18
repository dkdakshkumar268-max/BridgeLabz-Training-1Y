import java.util.*;
public class Height{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height (in cm(s)):");
	    double cm=sc.nextDouble();
		double inches=cm/2.54;
		double feet=inches/12.0;
		System.out.println("Your Height in cm is "+cm+ " while in feet is "+feet+ " and inches is "+inches);
	}
}