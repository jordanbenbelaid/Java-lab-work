
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ExamCalcs school = new ExamCalcs(100);
			ExamCalcs college = new ExamCalcs(150);
			ExamCalcs university = new ExamCalcs(200);
			
			school.Physics(92);
			school.Chemistry(74);
			school.showResults();
			college.Physics(83);
			college.Chemistry(134);
			college.showResults();
			university.Physics(182);
			university.Chemistry(191);
			university.showResults();
	}

}
