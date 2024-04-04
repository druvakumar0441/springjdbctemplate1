package com.spring1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class Dao2 {

	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public void getById() {
		String s = "select sname from spring.student1 where sid=:sid";
		MapSqlParameterSource ms = new MapSqlParameterSource();
		ms.addValue("sid", 2);
		String name=template.queryForObject(s, ms, String.class);
		System.out.println(name);
	}
	
	public void getById1() {
		String s = "select sname from spring.student1 where sid=:sid";
		Map<String, Integer> ms = new HashMap<>();
		ms.put("sid", 4);
		String name=template.queryForObject(s, ms, String.class);
		System.out.println(name);
	}
	public void getStudentById() {
		String s = "select * from spring.student1 where sid=:sid";
		MapSqlParameterSource ms = new MapSqlParameterSource();
		ms.addValue("sid", 6);
		student1 name=template.queryForObject(s, ms,new BeanPropertyRowMapper<student1>(student1.class));
		System.out.println(name);
	}
	public void getAll() {
		String s = "select * from spring.student1";
	
		List<student1> name=template.query(s,new BeanPropertyRowMapper<student1>(student1.class));
		for (student1 student1 : name) {
			System.out.println(student1);
		}
	}
	public void getStudentByName() {
		String s = "select * from spring.student1 where sname=:sname";
		MapSqlParameterSource ms = new MapSqlParameterSource();
		ms.addValue("sname", "rrr");
		List<student1> name=template.query(s, ms,new BeanPropertyRowMapper<student1>(student1.class));
		for (student1 student1 : name) {
			System.out.println(student1);
		}
	}
	public void save() {
		String s = "insert into spring.student1 values (:sid, :sname, :sage, :squal)";
		MapSqlParameterSource ms = new MapSqlParameterSource();
		ms.addValue("sid", 10);
		ms.addValue("sname", "qqq");
		ms.addValue("sage", 60);
		ms.addValue("squal", "jedge");
		System.out.println("========");
		int name=template.update(s, ms);
		System.out.println(name+"==");
		System.out.println("========");
	}
	public void update() {
		String s = "update spring.student1 set sname=:sname, sage=:sage where sid=:sid";
		MapSqlParameterSource ms = new MapSqlParameterSource();
		ms.addValue("sid", 9);
		ms.addValue("sname", "ppp");
		ms.addValue("sage", 30);
		
		System.out.println("========");
		int name=template.update(s, ms);
		System.out.println(name+"==");
		System.out.println("========");
	}

	public void saveAll() {
		String st = "insert into spring.student1 values (:sid, :sname, :sage, :squal)";
		List<student1> list = new ArrayList<student1>();
		list.add(new student1(11, "eee", 22, "test"));
		list.add(new student1(12, "ccc", 23, "ui"));
		list.add(new student1(13, "vvv", 24, "ana"));
		list.add(new student1(14, "sss", 27, "team"));
		
		SqlParameterSource[] ms = list.stream().map(s-> new MapSqlParameterSource()
				.addValue("sid", s.getSid())
				.addValue("sname", s.getSname())
				.addValue("sage", s.getSage())
				.addValue("squal", s.getSqual())
				)
				.toArray(SqlParameterSource[]::new);
		
		System.out.println("========");
		int[] name=template.batchUpdate(st, ms);
		System.out.println(name.length+"==");
		System.out.println("========");
		
	}
	public void delete() {
		String s = "delete from spring.student1 where sid=:sid";
		MapSqlParameterSource ms = new MapSqlParameterSource();
		ms.addValue("sid", 4);
		int name=template.update(s, ms);
		System.out.println(name);
	}

}
