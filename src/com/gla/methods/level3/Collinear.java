import java.util.*;

public class Collinear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextDouble(), y1=sc.nextDouble();
        double x2=sc.nextDouble(), y2=sc.nextDouble();
        double x3=sc.nextDouble(), y3=sc.nextDouble();

        boolean slope = (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1);

        double area = 0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));

        System.out.println("Collinear (Slope): "+slope);
        System.out.println("Collinear (Area): "+(area==0));
    }
}
