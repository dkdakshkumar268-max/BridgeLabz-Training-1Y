import java.util.*;
public class Uni2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fee amount:");
	    double fee=sc.nextDouble();
		System.out.println("Enter discount percentage:");
		double discountPercentage=sc.nextDouble();
		double discount=(fee*discountPercentage)/100.0;
		double pay=fee-discount;
		System.out.println("The discount amount is INR "+discount+ " and final discounted fee is INR "+pay);
	}
}