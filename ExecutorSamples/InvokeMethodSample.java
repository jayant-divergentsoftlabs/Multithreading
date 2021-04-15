package ExecutorSamples;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class is a sample of invokeAll() Method with newSingleThreadExecutor()
 */
public class InvokeMethodSample {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/ExecutorSamples/ExecuteMethodSample.java");

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		myLogger.setLevel(Level.FINE);
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Hey";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Hello";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Bye";
			}
		});

		java.util.List<Future<String>> futures = executorService.invokeAll(callables);

		for (Future<String> future : futures) {
			myLogger.info("future.get = " + future.get());
		}

		executorService.shutdown();

	}
}
