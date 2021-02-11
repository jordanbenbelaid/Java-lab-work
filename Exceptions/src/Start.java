
public class Start {

	public static void main(String[] args) {

		try {
			System.out.println(4/0);
		}
		
		catch(ArithmeticException t){
			System.out.println("You are stupid, you cannot divide by zero!");
		}
		
		System.out.println("Hello");
		System.out.println("This");
		System.out.println("World");
		
		//see javatest folder for more exceptions work
	}

}
