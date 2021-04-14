
package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for check single task by creating multiple thread
 * 
 * @author Jayant
 *
 */
public class SingleTask implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/SingleTask.java");

	public void run() {
		myLogger.setLevel(Level.FINE);
		int a = 2, b = 4;
		myLogger.info(" Addition is " +(a + b)); // single task
	}

	public static void main(String[] args) {
		SingleTask test1 = new SingleTask();
		Thread th = new Thread(test1);
		th.start();
		Thread th2 = new Thread(test1); // multiple thread
		th2.start();
	}

}
