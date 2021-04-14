package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class for set name of thread
 * 
 * @author Jayant
 *
 */
public class ThreadSetNameDemo implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/ThreadSetDemo.java");

	public void run() {
		myLogger.setLevel(Level.FINE);
		myLogger.info("Before Change-:" + Thread.currentThread().getName());
		Thread.currentThread().setName("Jay"); // Changing the name of thread
		myLogger.info("After Change-:" + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		ThreadSetNameDemo demo = new ThreadSetNameDemo();
		Thread th = new Thread(demo);
		th.start();
	}

}
