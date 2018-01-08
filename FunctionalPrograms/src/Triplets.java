import java.util.Scanner;

public class Triplets {
	static void findTriplets(int arr[], int n)
	{
	    
	    int count=0;
	    for (int i=0; i<n-2; i++)
	    {
	        for (int j=i+1; j<n-1; j++)
	        {
	            for (int k=j+1; k<n; k++)
	            {
	                if (arr[i]+arr[j]+arr[k] == 0)
	                {
	                    System.out.println("Triplets: "+arr[i]+" "+arr[j]+" "+arr[k]+" ");
	                    
	                    count++;
	                }
	            }
	        }
	    }
	    System.out.println("Number of triplets: "+count);
	    
	}

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		findTriplets(arr,n);
	}

}
