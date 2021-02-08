
public class MainRunner {

	public static void main(String[] args) {
		
		DateParser parser = new DateParser();
//		String string = new String();
//		string = parser.parseDate(2, 11, 8, 1987);
//		System.out.println(string);
		
		String parseValue = parser.parseDate(2, 11, 8, 1987);
		System.out.println(parseValue);
	}

}
