import java.util.Scanner;

public class Tempconversion {

	public static void main(String[] args) {
		Utility ut=new Utility();
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter your choice");
		while(true)
		{		
		int choice =scan.nextInt();
		switch(choice)
		{
		case 1: System.out.println("enter the temperature in celsius");
				int cel=scan.nextInt();
				ut.celtofar(cel);
				break;
				
		case 2: System.out.println("Enter the temperature in fahrenhite");
				int feh=scan.nextInt();
				ut.fartocel(feh);
				break;

		}
		}
	}

}