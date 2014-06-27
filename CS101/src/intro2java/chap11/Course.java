package intro2java.chap11;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
	private String courseName;
	private ArrayList list = new ArrayList();
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		list.add(student);
	}
	
	public String[] getStudents() {
		String[] strings = new String[list.size()];
		for (int x = 0; x < strings.length; x++) {
			strings[x] = (String)list.get(x);
		}
		return strings;
		
	}
	
	public int getNumberOfStudentds() {
		return list.size();
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		list.remove("student");
	}
	
	public static void main(String[] args) {
		Course c = new Course("stuff");
		c.addStudent("dude1");
		c.addStudent("dude2");
		c.addStudent("dude3");
		c.dropStudent("dude2");
		System.out.println(Arrays.toString(c.getStudents()));
	}
	
}
