package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This class check the getPriority and setPriority method
 * @author Jayant
 *
 */
public class ThreadPriority implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/ThreadSetDemo.java");

	public void run() {
		myLogger.setLevel(Level.FINE);
	myLogger.info("After Priority " +Thread.currentThread().getPriority());
	}
public static void main(String[] args) {
	myLogger.info("Before Priority "+Thread.currentThread().getPriority());
	
	ThreadPriority priority=new ThreadPriority();
	Thread th=new Thread(priority);
	th.setPriority(8);
	
	th.start();
}
}