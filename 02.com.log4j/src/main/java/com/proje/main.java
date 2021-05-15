package com.proje;

import com.project.logging1.Logging1;
import com.project.logging2.Logging2;
import com.project.logging3.Logging3;

public class main {
	public static void main(String[] args) {
		
		
		Logging1 log1 = new Logging1();
		Logging2 log2 = new Logging2();
		Logging3 log3 = new Logging3();
		
		log3.Logger3();
		
		log2.Logger2("Logger 2 buradan çalýþtý");
		
		log1.Logger1();
	}

}
