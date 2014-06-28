package intro2java.Chap13;

public class Calculator {
	/** Main method */
	public static void main(String[] args) {
		// Check number of strings passed
		if (args.length != 3) {
			System.out.println(
					"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		// Determine the operator
		try {
			switch (args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) +
					Integer.parseInt(args[2]);
			break;
			case '-': result = Integer.parseInt(args[0]) -
					Integer.parseInt(args[2]);
			break;
			case '*': result = Integer.parseInt(args[0]) *
					Integer.parseInt(args[2]);
			break;
			case '/': result = Integer.parseInt(args[0]) /
					Integer.parseInt(args[2]);
			default: System.out.println("Wrong input: " + args[1].charAt(0));
			System.exit(0);
			}
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
			System.out.println("please input a valid number");
			System.exit(0);
		}
		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
				+ " = " + result);
	}
}
