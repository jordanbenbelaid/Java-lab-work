
public class Start {

	public static void main(String[] args) {
		
		HSBC h = new HSBC();
		doBanking(h);
		
		System.out.println("=========================");
		
		Barclays b = new Barclays();
		doBanking(b);
	}
	
	public static void doBanking(Bank ref) {
		
		ref.ShowBalance();
		ref.AccountOpen();
	}

}
