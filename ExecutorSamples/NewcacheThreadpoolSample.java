package ExecutorSamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A sample for newCachedThreadPool();
 * 
 * @author Jayant
 *
 */
public class NewcacheThreadpoolSample {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/ExecutorSamples/NewcacheThreadpoolSample.java");

	public static void main(final String[] arguments) throws InterruptedException {
		myLogger.setLevel(Level.FINE);
		ExecutorService excr = Executors.newCachedThreadPool();
		ThreadPoolExecutor mypool = (ThreadPoolExecutor) excr;

		System.out.println("size of mypool: " + mypool.getPoolSize());
		excr.submit(new Thread());
		excr.submit(new Threadimplement());
		myLogger.info("Total number threads scheduled:" + mypool.getTaskCount());
		excr.shutdown();
	}
}

class Threadimplement implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/ExecutorSamples/NewcacheThreadpoolSample.java");

	public void run() {

		try {
			myLogger.setLevel(Level.FINE);
			Long num = (long) (Math.random() / 30);
			myLogger.info("Thread Name: " + Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(num);
			System.out.println("after sleep Thread Name: " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
