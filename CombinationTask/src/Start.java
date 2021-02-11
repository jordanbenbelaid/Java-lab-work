
public class Start {

	public static void main(String[] args) {
		
		int salary = 2000;
		float netSalary;
		
		Accounts ac = new Accounts();
		//use try and catch here so that it only doesn't throw an exception everything we run from Accounts
		try {
		netSalary = salary - ac.Tax(salary,4);
		System.out.println(netSalary);
		}
		
		catch(AbsentiesException ref) {
			System.out.println("For IT Department its okay!");
		}
	}

}
