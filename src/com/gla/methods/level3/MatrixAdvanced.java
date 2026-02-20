public class MatrixAdvanced {
    static int[][] rand(int n){
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=(int)(Math.random()*5)+1;
        return a;
    }

    static void print(double[][] a){
        for(double[] r:a){
            for(double x:r) System.out.print(x+" ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[][] A=rand(2);
        double det=A[0][0]*A[1][1]-A[0][1]*A[1][0];

        System.out.println("2x2 Matrix:");
        for(int[] r:A){ for(int x:r) System.out.print(x+" "); System.out.println(); }

        System.out.println("Determinant: "+det);

        if(det!=0){
            double[][] inv={
                {A[1][1]/det, -A[0][1]/det},
                {-A[1][0]/det, A[0][0]/det}
            };
            System.out.println("Inverse:");
            print(inv);
        }
    }
}
