import java.util.*;
public class KmsToMiles2{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter distance (in kms):");
		double km=input.nextDouble();
		System.out.println("The total miles is "+(km*0.621371)+" mile for the given "+km+" km");
	}
}