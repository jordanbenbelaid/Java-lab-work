
public class StringProcessing {

	public void PrintVerticalString(String message) {
		// gives us characters 1 by 1
		int start;
		for (start = 0; start < message.length(); start++) {
			System.out.println(message.substring(start, start + 1));

		}
	}

	// if a word matches exactly, it returns our message otherwise it returns the
	// else statement
	public void StringCompare(String city) {

		if (city.equals("London")) {
			System.out.println("VERY COLD");
		} else {
			System.out.println("Not sure");
		}
	}

	public void WordCount(String message) {
		int i = 0;
		int space = 0;

		for (i = 0; i < message.length(); i++) {
			if (message.substring(i, i + 1).equals(" ")) {
				space++;
			}
		}
		System.out.println("In your message there are " + (space + 1) + " words.");
	}

	public void PrintingVertical(String message) {
		int i;
		String word = "";

		for (i = 0; i < message.length(); i++) {
			if (message.substring(i, i + 1).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word += message.substring(i, i + 1);
			}
		}
		System.out.println(word);
	}

	public void PrintVerticalReverse(String message) {

		int i;
		String word = "";
		//i = length of word as w start from reverse
		for (i = message.length(); i > 0; i--) {
			//picks up the maximum/last character
			if (message.substring(i - 1, i).equals(" ")) {
				
				System.out.println(word);
				
				//make word empty
				word = "";
				
			} else {
				
				//inside word, its stores last character, and keeps going until a character is a space
				//we want to store letters to the left, rather than right (therefore we cant use +=
				//as it always add to the end
				word = message.substring(i - 1, i) + word;
			}
		}
		//prints last word that gets cut off
		System.out.println(word);
	}
	
	public void FindCount(String message, String find) {
		int i;
		int count = 0;
		
		for(i = 0; i < message.length(); i++) {
			//comparing first letter of string to the first character of the word we are finding
			if(message.substring(i, i + 1).equals(find.substring(0, 1))) {
				
				//counts the input word of choice amount of letters, and if matches the actual word, it adds to the count
				//i + find.length() is here instead of i+1 as it counts the whole string we want, not just the next letter
				if(message.substring(i,i + find.length()).equals(find)){
					
					count++;
					
					// skips to the end of the word we are finding, to save time
					//-1 because we add a the end of loop because of i++
					//for it to work without -1, you must do i<=message.length
					i+= find.length()-1;
				}
			}

		}
		System.out.println("There are " + count + " occurences of " + find);
	}
}

