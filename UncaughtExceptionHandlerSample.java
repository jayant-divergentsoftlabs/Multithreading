package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for setUncaughtExceptionHandler
 * @author Jayant
 *
 */
public class UncaughtExceptionHandlerSample implements Runnable {
	static final Logger myLogger = Logger.getLogger(
			"/Assignment/src/Multithreading/UncaughtExceptionHandlerSample.java");
	public void run() {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		myLogger.setLevel(Level.FINE);
		Thread t = new Thread(new UncaughtExceptionHandlerSample());
		t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			public void uncaughtException(Thread t, Throwable e) {
				myLogger.info(t + " throws exception: " + e);
			}
		});
		t.start();
	}
}
