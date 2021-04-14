package Multithreading;

import java.util.logging.Logger;
/**
 * Class for the Sample of synchronized Block
 * @author Jayant
 *
 */
public class SynchronizedBlockSample implements Runnable {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/Multithreading/SynchronizedMethodSample.java");
	public void run() 
		{
		String a = "Hello";
			synchronized(this) {
				myLogger.info(a +" Sending");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				myLogger.info(a +" Sent");
			}
		
		
	}
	public static void main(String[] args) {
		SynchronizedBlockSample sample =new SynchronizedBlockSample();
		Thread thread=new Thread(sample);
		thread.start();
	}
	

}
