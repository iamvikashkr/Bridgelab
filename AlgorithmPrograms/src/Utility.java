import java.util.Arrays;
import java.util.Scanner;

public class Utility {

	static public void binsearch(String arr[],int n,String key)
	{
		Arrays.sort(arr);
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");		
		}*/
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid].compareTo(key)<0)
			{
				low=mid+1;
			}
			else if(arr[mid].compareTo(key)>0)
			{
				high=mid-1;
			}
			else
			{
				System.out.println("Element found:  "+arr[mid]);
				return;
			}
		}
		System.out.println("Element not found");

	}
	public  void insertion(String[] arr, int n) {

		for(int i=1;i<n;i++)
		{
			String key=arr[i];
			int j=i-1;
			while(j>=0 && key.compareTo(arr[j])<0)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;	

		}
		System.out.println("Sorted array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}
	public  void bubble(String[] arr, int n) {

		for(int i=0;i<n;i++) 
		{
			for(int j=1;j<n;j++)
			{
				if(arr[j-1].compareTo(arr[j])>0)
				{
					String temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is: ");

		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void bubbleInt(int arr[], int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted array is");

		for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void InsertionInt(int arr[], int n)
	{
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		System.out.println("sorted array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	static public void binsearchInt(int arr[],int n,int key)
	{
		Arrays.sort(arr);
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");		
		}*/
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key>arr[mid])
			{
				low=mid+1;
			}
			else if(key<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				System.out.println("Element found:  "+arr[mid]);
				return;
			}
		}
		System.out.println("Element not found");

	}

	void mergeInt(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int [n1];
		int R[] = new int [n2];

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	public void celtofar(int cel)
	{

		int far=((cel * 9/5) + 32 );
		System.out.println("Temperature in fanrenheit is: "+ far);
	}
	public void fartocel(int feh) {

		int cel=((feh- 32) * 5/9 );
		System.out.println("Temperature in clesius is: "+ cel);


	}

	public void monthly(double P,double Y,double R)
	{
		double n=12*Y;
		double r=R/(12*100);

		double payment=(P*r)/(1-Math.pow((1+r),(-n)));

		System.out.println("Monthly payment is: "+payment);



	}
	public char[] tobin(int dec) {

		String binary="";

		while(dec>0)
		{
			int rem=dec%2;
			dec=dec/2;
			binary=binary+rem;

		}


		while(binary.length()!=8)
		{

			binary=binary+"0";
		}
		int j=0;
		char fin[]=new char[binary.length()];
		char[] bin=binary.toCharArray();
		for(int i=bin.length-1;i>=0;i--)
		{

			fin[j]=bin[i];
			j++;
		}
		System.out.println("Binary equivalent is:");
		for(int i=0;i<fin.length;i++)
		{

			System.out.print(fin[i]);
		}
		return fin ;
	}
	public void binaryToDecimal(int num) {

		int n=num;
		int base=1;
		int dec=0;

		while(n>0)
		{
			int last=n%10;
			n=n/10;
			dec=dec+last*base;
			base=base*2;

		}
		System.out.println(dec);		


	}
	public void anagram(String s2, String s1)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();

		int flag=1;
		if(s1.length()!=s2.length())
		{
			System.out.println("not a amagram");
			System.exit(0);
		}
		char c1[]=s1.toCharArray();
		Arrays.sort(c1);
		char c2[]=s2.toCharArray();
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]==c2[i])
			{
				flag=0;
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not an anagram");
		}
	}

	public int   palindrom(int n)
	{
		int rev=0,rem;
		int num=n;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(n==rev)
		{
			return rev;
		}
		else
		{
			return 0;
		}
	}


	public int prim(int n)
	{
		int i ,flag =0;
		for(i=2;i<n/2;i++)
		{	//flag=0;
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}	
		if(flag==0)
		{
			return flag;
		}
		else
		{
			return flag;
		}
	}
	public int dayofweek(int month, int day, int year) {


		int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4}; 
		year = (year -((month < 3)?1:0));
		return (year + year/4 - year/100 + year/400 + t[month-1] + day ) % 7;
	}

}