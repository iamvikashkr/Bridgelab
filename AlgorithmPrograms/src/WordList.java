import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordList {

	public static void main(String[] args) {
		try {
			Scanner scan=new Scanner(new File("/home/bridgeit/Desktop/work2.txt"));
			Scanner s=new Scanner(System.in);
		
			String words=null;
			System.out.println("Enter the word to be searched");
			String key=s.next();
			while(scan.hasNext())
			{
				words=scan.nextLine();

			}
			String ch[]=words.split(" ");
			
			Utility ut=new Utility();
			ut.insertion(ch, ch.length);
			
			ut.binsearch(ch, ch.length, key);
		} 


		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
