import java.util.Scanner;

public class MergeSortInt { 
		static Utility ut=new Utility();
	static void sort(int arr[], int l, int r)
	    {
		 
	        if (l < r)
	        {
	            // Find the middle point
	            int m = (l+r)/2;
	 
	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr , m+1, r);
	 
	            // Merge the sorted halves
	            ut.mergeInt(arr, l, m, r);
	        }
	    }
	

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size ofArray");
		int n=scan.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		
		sort(arr,0,arr.length-1);
		System.out.println("sorted array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
