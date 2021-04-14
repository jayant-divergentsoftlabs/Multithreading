package Multithreading;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for Sample of ReetrantLock
 * 
 * @author Jayant
 *
 */
public class ReetrantlockSample implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/ReetrantlockSample.java");

	 ReentrantLock lock;
      
	public ReetrantlockSample(ReentrantLock lock) {
		this.lock = lock;
	

	}

	public void run(){
		myLogger.setLevel(Level.FINE);
		try {
		myLogger.info(Thread.currentThread().getName() + " is Waiting to get the lock");
		lock.lock();
		myLogger.info(Thread.currentThread().getName() + " has got the  lock.");
		
			Thread.sleep(2000);
			myLogger.info("A");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		finally {
		lock.unlock();
		myLogger.info(Thread.currentThread().getName() + "Released from lock");
		}
	}

	public static void main(String[] args) {
		ReetrantlockSample sample = new ReetrantlockSample(null);
		Thread t = new Thread(sample);
		t.start();

	}

}
