package intro2java.chap11;

public class Student extends Person {
	final String status;
	
	Student(String status) {
		this.status = status;
	}
	
	Student() {
		status = "Freshman";
	}
	
	public String toString() {
		return "Class is Student, name is " + name + ".";
	}
}
