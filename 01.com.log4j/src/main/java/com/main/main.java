package com.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(main.class); 
		logger.trace("Trace Message");
		logger.debug("Debug Message");
		logger.info("Ýnfo Message");
		logger.warn("Warn Message");
		logger.error("Error Message");
		logger.fatal("Fatal Message");
	}
}
