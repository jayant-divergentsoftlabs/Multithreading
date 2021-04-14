package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for IsInterrupted and interrupted method
 * 
 * @author Jayant
 *
 */
public class IsInterrupted implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/IsInterrupted.java");

	public void run() {
		myLogger.setLevel(Level.FINE);
		Thread.currentThread();
		//myLogger.info("Interrupted " +Thread.interrupted());
		myLogger.info("IsInterrupted " +Thread.currentThread().isInterrupted());
		try {
			for (int i = 0; i < 4; i++) {

				System.out.println(i);
				Thread.sleep(1000);
				Thread.currentThread();
				System.out.println(Thread.interrupted());
				System.out.println(Thread.currentThread().isInterrupted());
			}

		} catch (Exception e) {
			myLogger.info("Exception");

		}

	}

	public static void main(String[] args) {
		IsInterrupted i = new IsInterrupted();
		Thread t = new Thread(i);
		t.start();
		t.interrupt();
	}

}
