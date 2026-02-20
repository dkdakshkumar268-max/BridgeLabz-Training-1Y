import java.util.*;

public class StudentMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] m=new int[n][3];

        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                m[i][j]=10+(int)(Math.random()*90);

        System.out.println("P\tC\tM\tTotal\tAvg\t%");
        for(int i=0;i<n;i++){
            int total=m[i][0]+m[i][1]+m[i][2];
            double avg=Math.round((total/3.0)*100.0)/100.0;
            double per=Math.round((total/300.0*100)*100.0)/100.0;
            System.out.println(m[i][0]+"\t"+m[i][1]+"\t"+m[i][2]+"\t"+total+"\t"+avg+"\t"+per);
        }
    }
}
