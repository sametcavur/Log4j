package com.project.logging1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging1 {
	
	public void Logger1() {
	Logger logger = LogManager.getLogger();
	logger.warn("Logger 1 çalýþtý");
	}
	
}
