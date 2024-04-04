package com.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class controller {

	@Autowired
	private service service;
	
	public void savedata(student1 s) {
		service.savedata(s);
	}

	public void getbyId(int s) {
		service.getbyId(s);
		
	}

	public void deletebyId(int i) {
		service.deletebyId(i);
		
	}

	public void updatebyid(student student) {
		service.updatebyId(student);
		
	}

	public void getall() {
		service.getall();
		
	}

	public void compare() {
		service.compare();
		
	}

	public void saveAll() {
		service.saveAll();
		
	}

	public void saveAllfromFile() {
		service.saveAllfromFile();
		
	}
}
