package intro2java.chap5;

public class RQ17 {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++)
			System.out.println(RandomValues.RandomInteger(34, 55));
		for (int i = 0; i <= 20; i++)
			System.out.println(RandomValues.RandomInteger(0, 999));
		for (int i = 0; i <= 20; i++)
			System.out.println(RandomValues.RandomDouble(5.5, 55.5));
		for (int i = 0; i <= 20; i++)
			System.out.println(RandomValues.RandomLowercase());
	}
}
