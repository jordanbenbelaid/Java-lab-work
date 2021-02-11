
public class ArrayWork {

		public void Array1() {
			int[] numbers = {12,23,34,45,56,78,98};
			int i;
			
			for(i=0;i<numbers.length;i++) {
				System.out.println(numbers[i]);
			}
		}
		
		
		public void ArrayHighNumber() {
			
			int[] numbers = {12,23,34,102,45,56,78,98};
			int i; //initialise i 
			
			int maxNum = numbers[0];		//empty variable called max value
			
			//for i = 0 in the array, check if next item is higher than last number, if so replace, otherwise keep it
			for(i = 0; i < numbers.length; i++) {
				if(numbers[i] > maxNum) {
					maxNum = numbers[i];
				}
			}
			System.out.println("The highest number in this array is: " + maxNum);   //new number
		}
}
