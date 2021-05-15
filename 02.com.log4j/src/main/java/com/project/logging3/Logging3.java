package com.project.logging3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging3 {
	
	public void Logger3() {
		Logger logger = LogManager.getLogger();
		logger.fatal("Logger3 çalýþtý");
	}

}
