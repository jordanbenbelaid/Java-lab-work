
	/**
 * EXERCISE:
 * - Complete the Date class exercise
 * 
 * - Complete the overloaded method parseDate(Date date)
 *   
 * - Test your solution using the Runner file
 *
 * EXTRA EXERCISE:
 * - Add another overload to the parseDate method that takes a Date object, and
 *   a dayOfWeek as an integer.
 *   parseDate(new Date(5, 3, 2002), 2); 
 */
public class DateParser {
 
	public static String parseDate(int dayOfWeek, int dayOfMonth,
							int monthOfYear, int year) {
 
		String day = parseDayOfWeek(dayOfWeek);
		String month = parseMonthOfYear(monthOfYear);
 
		String date = day + " " + dayOfMonth + " " + month + " " + year;
		return date;
	}
 
	/**
	 * Returns a date in the format: <dd month yyyy>
	 * i.e. 23 October 1994
	 * 
	 * @param date
	 * @return String
	 */
	public static String parseDate(Date date) {
		// TODO: WRITE YOUR SOLUTION HERE
		return date.getDayOfMonth() + " " + parseMonthOfYear(date.getMonth()) + " " + date.getYear();
	}
	
	public static String parseDate(Date date, int dayOfWeek) {
		return parseDayOfWeek(dayOfWeek) + parseDate(date);
	}
 
	public static String parseDayOfWeek(int dayOfWeek) {
		String day = "";
 
		switch(dayOfWeek) {
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
			case 7:
				day = "Sunday";
				break;
			default:
				day = "ERROR";
				break;
		}
		return day;
	}
 
	public static String parseMonthOfYear(int month) {
		String monthOut = "ERROR";
 
		switch(month) {
			case 1:
				monthOut = "January";
				break;
			case 2:
				monthOut = "February";
				break;
			case 3:
				monthOut = "March";
				break;
			case 4:
				monthOut = "April";
				break;
			case 5:
				monthOut = "May";
				break;
			case 6:
				monthOut = "June";
				break;
			case 7:
				monthOut = "July";
				break;
			case 8:
				monthOut = "August";
				break;
			case 9:
				monthOut = "September";
				break;
			case 10:
				monthOut = "October";
				break;
			case 11:
				monthOut = "November";
				break;
			case 12:
				monthOut = "December";
				break;
			default:
				monthOut = "ERROR";
				break;
		}
		return monthOut;
	}
}