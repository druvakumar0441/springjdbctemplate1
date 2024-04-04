package com.spring1;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@ComponentScan
public class OurConfig {

	@Bean
	public DataSource datasouce() {
		BasicDataSource bd = new BasicDataSource();
		bd.setUrl("jdbc:mysql://localhost:3306/spring");
		bd.setUsername("root");
		bd.setPassword("root");
		bd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return bd;
	}
	@Bean
	public JdbcTemplate jdbctemplate() {
		return new JdbcTemplate(datasouce());
	}
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(datasouce());
	}
}
