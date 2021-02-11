
public class Runner2 {

	public static void main(String[] args) {
		
		// Setting up dates
				Date someDate = new Date();
				String someDateResult = DateParser.parseDate(someDate);
		 
				Date someDate2 = new Date("23-10-1994");
				String someDate2Result = DateParser.parseDate(someDate2);
		 
				Date someDate3 = new Date(5, 3, 2002);
				String someDate3Result = DateParser.parseDate(someDate3);
		 
				String someDate4Result = DateParser.parseDate(2, 3, 11, 2020);
		 
				// Checking results
				if (!someDateResult.equals("0 ERROR 0")) {
					System.out.println("ERROR parsing variable someDate");
				} else {
					System.out.println("PARSED someDate to: " + someDateResult);
				}
		 
				if (!someDate2Result.equals("23 October 1994")) {
					System.out.println("ERROR parsing variable someDate2Result");
				} else {
					System.out.println("PARSED someDate2Result to: " + someDate2Result);
				}
		 
				if (!someDate3Result.equals("5 March 2002")) {
					System.out.println("ERROR parsing variable someDate3Result");
				} else {
					System.out.println("PARSED someDate3Result to: " + someDate3Result);
				}
		 
				if (!someDate4Result.equals("Tuesday 3 November 2020")) {
					System.out.println("ERROR parsing variable someDate4Result");
				} else {
					System.out.println("PARSED someDate4Result to: " + someDate4Result);
				}
	}

}
