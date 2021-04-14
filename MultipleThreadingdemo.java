package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Class for multiplethread and SgetId
 * @author Jayant
 *
 */
public class MultipleThreadingdemo implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/MultipleThreadingdemo.java");

	@Override
	public void run() {
		myLogger.setLevel(Level.FINE);
		try {
			myLogger.info("Thread is " + Thread.currentThread().getId());
		} catch (Exception e) {
			myLogger.info("Exception");
		}
	}

	public static void main(String[] ar) {
		MultipleThreadingdemo m=new MultipleThreadingdemo();
		Thread object = new Thread(m);
		object.start();

	}

}
