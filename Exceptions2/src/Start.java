
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {
			Maths3 ref = new Maths3();
			ref.Mathematics(5,5);
			}
			catch(MultiplyByThreeException ref) {
				System.out.println("Cannot mutiply by 3!!!");
			}
			catch(MultiplyByZeroException ref) {
				System.out.println("Cannot multiply by 0!!!");
			}
			
	}

}
