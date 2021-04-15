package ExecutorSamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Sample for test Submit() method with newSingleThreadExecutor()
 * @author Jayant
 *
 */
public class SubmitMethodSample {

	public static class ExecutorServiceExample {
		static final Logger myLogger = Logger.getLogger("/Assignment/src/ExecutorSamples/SubmitMethodSample.java");

		public static void main(String[] args) {
			myLogger.setLevel(Level.FINE);
			ExecutorService executorService = Executors.newSingleThreadExecutor();
			executorService.submit(new Runnable() {

				@Override
				public void run() {
					myLogger.info("ExecutorService");

				}
			});
		}
	}

}
