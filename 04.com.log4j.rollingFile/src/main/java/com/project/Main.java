package com.project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	public static void main(String[] args) {
		
	
		Logger log = LogManager.getLogger();
		for (int i = 1; i <= 800; i++) {
			log.info(i + ". Logging Message");	
		}
	}

}
