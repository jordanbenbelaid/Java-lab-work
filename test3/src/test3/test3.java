package test3;

public class test3 {

	public static void main(String[] args) {
		
		int salary;
		float tax = 0, netPay;
		
		salary = 900;
		
		if(salary <= 1000)
		{
			tax = 0;
		}
		
		if(salary>1000 && salary <= 2000)
		{
			tax = (float)salary*17/100;
		}
		
		if(salary > 2000)
		{
			tax = (float)salary*21/100;
		}
		
		netPay = salary - tax;
		
		System.out.println("Your salary is " + salary);
		System.out.println("Your tax is " + tax);
		System.out.println("Your netpay is " + netPay);

	}

}
