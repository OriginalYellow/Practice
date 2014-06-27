package intro2java.chap14;

public class Square extends GeometricObject1 implements Colorable {
	int area;
	
	public Square() {
		area = 1;
	}
	
	@Override
	public double getArea() {
		return area;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}
	
	public static void main(String[] args) {
		GeometricObject1[] g = new GeometricObject1[5];
		for (int x = 0; x < g.length; x++) {
			g[x] = new Square();
		}
		for (int x = 0; x < g.length; x++) {
			if (g[x] instanceof Colorable) {
				((Colorable)g[x]).howToColor();
			}
		}
	}

}

interface Colorable {
	
	public void howToColor();
	
}
