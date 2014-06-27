package intro2java.chap14;

import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		Rational r1a = new Rational(123, 321);
		Rational2 r2a = new Rational2(123, 321);
		Rational r1b = new Rational(456, 654);
		Rational2 r2b = new Rational2(456, 654);
		System.out.println(r1a.add(r1b));
		System.out.println(r2a.add(r2b));
	}

}
