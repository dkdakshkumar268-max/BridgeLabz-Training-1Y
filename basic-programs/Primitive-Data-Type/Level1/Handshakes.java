import java.util.*;
public class Handshakes{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int nos=sc.nextInt();
		int noh=(nos*(nos-1))/2;
		System.out.println("Number of possible handshakes =  "+noh);
	}
}