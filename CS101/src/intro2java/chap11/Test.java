package intro2java.chap11;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
	}

}


class A {
	A(int x) {	
	}
	
}


class B extends A {
	B(int x) {
		super(x);
	}
}