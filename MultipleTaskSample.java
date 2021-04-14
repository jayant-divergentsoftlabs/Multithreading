package Multithreading;

import java.util.logging.Logger;

/**
 * Class for test Multiple task by multiple thread
 * 
 * @author Jayant
 *
 */
public class MultipleTaskSample implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/MultipleTask.java");

	@Override
	public void run() {
		int a = 118, b = 118;
		myLogger.info("divide is " + a / b);

	}

	public static class MultipleTask implements Runnable {
		@Override
		public void run() {
			int a = 100, b = 50;
			myLogger.info("Divide is " + a / b);

		}
	}

	public static void main(String[] args) {
		MultipleTaskSample test = new MultipleTaskSample();
		Thread th = new Thread(test);
		th.start();

		MultipleTask t = new MultipleTask();
		Thread th2 = new Thread(t);
		th2.start();
	}
}
