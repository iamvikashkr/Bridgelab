import java.io.PrintWriter;
import java.util.Scanner;

public class Array_2d {
	static Scanner scan=new Scanner(System.in);


	public static void intarr(int m, int n)
	{
		int a[][]=new int[m][n];
		System.out.println("Taking integer inputs");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		//return a;
		System.out.println("Printing integer array");
		PrintWriter pw=new PrintWriter(System.out,true);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(a[i][j]+" ");
			}
			pw.println();

		}
		pw.println();


	}


	public static void doublearr(int m,int n)
	{
		double b[][]=new double[m][n];
		System.out.println("Taking double array");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=scan.nextDouble();
			}
		}
		//return b;
		System.out.println("Printing double array");
		PrintWriter pw=new PrintWriter(System.out,true);

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(b[i][j]+" ");
			}
			pw.println();

		}
		pw.println();
	}

	public static void booleanarr(int m,int n)
	{
		boolean c[][]=new boolean[m][n];
		System.out.println("Taking boolean array");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=scan.nextBoolean();
			}
		}
		//return c;
		System.out.println("Printing boolean array");
		PrintWriter pw=new PrintWriter(System.out,true);

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(c[i][j]+" ");
			}
			pw.println();

		}
		pw.println();
	}


	public static void main(String[] args) {

		System.out.println("Enter no of rowss");
		int m=scan.nextInt();

		System.out.println("Enter no of column");
		int n=scan.nextInt();

		System.out.println("1. Integer Array");
		System.out.println("2. Double Array");
		System.out.println("3.Boolean array");
		while(true)
		{
			System.out.println("Enter your choice");

			int choice=scan.nextInt();

			switch(choice)
			{
			case 1: intarr( m, n);
			break;
			case 2: doublearr(m,n);
			break;
			case 3: booleanarr(m,n);
			break;
			default: System.out.println("Exit");
			System.exit(0);

			}

		}

	}
}
