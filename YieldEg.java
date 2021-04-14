package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class for check yield method
 * 
 * @author Jayant
 *
 */
public class YieldEg implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/YieldEg.java");

	public void run() {
		myLogger.setLevel(Level.FINE);

		for (int i = 0; i < 5; i++) {
			myLogger.info(Thread.currentThread().getId() + "-" + i);
		}
	}

	public static void main(String[] args) {
		YieldEg eg = new YieldEg();
		Thread t = new Thread(eg);

		t.start();

		for (int i = 0; i < 5; i++) {
			Thread.yield();
			myLogger.info("yield");
		}
	}

}
