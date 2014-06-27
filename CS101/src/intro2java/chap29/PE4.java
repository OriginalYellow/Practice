package intro2java.chap29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PE4 {
	static IntWrapper sum = new IntWrapper(0);
	
	public static void main(String[] args) {
		
		//create thread pool
		ExecutorService pool = Executors.newCachedThreadPool();
		
		//execute threads
		for (int x = 0; x < 1000; x++) {
			pool.execute(new add(sum));
		}
		
		//print the sum after threads are terminated
		pool.shutdown();
		while (!pool.isTerminated()) {
		}
		System.out.println(sum.sum);
	}

}

class add implements Runnable {
	IntWrapper sum;

	public add(IntWrapper sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		sum.add(1);
	}
	
}

class IntWrapper {
	int sum;
	
	public IntWrapper (int sum) {
		this.sum = sum;
	}
	
	public synchronized void add(int i) {
		sum = sum + i;
	}
}










