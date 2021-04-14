package Multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This class is a sample of condition object and variable
 * @author Jayant
 *
 */
public class ConditionSample implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/ConditionSample.java");

	public void run() {
		myLogger.setLevel(Level.FINE);
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();

		
		lock.lock();
		try {
			condition.await();
			myLogger.info("Operation1");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
			 finally {
			lock.unlock();
		}

		lock.lock();
		try {
			myLogger.info("Operation 2");
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ConditionSample sample = new ConditionSample();
		Thread thread = new Thread(sample);
	     thread.start();
	}
}
