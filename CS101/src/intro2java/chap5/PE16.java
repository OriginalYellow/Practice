package intro2java.chap5;

public class PE16 {
	public static boolean isLeapYear(int year) { 
			return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	public static int numberOfDaysInAYear(int year) {
		return (isLeapYear(year)) ? 366 : 365;
	}
	public static void main(String[] args) {
		System.out.println(numberOfDaysInAYear(2001));
	}
}
