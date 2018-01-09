import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of a, ,b, c");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		//System.out.println(a+" "+b+" "+c);
		double delta=(b*b-4*a*c);
		System.out.println(delta);
		double root1=(-b + Math.sqrt(delta))/(2*a);
		double root2=(-b - Math.sqrt(delta))/(2*a);
		if(delta>0)
		{
			System.out.println("Two roots are");
			System.out.println("Root 1: "+root1);
			System.out.println("Root 2: "+root2);
			
		}
		else if(delta==0)
		{
			System.out.println("Roots are real and equal");
			System.out.println("Roots are: "+root1);
			
		}
		else {
			System.out.println("Roots are imaginary");
			System.out.println("Root 1: "+root1);
			System.out.println("Root 2: "+root2);
			
		}
	
		
		

		
		
	}

}
