import java.util.*;
public class Marks{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks scored in Maths:");
		double x=sc.nextDouble();
		System.out.println("Enter marks scored in Physics:");
		double y=sc.nextDouble();
		System.out.println("Enter marks scored in Chemistry:");
		double z=sc.nextDouble();
		double avg=(x+y+z)/3.0;
		if(avg>=80)
		{
			System.out.println("Marks scored: "+avg+"%");
		    System.out.println("Grade = A");
		    System.out.println("Level 4, above agency-normalized standards");
		}
		else if(avg>=70)
		{
			System.out.println("Marks scored: "+avg+"%");
		    System.out.println("Grade = B");
		    System.out.println("Level 3, at agency-normalized standards");
		}
	    else if(avg>=60)
		{
			System.out.println("Marks scored: "+avg+"%");
		    System.out.println("Grade = C");
		    System.out.println("Level 2, below, but approaching agency-normalized standards");
		}
		else if(avg>=50)
		{
			System.out.println("Marks scored: "+avg+"%");
		    System.out.println("Grade = D");
		    System.out.println("Level 1, well below agency-normalized standards");
		}
		else if(avg>=40)
		{
			System.out.println("Marks scored: "+avg+"%");
		    System.out.println("Grade = E");
		    System.out.println("Level 1-, too below agency-normalized standards");
		}
		else 
		{
			System.out.println("Marks scored: "+avg+"%");
		    System.out.println("Grade = R");
		    System.out.println("Remidal standards");
		}
	}
}
