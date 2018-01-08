import java.util.Random;
import java.util.Scanner;

public class Flip_coin {

	public static void main(String[] args) {
		Random ran=new Random();
		System.out.println("Number of times to flip coin");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<0)
		{
			System.out.println("Negative number, invalid!!");
			System.exit(0);
		}
		double tails=0;
		double heads=0;
		for(int i=0;i<n;i++)
		{
			double m=ran.nextDouble();
			System.out.println(m);
			if(m<0.5)
			{
				tails++;
			}
			else
			{
				heads++;
			}
		}
		System.out.println("Percentage of tails: "+ (tails/n)*100);
		System.out.println("Percentage of heads: "+ (heads/n)*100);

	}
}
