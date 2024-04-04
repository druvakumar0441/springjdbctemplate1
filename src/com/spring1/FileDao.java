package com.spring1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileDao {
	@Autowired
	private Dao dao;

	public void savedata(student1 s) {
		String path = "D:\\druvdruva\\withspring\\student1.txt";
		try {
			FileWriter fw = new FileWriter(path, true);
			BufferedWriter bf = new BufferedWriter(fw);
			bf.write(s.getSid()+","+s.getSname()+","+s.getSage()+","+s.getSqual());
			bf.newLine();
			bf.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getall() {
		String path = "D:\\druvdruva\\withspring\\student1.txt";
		System.out.println("from FILE");
		ArrayList<student1> al = new ArrayList<student1>();
		try {
			FileReader fw = new FileReader(path);
			BufferedReader bf = new BufferedReader(fw);
			String line;
			while((line=bf.readLine())!=null) {
				String[] parts= line.split(",");
				student1 s1 = new  student1();
				s1.setSid(Integer.parseInt(parts[0]));
				s1.setSname(parts[1]);
				s1.setSage(Integer.parseInt(parts[2]));
				s1.setSqual(parts[3]);
				al.add(s1);
			}
			Iterator<student1> it = al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<student1> getall1() {
		String path = "D:\\druvdruva\\withspring\\student1.txt";
	
		ArrayList<student1> al = new ArrayList<student1>();
		try {
			FileReader fw = new FileReader(path);
			BufferedReader bf = new BufferedReader(fw);
			String line;
			while((line=bf.readLine())!=null) {
				String[] parts= line.split(",");
				student1 s1 = new  student1();
				s1.setSid(Integer.parseInt(parts[0]));
				s1.setSname(parts[1]);
				s1.setSage(Integer.parseInt(parts[2]));
				s1.setSqual(parts[3]);
				al.add(s1);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	public void saveAllfromFile() {
		List<student1> list=getall1();
		dao.saveAllFromFile(list);
		
	}
	
	

	
}
