package ExecutorSamples;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class is a Sample of Atomic
 * 
 * @author Jayant
 *
 */
public class AtomicVariable extends Thread {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/ExecutorSamples/AtomicVariable.java");
	int count = 0;

	public void run() {
		int max = 1;

		for (int i = 0; i < max; i++) {
			count++;
		}
	}

	public static void main(String args[]) throws InterruptedException {
		myLogger.setLevel(Level.FINE);
		AtomicVariable a = new AtomicVariable();

		Thread t1 = new Thread(a, "First");
		Thread t2 = new Thread(a, "Second");
		Thread t3 = new Thread(a, "Third");
		Thread t4 = new Thread(a, "Fourth");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();

		myLogger.info("Count" + a.count);
		myLogger.info("Name" + a.getName());

	}
}
