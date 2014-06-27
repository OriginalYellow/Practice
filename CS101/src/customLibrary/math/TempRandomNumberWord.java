//This really belongs in random values, or it needs to be renamed
//when other relevant methods are added and/or the limitedness of
//getRand2DigNumWord is fixed

package customLibrary.math;

public class TempRandomNumberWord {
	
	public static void main(String[] args) {
		System.out.println(getRand2DigNumWord());
	}

	//this method is limited in that it will not return any numbers from 10-19
	public static String getRand2DigNumWord() {
		String dig1Word = " ";
		String dig2Word = " ";
		switch (RandomValues.RandomInteger(2, 10)) {
		case 2: dig1Word = "Twenty";
		break;
		case 3: dig1Word = "Thirty";
		break;
		case 4: dig1Word = "Fourty";
		break;
		case 5: dig1Word = "Fifty";
		break;
		case 6: dig1Word = "Sixty";
		break;
		case 7: dig1Word = "Seventy";
		break;
		case 8: dig1Word = "Eighty";
		break;
		case 9: dig1Word = "Ninety";
		break;
		}
		switch (RandomValues.RandomInteger(0, 10)) {
		case 0: dig2Word = " ";
		break;
		case 1: dig2Word = " One";
		break;
		case 2: dig2Word = " Two";
		break;
		case 3: dig2Word = " Three";
		break;
		case 4: dig2Word = " Four";
		break;
		case 5: dig2Word = " Five";
		break;
		case 6: dig2Word = " Six";
		break;
		case 7: dig2Word = " Seven";
		break;
		case 8: dig2Word = " Eight";
		break;
		case 9: dig2Word = " Nine";
		break;
		}
		return (dig1Word + dig2Word);
	}

}
