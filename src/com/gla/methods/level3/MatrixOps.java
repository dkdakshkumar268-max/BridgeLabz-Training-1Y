public class MatrixOps {
    static int[][] rand(int r,int c){
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=(int)(Math.random()*10);
        return a;
    }

    static void print(int[][] a){
        for(int[] r:a){
            for(int x:r) System.out.print(x+" ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[][] A=rand(2,2), B=rand(2,2);
        int[][] add=new int[2][2], sub=new int[2][2], mul=new int[2][2];

        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++){
                add[i][j]=A[i][j]+B[i][j];
                sub[i][j]=A[i][j]-B[i][j];
                for(int k=0;k<2;k++)
                    mul[i][j]+=A[i][k]*B[k][j];
            }

        System.out.println("Matrix A:"); print(A);
        System.out.println("Matrix B:"); print(B);
        System.out.println("Add:"); print(add);
        System.out.println("Subtract:"); print(sub);
        System.out.println("Multiply:"); print(mul);
    }
}
