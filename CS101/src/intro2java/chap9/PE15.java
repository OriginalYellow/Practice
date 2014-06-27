package intro2java.chap9;

public class PE15 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int x = 0; x < args[0].length(); x++) {
			if (Character.isUpperCase(args[0].charAt(x)))
				sum++;
		}
		
		System.out.println("The number of uppercase letters in " + args[0] + " is " + sum);
		
	}
	
}
