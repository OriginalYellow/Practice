package intro2java.chap14;

public class Circle extends GeometricObject1 implements Comparable {
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Return area */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
      " and the radius is " + radius);
  }
  
  public int compareTo(Object o) {
		if (getArea() > ((Circle)o).getArea()) {
			return 1;
		} else if (getArea() == ((Circle)o).getArea()) {
			return 0;
		} else {
			return -1;
		}
	}
  
  @Override
  public boolean equals(Object obj) {
	  if (compareTo(obj) == 0) {
		  return true;
	  } else {
		  return false;
	  }
  }
  
  public static void main(String[] args) throws SecurityException, NoSuchMethodException {
	  Object c1 = new Circle(5);
	  Object c2 = new Circle(5);
	  System.out.println(c1.equals(c2));
  }
}
