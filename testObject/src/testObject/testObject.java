package testObject;

public class testObject {

	public static void main(String[] args) {
		
		//new creates the object x, from results class.
		
		//results x;
		//x = new results()
		
		Results x = new Results();
		System.out.println(x.physics + x.chem + x.maths);
		
		
		System.out.println("                                 ");
		
		
		Manchester m = new Manchester();
		m.message();
		m.printing();
		
		
		System.out.println("                                 ");
		
		
		Functions f = new Functions();
		f.add(10, 23);
		f.subtract(95, 47);
		f.divide(100, 25);
		f.multiply(6,3);
		
		
		System.out.println("                                 ");
		
		
		Accounts a = new Accounts();
		a.tax(20394);
		
		
		System.out.println("                                 ");
		
		
		f.printTimesTables(5);
	}

}
