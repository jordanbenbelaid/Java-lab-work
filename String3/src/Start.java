
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringProcessing s = new StringProcessing();
		
		s.PrintVerticalString("Hello My Friends");
		System.out.println("=================================");
		
		s.StringCompare("london");
		System.out.println("=================================");
		
		s.WordCount("Hello my friend how are you");
		System.out.println("=================================");
		
		s.PrintingVertical("Hello you silly goose man");
		System.out.println("=================================");
		
		s.PrintVerticalReverse("Hello you silly goose man");
		System.out.println("=================================");
		
		s.FindCount("Hello, i want to sayHello, because it is a nice thing to sayHello", "Hello");
		
	}

}
