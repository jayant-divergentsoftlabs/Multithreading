package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is a sample of Synchronized method
 * 
 * @author Jayant
 *
 */
public class SynchronizedMethodSample {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/SynchronizedMethodSample.java");

	synchronized void print(int n) throws InterruptedException {
		myLogger.setLevel(Level.FINE);
		for (int i = 1; i <= n; i++) {
			myLogger.info(Thread.currentThread().getName() + " :: " + i);
			Thread.sleep(500);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SynchronizedMethodSample sample = new SynchronizedMethodSample();
		sample.print(5);
	}

}
