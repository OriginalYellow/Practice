package intro2java.chap8;

public class PE1 {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2 = new Rectangle(3.5,35.9);
		System.out.println("The width of r1 is " + r1.width +
				"\nThe height of r1 is " + r1.height +
				"\nThe area of r1 is " + r1.getArea() +
				"\nThe parimeter of r1 is " + r1.getParimeter());
		System.out.println("The width of r2 is " + r2.width +
				"\nThe height of r2 is " + r2.height +
				"\nThe area of r2 is " + r2.getArea() +
				"\nThe parimeter of r2 is " + r2.getParimeter());
	}
	
}

class Rectangle {
	
	public Rectangle() {
		
	}
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double width = 1;
	public double height = 1;
	
	public double getArea() {
		return (width * height);
	}
	
	public double getParimeter() {
		return (width + width + height + height);
	}
	
}
