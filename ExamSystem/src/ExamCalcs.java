
public class ExamCalcs {
	
	private int physics, chemistry;
	private int maxMarks;
	
	public ExamCalcs(int m) {
		maxMarks = m;
	}
	
	
	public void Physics(int p) {
		if(p>=0 && p<=maxMarks) {
			physics = p;
		}
		else {
			System.out.println("Invalid physics mark");
		}
	}
	
	
	public void Chemistry(int c) {
		if(c>=0 && c<=maxMarks) {
			chemistry = c;
		}
		else {
			System.out.println("Invalid chemistry mark");
		}
	}
	
	
	public void showResults() {
		int total = physics+chemistry;
		float per = (float)total*100/(maxMarks*2);
		System.out.println("Total marks: " + total);
		System.out.println("Total percentage: " + per);
		
		if(per>=60) {
			System.out.println("You have passed the exam!");
		}
		else {
			System.out.println("You have failed the exam!");
		}
	}
	
}

