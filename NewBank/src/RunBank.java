
public class RunBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank HSBC = new Bank();
		Bank Barclays = new Bank();
		Bank Natwest = new Bank();
		
		HSBC.SetDollar(100);
		HSBC.Amount(3);
//		HSBC.name = "HSBC";
		
		Barclays.SetDollar(150);
		Barclays.Amount(2);
//		Barclays.name = "Barclays";
		
		Natwest.SetDollar(260);
		Natwest.Amount(4);
//		Natwest.name = "Natwest";
	}

}
