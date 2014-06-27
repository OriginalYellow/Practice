package intro2java.chap11;

import java.util.ArrayList;

public class MyStack extends ArrayList {

	public Object peek() {
		return get(size() - 1);
	}
	
	public Object pop() {
		Object o = peek();
		remove(size() - 1);
		return o;
	}
	
	public String toString() {
		return "stack: " + toString();
	}
	
	public static void main(String[] args) {
		MyStack s = new MyStack();
		System.out.println(s);
	}
	
}
