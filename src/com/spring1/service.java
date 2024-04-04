package com.spring1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class service {

	@Autowired
	private Dao dao;
	
	@Autowired
	private FileDao fdao;
	
	public void savedata(student1 s) {
		dao.savedata(s);
		fdao.savedata(s);
	}

	public void getbyId(int s) {
	dao.getbyId(s);
		
	}

	public void deletebyId(int i) {

		dao.deletebyId(i);
		
	}

	public void updatebyId(student student) {
		dao.updatebyId(student);
		
	}

	public void getall() {
		dao.getall();	
		fdao.getall();
	}

	public void compare() {
		List<student1> dall=dao.getall1();	
		List<student1> fall=fdao.getall1();
		Iterator<student1> dst = dall.iterator();
		Iterator<student1> fst = fall.iterator();
		
			System.out.println("=======================");
			for (student1 student1 : fall) {
	            boolean found = false;
	            for (student1 student2 : dall) {
	                if (student1.equals(student2)) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                System.out.println("the object which are not db: " + student1);
	                dao.savedata(student1);
	                System.out.println("saved into db");
	            }else {
	            	System.out.println("all are matched");
	            }
	        }
		
	}

	public void saveAll() {
		dao.saveAll();
		
	}

	public void saveAllfromFile() {
	fdao.saveAllfromFile();
		
	}
	
}
