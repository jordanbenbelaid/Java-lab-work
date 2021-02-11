
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherTracker weather = new WeatherTracker();
		weather.setConditions("sunny");
		
		Notifier email = new Email();
		Notifier phone = new Phone();
		
		weather.notify(phone);
	}

}
