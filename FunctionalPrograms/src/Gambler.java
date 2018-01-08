import java.util.Random;
import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {

		System.out.println("Enter stake");
		Scanner scan=new Scanner(System.in);
		int stake=scan.nextInt();
		System.out.println("Enter goal");
		int goal=scan.nextInt();
		System.out.println("Enter number of times");
		int times=scan.nextInt();
		Random rn=new Random();
		
		int bet=0;
		int win=0;
		for(int i=0;i<times;i++)
		{
			int total=stake;
			while(total>0 && total<goal)
			{
				bet++;
				if(rn.nextDouble()>0.5)
				{
					total++;
				}
				else
				{
					total--;
				}
			}
			if(total==goal)
			{
				win++;
			}
			System.out.println("total "+total);

		}
		System.out.println("Number of wins "+win);
		System.out.println("Percent of games won = " + 100.0 * win / times);
		System.out.println("Number of bets "+bet);
		
	}

}
