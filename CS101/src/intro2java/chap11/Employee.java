package intro2java.chap11;

public class Employee extends Person {
	protected String office;
	protected double Salary;
	protected MyDate dateHired;
	
	public String toString() {
		return "Class is Employee, name is " + name + ".";
	}
}
