import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {

		System.out.println("enter year");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
	    if ((year % 400) == 0)
	    {
	    	System.out.println(year+" is a leap year");
	    }
	    else if ((year % 100) == 0)
	    {
	    	System.out.println(year+" is not a leap year");

	    }
	    else if ((year % 4) == 0)
	    {
	    	System.out.println(year+" is a leap year");
	    }

	    else
	    {
	    	System.out.println(year+" is not a leap year");
	
	    }

	}

}
