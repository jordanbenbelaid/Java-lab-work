
public class Maths {

		public void Multiply(int a, int b) throws MultiplyByThreeException, MultiplyByZeroException{
			int result;
			
			if(a == 3 || b == 3) {
				MultiplyByThreeException m = new MultiplyByThreeException();
				throw m;
			}
			
			if(a == 0 || b == 0) {
				MultiplyByZeroException j = new MultiplyByZeroException();
				throw j;
			}
			result = a * b;
			System.out.println("The result of the multiplication is : " + result);
		}
}
