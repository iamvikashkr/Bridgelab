import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dayofweek {

	public static void main(String[] args) {

		System.out.println("Your first argument is: "+args[0]);  
		System.out.println("Your Second argument is: "+args[1]);  
		System.out.println("Your third argument is: "+args[2]);

		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		Utility ut=new Utility();
		/*String input_date="12/03/1995";
		SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		Date dt1 = null;
		try {
			dt1 = format1.parse(input_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DateFormat format2=new SimpleDateFormat("EEEE"); 
		String finalDay=format2.format(dt1);
		System.out.println(finalDay);*/
		
		int result=ut.dayofweek(month,day,year);
		System.out.println("Day of the week is....."+result);
	}

}
