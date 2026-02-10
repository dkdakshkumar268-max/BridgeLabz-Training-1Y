import java.util.*;
class GreatestFactor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
        int number= sc.nextInt();
		int greatestFactor=0;
        if(number<=0){
            System.out.println("Enter a positive number");
        }
        else{
            for(int i=number-1;i>=1;i--) {
                if(number%i==0){
                    greatestFactor=i;
					break;
                }
            }
        }
		System.out.println("Greatest Factor= "+greatestFactor);
    }
}
