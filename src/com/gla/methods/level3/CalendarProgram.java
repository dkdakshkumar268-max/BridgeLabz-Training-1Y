import java.util.*;

public class CalendarProgram {
    static boolean leap(int y){ return (y%4==0 && y%100!=0)||y%400==0; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(), y=sc.nextInt();

        String[] months={"January","February","March","April","May","June",
                         "July","August","September","October","November","December"};
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && leap(y)) days[1]=29;

        int d=1;
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int first=(d+x+(31*m0)/12)%7;

        System.out.println("\n "+months[m-1]+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for(int i=0;i<first;i++) System.out.print("    ");
        for(int i=1;i<=days[m-1];i++){
            System.out.printf("%3d ",i);
            if((i+first)%7==0) System.out.println();
        }
    }
}
