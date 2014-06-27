package intro2java.chap8;

public class PE2 {
	
	public static void main(String[] args) {
		Stock s = new Stock("JAVA", "Sun Microsystems Inc");
		s.currentPrice = 4.35;
		s.previousClosingPrice = 4.5;
		System.out.println(s.getChangePercent());
	}
	
}

class Stock {
	
	String symbol;
	String name;
	double previousClosingPrice = 0;
	double currentPrice = 0;
	
	public Stock(String s, String n) {
		symbol = s;
		name = n;
	}
	
	public double getChangePercent() {
		return 100 - (currentPrice / (previousClosingPrice / 100));
	}
	
}