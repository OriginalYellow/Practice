package intro2java.chap14;

public class PE17 {
	
	public static void main(String[] args) {
		
		Rational2 r = new Rational2(1, 2);
		for (int n = 2, d = 3; d <= 20; d++, n++) {
			r = r.add(new Rational2(n, d));
		}

	}

}
