package intro2java.chap10;

public class PE3MyInteger {

	private int value;
		
	public PE3MyInteger(int value) {
		this.value = value;
	}
	
	public int getInteger() {
		return value;
	}
	
	public boolean isEven() {
		return isEven(value);
	}
	
	public static boolean isEven(int num) {
		if ((num % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}	
	
	public boolean isOdd() {
		return(!isEven(value));
	}
	
	public static boolean isOdd(int num) {
		return !isEven(num);	
	} 
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	public static boolean isPrime(int num) {
		for (int x = 2; x < num; x++) {
			if ((num % x) == 0) {
				return false;
			}
		}
		return true;
	} 
	
	public boolean equals(int num) {
		return (num == value);
	}
	
	public boolean equals(PE3MyInteger i) {
		return (value == i.getInteger());
	}

	//these parseInt methods will return the wrong value if given any non-digits
	public static int parseInt(char[] chars) {
		int num = 0;
		int place = 0;
		for (int x = (chars.length - 1); x >= 0; x--, place++) {
			 num += (chars[x] - '0') * Math.pow(10, place);
		}
		return num;
	}
	
	public static int parseInt(String s) {
		return parseInt(s.toCharArray());
	}
	
	//test platform
	public static void main(String[] args) {
		PE3MyInteger i = new PE3MyInteger(2020304932);
		char[] c = {'3', '8', '5'};
		String s = "385";
		System.out.println(PE3MyInteger.parseInt(c));
		System.out.println(PE3MyInteger.parseInt(s));		
	}
	
}
