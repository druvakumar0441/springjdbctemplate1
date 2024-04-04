package com.spring1;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao {

	@Autowired
	private JdbcTemplate ds;
	
	public void savedata(student1 s) {
		int row=ds.update("insert into spring.student1 values (?,?,?,?)", s.getSid(), s.getSname(), s.getSage(), s.getSqual());
		System.out.println(row);
	}

	public void getcount1() {
		Integer o=ds.queryForObject("select count(*) from spring.student ", Integer.class);
		System.out.println(o);
	}
	public void getbyId(int s) {
		student o=ds.queryForObject("select * from spring.student where sid=?",new BeanPropertyRowMapper<student>(student.class),s);
		System.out.println(o);
	}
	public void deletebyId(int i) {
		int row=ds.update("delete from spring.student where sid=?", i);
		System.out.println(row);
	}

	public void updatebyId(student s) {
		int row=ds.update("update spring.student set sage=?, squal=? where sid=?", s.getSage(), s.getSqual(), s.getSid());
		System.out.println(row);
	}

	public void getall() {
	List<student1> st=	ds.query("select * from spring.student1", new BeanPropertyRowMapper<student1>(student1.class));
	System.out.println("from DB");
	for (student1 student : st) {
		System.out.println(student);
	}
	}
	public List<student1> getall1() {
		List<student1> st=	ds.query("select * from spring.student1", new BeanPropertyRowMapper<student1>(student1.class));
		
	
		return st;
		}
	
	public void saveAll() {
		String s = "insert into spring.student1 values (?,?,?,?)";
		System.out.println("inserting all to DB");
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] {4, "eee", 54, "ma"});
		list.add(new Object[] {5, "www", 55, "ba"});
		list.add(new Object[] {6, "rrr", 45, "llb"});
		ds.batchUpdate(s, list);
		}

	public void saveAllFromFile(List<student1> list) {
		String s = "insert into spring.student1 values (?,?,?,?)";
		System.out.println("inserting all to DB from File");
		List<Object[]> ob = new ArrayList<Object[]>();
		for (student1 st : list) {
			ob.add(new Object[] {st.getSid(), st.getSname(), st.getSage(), st.getSqual()});
		}
		
		ds.batchUpdate(s, ob);
		
	}
}
