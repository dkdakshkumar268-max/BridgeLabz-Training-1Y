public class Earth{
	public static void main(String args[]){
	    int km=6378;
		double miles=km*0.6;
		double vkm=(4.0/3)*Math.PI*Math.pow(km,3);
		double vmiles=(4.0/3)*Math.PI*Math.pow(miles,3);
		System.out.println("The volume of earth in cubic kilometers is "+vkm+ " and cubic miles is "+vmiles);
	}
}