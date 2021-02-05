
public class ShowResults {
	
	String name;
	int physics, chemistry;
	
	public void showResults() {
		int total;
		total = physics + chemistry;
		
		System.out.println(name + "'s results: " + total);
	}

}
