package com.project.logging2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging2 {
	public void Logger2(String x) {
	Logger logger = LogManager.getLogger();
	logger.info(x);
	}
}
