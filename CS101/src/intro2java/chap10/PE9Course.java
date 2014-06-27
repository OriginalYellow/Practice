//You still need to impliment dat drop and clear method, and test the new addstudent part
package intro2java.chap10;

import java.io.File;
import java.util.Arrays;
import intro2java.chap9.*;

public class PE9Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public PE9Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		if (numberOfStudents == students.length) {
			String[] temp = new String[students.length + 100];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}  

	public String getCourseName() {
		return courseName;
	}  

	public void dropStudent(String student) {
		for (int x = 0; x < numberOfStudents; x++) {
			if (student.equals(students[x])) {
				System.arraycopy(students, (x + 1), students, x, students.length
						- x - 1);
				students[numberOfStudents - 1] = null;
				numberOfStudents--;
				return;
			}
		}
		System.out.println("Student not found.");
	}

	public void clear() {
		Arrays.fill(students, null);
		numberOfStudents = 0;
	}
	
	//testing method
	public static void main(String[] args) throws Exception {
		PE9Course c = new PE9Course("science");
		File dictionary = new File("dictionary.txt");
		for (int x = 0; x < 10; x++) {
			c.addStudent(PE33Hangman2.getRandomWord(dictionary));
		}
		System.out.println(Arrays.toString(c.getStudents()) + "\n" + c.getStudents().length);
		c.dropStudent(c.getStudents()[3]);
		System.out.println(Arrays.toString(c.getStudents()) + "\n" + c.getStudents().length);
	}
}
