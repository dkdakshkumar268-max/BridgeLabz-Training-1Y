import java.util.*;
class Multiples{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 to 100:");
        int number= sc.nextInt();
        if(number<=0||number>=100){
            System.out.println("Enter a valid number");
        }
        else{
            for(int i=99;i>=1;i--) {
                if(i%number==0){
                    System.out.println(i);
                }
            }
        }
    }
}
