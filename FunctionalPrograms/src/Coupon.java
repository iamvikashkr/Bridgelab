import java.util.Random;
import java.util.Scanner;

public class Coupon {

	public static void main(String[] args) {

		System.out.println("Number of distinct coupons");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		
		Random rn=new Random();
		double arr[]=new double[N];
		int count=0;
		int k=0;
		int max=15;
		int min=0;
		int n=max-min+1;
		while(k<=N-1)
		{
			
			int rand=rn.nextInt()%n;
			//int rand = rn.nextInt(15) + 5;
			count++;
			System.out.print(rand+" ");
			for(int i=0;i<N;i++)
			{
				if(arr[i]==rand)
				{
				break;	
				}
				else if(i==N-1)
				{
					arr[k]=rand;
					k++;
				}
			}	
				
		}
				System.out.println();
				System.out.println("Total random numbers generated: "+count);
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]+" ");
				}
	}

}
