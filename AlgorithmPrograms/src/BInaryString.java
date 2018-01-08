import java.util.Arrays;
import java.util.Scanner;

public class BInaryString {
	
	public static void main(String[] args) {
		Utility ut=new Utility(); 

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.next();
		}
		System.out.println("Enter the key to be searched");
		String key=scan.next();
		Stopwatch sw=new Stopwatch();
		sw.start();
		ut.binsearch(arr,n,key);
		sw.end();
		sw.elapsedtime();

	}

}
