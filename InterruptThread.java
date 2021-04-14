package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for Check Interrupt Thread
 * 
 * @author Jayant
 *
 */
public class InterruptThread implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/InterruptThread.java");

	public void run() {
		myLogger.setLevel(Level.FINE);
		try {
			for (int i = 0; i < 5; i++) {
				myLogger.info("" +i);

			}
			Thread.sleep(1000);
		} catch (Exception e) {
			myLogger.info("Exception");
		}
	}

	public static void main(String[] args) {
		InterruptThread th = new InterruptThread();
		Thread thread = new Thread(th);
		thread.start();
		thread.interrupt();
	}
}
