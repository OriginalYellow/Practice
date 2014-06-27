package intro2java.chap29;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.SwingUtilities;

public class Test {
	static HashSet<Integer> set = new HashSet<Integer>();
	static Iterator<Integer> i;

	public static void main(String[] args) {
		set.add(1);
		i = set.iterator();
		System.out.println(i.next());
		
	}

}




