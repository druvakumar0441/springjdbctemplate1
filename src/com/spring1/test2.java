package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test2 {

	private static ApplicationContext ac;

	public static void main(String[] args) {
		ac = new AnnotationConfigApplicationContext(OurConfig.class);
		Dao2 d=ac.getBean(Dao2.class);
		d.delete();
		
	}
}
