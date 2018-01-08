
public class Distance {

	public static void main(String[] args) {

		System.out.println("Your first argument is: "+args[0]);  
		System.out.println("Your Second argument is: "+args[1]);  

		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		
		System.out.println("Distance is "+ Math.sqrt((Math.pow(x,2)+Math.pow(y, 2))));
	}

}
