package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main1(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.savedata(new student1(3, "ggg", 53, "btech"));
		
	}
	public static void main2(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.getbyId(23);
		
	}
	public static void main3(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.deletebyId(2);
		
	}
	public static void main4(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.updatebyid(new student(19, " ccc", 51, "mcom"));
		
	}
	public static void main7(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.getall();
		
	}
	public static void main8(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.compare();
		
	}
	public static void main9(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.saveAll();
		
	}
	public static void main11(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(OurConfig.class);
		controller c=ac.getBean(controller.class);
		c.saveAllfromFile();
		
	}
	
}
