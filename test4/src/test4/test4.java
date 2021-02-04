package test4;

public class test4 {

	public static void main(String[] args) {
		
		int table = 1;
		int counter = 1;
		
		while (table <= 12)
		{
			System.out.println("===========================");
			System.out.println("Times table of : " + table);
			System.out.println("===========================");
			counter =1;
				
				while(counter <=12)
				{
					System.out.println(table + " x " + counter + " = " + (table*counter));
					counter = counter + 1;
				}
				table = table + 1;
		}
	
		System.out.println("===========================");
		System.out.println("===========================");
		
		int number = 39482;
		
			if(number % 2 == 0)
			{
				System.out.println(number + " is even");
			}
			else
			{
				System.out.println(number + " is odd");
			}

			
			System.out.println("===========================");
			System.out.println("===========================");
			
			int paid, bill, balance;

			bill = 115;
			paid = 320;
			balance = paid - bill;
			
			int fifty, twenty, ten, five, two;
			
			if(balance>=50)
			{
				System.out.println(balance/50 + " 50s");
				balance = balance%50;
				
				if(balance>=20)
				{
					System.out.println(balance/20 + " 20s");
					balance = balance%20;
					
					if(balance>=10)
					{
						System.out.println(balance/10 + " 10s");
						balance = balance%10;
						
						if(balance>=5)
						{
							System.out.println(balance/5 + " 5s");
							balance = balance%5;
							
							if(balance>=2)
							{
								System.out.println(balance/2 + " 2s");
								balance = balance%2;
								
								if(balance>=1)
								{
									System.out.println(1 + " 1s");
								}
								
							}
						}
					}
				}
			}
			
			
	}
}
