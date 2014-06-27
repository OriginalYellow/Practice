package intro2java.chap14;

public class Octogon extends GeometricObject1 implements Comparable, Cloneable {
	double side;
	
	public Octogon() {
		side = 1;
	}
	
	public Octogon(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return (2 + (4 / Math.sqrt(2.0))) * side * side;
	}
	
	public double getPerimenter() {
		return side * 8;
	}
	
	public int compareTo(Object o) {
		if (getArea() > ((Octogon)o).getArea()) {
			return 1;
		} else if (getArea() == ((Octogon)o).getArea()) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Octogon o1 = new Octogon(5);
		Octogon o2 = (Octogon)o1.clone();
		System.out.println(o1.compareTo(o2));
	}
	
}
