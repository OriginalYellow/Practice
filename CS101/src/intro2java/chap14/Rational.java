package intro2java.chap14;

import java.math.BigInteger;

public class Rational extends Number implements Comparable {
	// Data fields for numerator and denominator
	private BigInteger numerator = BigInteger.ZERO;
	private BigInteger denominator = BigInteger.ONE;

	/** Construct a rational with default properties */
	public Rational() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}

	/** Construct a rational with specified numerator and denominator */
	public Rational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) > 0) 
				? BigInteger.ONE : new BigInteger("-1")).multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}
	
	public Rational(long numerator, long denominator) {
		BigInteger bigNumerator = new BigInteger("" + numerator);
		BigInteger bigDenominator = new BigInteger("" + denominator);
		BigInteger gcd = gcd(bigNumerator, bigDenominator);
		this.numerator = ((bigDenominator.compareTo(BigInteger.ZERO) > 0) 
				? BigInteger.ONE : new BigInteger("-1")).multiply(bigNumerator).divide(gcd);
		this.denominator = bigDenominator.abs().divide(gcd);
	}

	//test this separately first
	/** Find GCD of two numbers */
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = BigInteger.ONE;
		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) < 1 
				&& k.compareTo(n2) < 1; k = k.add(BigInteger.ONE)) {
			if (n1.mod(k) == BigInteger.ZERO && n2.mod(k) == BigInteger.ZERO)
				gcd = k;
		}
		return gcd;
	}

	/** Return numerator */
	public BigInteger getNumerator() {
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return denominator;
	}

	/** Add a rational number to this rational */
	public Rational add(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	/** Subtract a rational number from this rational */
	public Rational subtract(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	/** Multiply a rational number to this rational */
	public Rational multiply(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	/** Divide a rational number from this rational */
	public Rational divide(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.numerator);
		return new Rational(n, d);
	}

	/** Override the toString() method */
	public String toString() {
		if (denominator.equals(BigInteger.ONE))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	/** Override the equals method in the Object class */
	public boolean equals(Object parm1) {
		if ((this.subtract((Rational)(parm1))).getNumerator() == BigInteger.ZERO)
			return true;
		else
			return false;
	}

	/** Override the abstract intValue method in java.lang.Number */
	public int intValue() {
		return (int)doubleValue();
	}

	/** Override the abstract floatValue method in java.lang.Number */
	public float floatValue() {
		return (float)doubleValue();
	}

	/** Override the doubleValue method in java.lang.Number */
	public double doubleValue() {
		return numerator.multiply(BigInteger.ONE).divide(denominator).doubleValue();
	}

	/** Override the abstract longValue method in java.lang.Number */
	public long longValue() {
		return (long)doubleValue();
	}

	/** Override the compareTo method in java.lang.Comparable */
	public int compareTo(Object o) {
		if ((this.subtract((Rational)o)).getNumerator().compareTo(BigInteger.ZERO) > 0)
			return 1;
		else if ((this.subtract((Rational)o)).getNumerator().compareTo(BigInteger.ZERO) < 0)
			return -1;
		else
			return 0;
	}
}
