import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String perm=scan.next();
		Utility ut=new Utility();
		System.out.println("Using Iteration Method......");
		ut.permItr(perm);
		
		
		System.out.println("Using Recursion method......");
		int l=0;
		int r=perm.length()-1;
		ut.permRec(perm, l,  r);

		
	}

}
