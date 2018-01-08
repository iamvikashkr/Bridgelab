
public class MonthlyPay {

	public static void main(String[] args) {

		Utility ut=new Utility();
		double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);

		ut.monthly(p,y,r);
		
		
	}

}
