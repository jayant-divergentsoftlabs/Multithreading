package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for check getName and isAlive method of thread
 * @author Jayant
 *
 */
public class Threadname implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/Threadname.java");

	public void run() {
		myLogger.setLevel(Level.FINE);
		myLogger.info("Name-:" +Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Threadname t=new Threadname();
		myLogger.info("Name-:" +Thread.currentThread().getName());
		
		
		Thread th=new Thread(t);
		th.start();
		myLogger.info("" +Thread.currentThread().isAlive());
		myLogger.info("" +th.isAlive ());
		
		
	}
}
