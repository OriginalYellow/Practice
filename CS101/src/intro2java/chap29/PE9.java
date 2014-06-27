package intro2java.chap29;

import java.util.HashSet;
import java.util.Iterator;

public class PE9 {
	static HashSet<Integer> set = new HashSet<Integer>();
	static Iterator<Integer> i;

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					int i = (int)(Math.random() * 1000);
					set.add(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					i = set.iterator();
					int n = 0;
					while (i.hasNext()) {
						System.out.println("element " + (n++));
						System.out.println(i.next());
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		t1.start();
		t2.start();

	}

}







