import java.util.Scanner;

public class VendingMachine {
	static int i=0;
	static int total=0;
	public static void vending(int notes[], int money) {
		// TODO Auto-generated method stub
		int rem;

		if(money==0) 
		{
			return;			
		}	
		else 
		{
			if(money>=notes[i])
			{
				int count=money/notes[i];
				rem=money%notes[i];
				money=rem;
				total=total+count;
				System.out.print(notes[i]+"    ");
			}
			/*if(i==notes.length)
			{
				System.exit(0);;

			}*/
			i++;

			vending(notes,money);

		}

	}

	public static void main(String[] args) {

		int notes[]= {1000,500,100,50,20,10,5,2,1};
		System.out.println("Enter the money value");;
		Scanner scan=new Scanner(System.in);
		int money=scan.nextInt();

		vending(notes, money);
		System.out.println();

		System.out.println("Total no of notes: "+ total);


	}



}
