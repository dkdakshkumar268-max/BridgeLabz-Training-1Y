import java.util.*;
class Factor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
        int number= sc.nextInt();
        if(number<=0){
            System.out.println("Enter a positive number");
        }
        else{
            for(int i=1;i<number;i++) {
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
