package test3;

public class test3 {

	public static void main(String[] args) {
		
		int salary;
		float tax = 0, netPay;
		
		salary = 900;
		
		if(salary > 1000)
		{
			if(salary > 2000)
			{
				if(salary > 3000)
				{
					tax = salary*30/100;
				}
				
				else
				{
					tax = salary*21/100;
				}
			}
			else
			{
				tax = salary*15/100;
			}
		}
		else
		{
			tax = 0;
		}
			
		
		netPay = salary - tax;
		
		System.out.println("Your salary is " + salary);
		System.out.println("Your tax is " + tax);
		System.out.println("Your netpay is " + netPay);

	}

}
