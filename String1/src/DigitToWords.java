
public class DigitToWords {
	
	
	public void Convert(int a) {
		
		String result ="";
			
		if(a==0) { System.out.println("Zero");}
		
		
		if(a>=1000) {
			result += thousandsConverter(a/1000)+ " ";
			a%=1000;
		}
		
		
		if(a>=100) {
			result += hundredsConverter(a/100)+ " ";
			a%=100;
		}
		
		if(a>=20) {
			result += tensConverter(a/10)+ " ";
			a%=10;
		}
		
		if(a>=1) {
			result += digitConverter(a) + " ";
		}
		
		if(a>=1 && a<=9999) 
		{
		System.out.println(result);
		}
		else
		{
			System.out.println("Please input a number between 1 and 9999");
		}
		
	}

	private String thousandsConverter(int thousands) {
		String num4 = "";
		
		switch (thousands) {
		case 1:
			num4 = "One Thousand";
			break;
		case 2:
			num4 = "Two Thousand";
			break;
		case 3:
			num4 = "Three Thousand";
			break;
		case 4:
			num4 = "Four Thousand";
			break;
		case 5:
			num4 = "Five Thousand";
			break;
		case 6:
			num4 = "Six Thousand";
			break;
		case 7:
			num4 = "Seven Thousand";
			break;
		case 8:
			num4 = "Eight Thousand";
			break;
		case 9:
			num4 = "Nine Thousand";
			break;
		default:
			num4 = "ERROR";
			break;
		}
		
		return num4;
	}
	
	

	private String hundredsConverter(int hundreds) {
		String num3 = "";
		
		switch (hundreds) {
		case 1:
			num3 = "One Hundred";
			break;
		case 2:
			num3 = "Two Hundred";
			break;
		case 3:
			num3 = "Three Hundred";
			break;
		case 4:
			num3 = "Four Hundred";
			break;
		case 5:
			num3 = "Five Hundred";
			break;
		case 6:
			num3 = "Six Hundred";
			break;
		case 7:
			num3 = "Seven Hundred";
			break;
		case 8:
			num3 = "Eight Hundred";
			break;
		case 9:
			num3 = "Nine Hundred";
			break;
		default:
			num3 = "ERROR";
			break;
		}
		
		
		return num3;
	}

	private String tensConverter(int tens) {
		String num2 = "";
		
		switch (tens) {
		case 2:
			num2 = "Twenty";
			break;
		case 3:
			num2 = "Thirty";
			break;
		case 4:
			num2 = "Forty";
			break;
		case 5:
			num2 = "Fifty";
			break;
		case 6:
			num2 = "Sixty";
			break;
		case 7:
			num2 = "Seventy";
			break;
		case 8:
			num2 = "Eighty";
			break;
		case 9:
			num2 = "Ninety";
			break;
		default:
			num2 = "ERROR";
			break;
		}
		
		return num2;
	}

	private String digitConverter(int digit) {
		String num = "";
		
		switch (digit) {
		case 1:
			num = "One";
			break;
		case 2:
			num = "Two";
			break;
		case 3:
			num = "Three";
			break;
		case 4:
			num = "Four";
			break;
		case 5:
			num = "Five";
			break;
		case 6:
			num = "Six";
			break;
		case 7:
			num = "Seven";
			break;
		case 8:
			num = "Eight";
			break;
		case 9:
			num = "Nine";
			break;
		case 10:
			num = "Ten";
			break;
		case 11:
			num = "Eleven";
			break;
		case 12:
			num = "Twelve";
			break;
		case 13:
			num = "Thirteen";
			break;
		case 14:
			num = "Fourteen";
			break;
		case 15:
			num = "Fifteen";
			break;
		case 16:
			num = "Sixteen";
			break;
		case 17:
			num = "Seventeen";
			break;
		case 18:
			num = "Eighteen";
			break;
		case 19:
			num = "Nineteen";
			break;
		default:
			num = "ERROR";
			break;
		}
		return num;
	}
}
