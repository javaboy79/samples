package launch4j.plugin.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
	private static Logger logger = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		
		logger.info("Test log message.");
		
		System.out.println("Message logged.");
	}

}
