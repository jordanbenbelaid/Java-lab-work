
public class ShowResults {
	
	String name;
	private int physics, chemistry, maths;
	private int invalid, failed;
	
	
	public void Physics(int p) {
		if(p>=0 && p<=100) {
			physics = p;
			
			if(p<60) {
				failed++;
			}
		}
		else {
			invalid++;
			System.out.println("You have failed Physics");
		}			
	}
	
	
	
	public void Chemistry(int c) {
		if(c>=0 && c<=100) {
			chemistry = c;
			
			if(c<60) {
				failed++;
			}
		}
		else {
			invalid++;
			System.out.println("You have failed Chemistry");
		}			
	}
	
	
	
	
	public void Maths(int m) {
		if(m>=0 && m<=100) {
			maths = m;
			
			if(m<60) {
				failed++;
			}
		}
		
		else {
			invalid++;
			System.out.println("You have failed Maths");
		}			
	}
	
	
	
	public void showResults() {
		int total;
		float percentage;
		
		total = physics + chemistry + maths;
		percentage = (float)total*100/300;
		
		if(invalid==0) {
			if(failed==0) {
		System.out.println(name + "'s results: " + total);
		System.out.println(name + "'s percentage: " + percentage);
		
			}
		else {
			if(failed == 1) {
				System.out.println("Retake the exam");
		}
		else {
			if(failed == 2) {
				System.out.println("Repeat the course");
		}
		else {
			if(failed == 3) {
				System.out.println("GO HOME!");
		}
	}
}
}		
}
}
}
