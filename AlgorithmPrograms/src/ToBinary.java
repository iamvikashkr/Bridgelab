import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {
		Utility ut=new Utility();

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int dec=scan.nextInt();
		
		ut.tobin(dec);
	
		
		
	}

}
