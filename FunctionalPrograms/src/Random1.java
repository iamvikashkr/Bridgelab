import java.util.Random;
import java.util.Scanner;

public class Random1 {

	public static void main(String[] args) {
		Random rn = new Random();

		int max=10;
		int min=0;
			
		Random rn1 = new Random();
		int n = max- min+ 1;
		int val = rn1.nextInt() % n;
		
		
		for(int i=0;i<5;i++)
		{
			int nw=rn1.nextInt(11);
			System.out.print(nw+" ");
		}
	}

}
