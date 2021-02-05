package testObject;

public class Accounts {
	
	public void tax(int salary) {
		float t, net;
		t = (float)salary*25/100;
		net = salary - t;
		System.out.println("Your tax is " + t);
		System.out.println("Your net pay is" + net);

	}
}
