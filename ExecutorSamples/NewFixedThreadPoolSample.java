package ExecutorSamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sample for newFixedThreadPool() and defaultThreadFactory()
 * 
 * @author Jayant
 *
 */
public class NewFixedThreadPoolSample {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/ExecutorSamples/NewFixedThreadpoolSample.java");

	public static void main(final String[] arguments) throws InterruptedException {
		myLogger.setLevel(Level.FINE);
		ThreadFactory ThreadFactory = Executors.defaultThreadFactory();
		ExecutorService excr = Executors.newFixedThreadPool(5, ThreadFactory);
		ThreadPoolExecutor mypool = (ThreadPoolExecutor) excr;
		myLogger.info("size of mypool: " + mypool.getPoolSize());
		excr.submit(new Threadimplement());
		excr.shutdown();
	}

	static class Threadimplement implements Runnable {
		public void run() {
			try {

				myLogger.info("Thread Name: " + Thread.currentThread().getName());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
