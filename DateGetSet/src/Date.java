
/**
 * EXERCISE: - Create three private class fields (dayOfMonth, month, year)
 * 
 * - Create two constructors using the technique of constructor overloading -
 * Constructor takes 0 parameters and sets all private fields to 0 - Constructor
 * takes 3 parameters and sets the private fields to the appropriate values
 * 
 * - Create three getters to retrieve the values in your private fields
 */
public class Date {

	private int dayOfMonth;
	private int month;
	private int year;

	/**
	 * Takes a String date in the format: <dd-mm-yyyy>
	 * 
	 * @param date
	 */
	public Date(String date) {
		String[] splitDate = date.split("-");

		dayOfMonth = Integer.parseInt(splitDate[0]);
		month = Integer.parseInt(splitDate[1]);
		year = Integer.parseInt(splitDate[2]);
	}
	
	public Date() {
		dayOfMonth = 0;
		month = 0;
		year = 0;
	}

	public Date(int dayOfMonth, int month, int year) {
		this.dayOfMonth = dayOfMonth;
		this.month = month;
		this.year = year;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
}