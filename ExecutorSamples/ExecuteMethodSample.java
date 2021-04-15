package ExecutorSamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Sample for test execute() method with newSingleThreadExecutor()
 * @author Jayant
 *
 */
public class ExecuteMethodSample {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/ExecutorSamples/ExecuteMethodSample.java");

	public static void main(String[] args) {
		myLogger.setLevel(Level.FINE);
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				myLogger.info("ExecutorService");

			}
		});
		executorService.shutdown();
	}
}
