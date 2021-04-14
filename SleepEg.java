package Multithreading;

import java.util.logging.Logger;

/**
 * Class to check Sleep method
 * 
 * @author Jayant
 *
 */
public class SleepEg implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/SleepEg.java");

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				myLogger.info("" +i);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		SleepEg eg = new SleepEg();
		Thread t = new Thread(eg);
		t.start();
	}

}
