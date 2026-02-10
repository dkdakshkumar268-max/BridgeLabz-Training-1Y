import java.util.*;
class FactorWhile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
        int number= sc.nextInt();
		int c=1;
        if(number<=0){
            System.out.println("Enter a positive number");
        }
        else{
            while(c<number) {
                if(number%c==0){
                    System.out.println(c);
                }
				c++;
            }
        }
    }
}
