public class EmployeeBonus {
    public static void main(String[] args){
        double[][] emp=new double[10][2];
        double totalOld=0,totalNew=0,totalBonus=0;

        for(int i=0;i<10;i++){
            emp[i][0]=10000+(int)(Math.random()*90000);
            emp[i][1]=(int)(Math.random()*10)+1;
        }

        System.out.println("Old\tYears\tBonus\tNew");

        for(int i=0;i<10;i++){
            double rate=emp[i][1]>5?0.05:0.02;
            double bonus=emp[i][0]*rate;
            double newSal=emp[i][0]+bonus;

            totalOld+=emp[i][0];
            totalNew+=newSal;
            totalBonus+=bonus;

            System.out.println(emp[i][0]+"\t"+emp[i][1]+"\t"+bonus+"\t"+newSal);
        }

        System.out.println("\nTotal Old: "+totalOld);
        System.out.println("Total Bonus: "+totalBonus);
        System.out.println("Total New: "+totalNew);
    }
}
