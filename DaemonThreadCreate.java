package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for Check DaemonThread
 * 
 * @author Jayant
 *
 */
public class DaemonThreadCreate implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/DaemonThreadCreate.java");

	public void run() {
		myLogger.setLevel(Level.FINE);
		myLogger.info(Thread.currentThread().getName());
		myLogger.info(Thread.currentThread().isDaemon() + ", It is Daemon thread");

	}

	public static void main(String[] args) {
		myLogger.info(Thread.currentThread().getName());
		DaemonThreadCreate create = new DaemonThreadCreate();
		Thread t = new Thread(create);
		t.setDaemon(true);
		t.start();
	}

}
