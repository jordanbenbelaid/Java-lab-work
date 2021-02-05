package testObject;

public class Functions {
	
	public void add(int a, int b) {
		int result;
		result = a + b;
		System.out.println("Result is " + result);
	}
	
	public void subtract(int a, int b) {
		int result;
		result = a - b;
		System.out.println("Result is " + result);
	}


	public void divide(int a, int b) {
		int result;
		result = a/b;
		System.out.println("Result is " + result);
	}


	public void multiply(int a, int b) {
		int result;
		result = a*b;
		System.out.println("Result is " + result);
	}
	
	public void printTimesTables(int timesTable) {
		int i;
		System.out.println("Times table of " + timesTable);
		for(i=1; i<=12; i += 1) 	//+= for when u want to choose how to increment, ++ for incrementing by 1
		{
			System.out.println(timesTable + "x" + i + "=" + (i*timesTable));
		}
	}


}
