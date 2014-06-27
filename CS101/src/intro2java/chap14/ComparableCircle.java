package intro2java.chap14;

import intro2java.chap10.PE11Circle2D;

public class ComparableCircle extends PE11Circle2D implements Comparable {

	public ComparableCircle() {
		super();
	}

	public ComparableCircle(double x, double y, double radius) {
		super(x, y, radius);
	}

	@Override
	public int compareTo(Object o) {
		if (getArea() > ((ComparableCircle)o).getArea()) {
			return 1;
		} else if (getArea() == ((ComparableCircle)o).getArea()) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(0, 0, 5);
		ComparableCircle c2 = new ComparableCircle(0, 0, 10);
		System.out.println(c1.compareTo(c2));
	}

}
