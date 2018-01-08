import java.util.Scanner;

public class Prime_factor {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			int nw=n;
			while(nw%i==0)
			{
			int isprime=1;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isprime=0;
					break;
				}
			}
			if(isprime==1)
			{
				System.out.print(i+" ");
			}
			nw=nw/i;
		}
	}

}
}
