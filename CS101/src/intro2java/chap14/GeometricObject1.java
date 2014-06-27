package intro2java.chap14;

public abstract class GeometricObject1 implements Comparable {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  
  /** Construct a default geometric object */
  public GeometricObject1() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with the specified color 
    *  and filled value */
  public GeometricObject1(String Color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean, 
     its get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
  
  public abstract double getArea();
  
  public int compareTo(Object o) {
	  if (getArea() - ((GeometricObject1)o).getArea() < 0) {
		  return -1;
	  } else if (getArea() - ((GeometricObject1)o).getArea() == 0) {
		  return 0;
	  } else {
		  return 1;
	  }
  }
  
  public static GeometricObject1 max(GeometricObject1 g1, GeometricObject1 g2) {
	  if (g1.compareTo(g2) < 0) {
		  return g2;
	  } else if (g1.compareTo(g2) == 0) {
		  return null;
	  } else {
		  return g1;
	  }
  }
  
  /** Return a string representation of this object */
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color + 
      " and filled: " + filled;
  }
}
