
public class Accounts {
	
	public float Tax(int salary, int absenties) throws AbsentiesException {
		float t = 0;
		
		//by throwing the exception, we are telling it to run the exception on the code
			if(absenties>=10) {
				AbsentiesException E = new AbsentiesException();
				throw E;
			}
			
			t = salary*17.5f/100;
			return t;
		
	}
	
}
