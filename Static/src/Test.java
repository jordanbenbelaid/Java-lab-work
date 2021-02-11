
public class Test {

		static int dollar;
		
		
		//static initialiser always gets run first
		static {
			System.out.println("Hello, this is static initialiser");
		}
		
		static void msg() {
			System.out.println("BOOOOOOOOOM!!!");
		}
		
		public Test() {
			System.out.println("Hello from constructor");
		}
}
