package ExecutorSamples;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CollableSample {
	static final Logger myLogger = Logger.getLogger("/Assignment/src/ExecutorSamples/CollableSample.java");

	static Callable<String> c = new Callable<String>() {

		@Override
		public String call() throws Exception {
			myLogger.setLevel(Level.FINE);
			myLogger.info("Result Executed");

			return null;
		}

	};

	public static void main(String[] args) throws Exception {
		c.call();

	}
}
