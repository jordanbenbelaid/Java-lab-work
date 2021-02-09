
public class Bank {
	
	String name;
	static int dollar;
	
	public void SetDollar(int d) {
		dollar = d;
	}
	
	public void Amount(int amo) {
		System.out.println(name + ": " + amo*dollar);
	}
}
