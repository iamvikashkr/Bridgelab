
public class Windchill {

	public static void main(String[] args) {

		System.out.println("Your first argument is: "+args[0]);  
		System.out.println("Your Second argument is: "+args[1]);
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);

		double windChill = 35.74 + 0.6215 * t -
				35.75 * Math.pow(v, 0.16) +
				0.4275 * t * Math.pow(v, 0.16);

		System.out.println("The wind chill is: "+windChill);

	}

}
