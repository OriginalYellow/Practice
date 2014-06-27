package intro2java.chap10;


public class PE6 {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();
		for (int x = 2; x <= 120; x++) {
			if (PE3MyInteger.isPrime(x)) {
				stack.push(x);
			}
		}
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}
