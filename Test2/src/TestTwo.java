
public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int phy, chem, mat;
		float percentage;
		int total;
		phy = 90;
		chem = 89;
		mat = 89;
		total = phy + mat + chem;
		percentage = (float)total*100/300;
		System.out.println("Physics marks: " + phy);
		System.out.println("Chemistry marks: " + chem);
		System.out.println("Maths marks: " + mat);
		System.out.println("================================================");
		System.out.println("Total marks are: " + total);
		System.out.println("The percentage is: " + percentage);
		
	}

}
