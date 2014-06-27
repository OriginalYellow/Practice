package intro2java.chap9;

public class PE14a {

	public static void main(String[] args) {

		int sum = 0;

		for (int x = 0; x < args.length; x++) {
			sum += Integer.parseInt(args[x]);
		}

		System.out.println(sum);

	}
}
