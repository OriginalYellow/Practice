package intro2java.chap9;

public class PE14b {
	
	public static void main(String[] args) {
		
		String[] digitStringArray = args[0].split(" ");
		int sum = 0;
		
		for (int x = 0; x < digitStringArray.length; x++) {
			sum += Integer.parseInt(digitStringArray[x]);
		}
		
		System.out.println(sum);
		
	}

}
