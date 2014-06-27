package intro2java.chap14;

public class PE8 {

	public static double sumArea(GeometricObject1[] a) {
		double sum = 0;
		for (int x = 1; x < a.length; x++) {
				sum += a[x].getArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Octogon o = new Octogon(1);
		Circle c = new Circle(1);
		Triangle t = new Triangle(1, 1, 1);
		GeometricObject1[] g = {o, c, t};
		System.out.println(sumArea(g));
	}

}
