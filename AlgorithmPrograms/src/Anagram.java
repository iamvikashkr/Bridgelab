import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args)
	{
		Utility ut=new Utility();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=scan.nextLine();
		

		System.out.println("enter the second string");
		String s2=scan.nextLine();
		ut.anagram(s2,s1);
		
	}
}
