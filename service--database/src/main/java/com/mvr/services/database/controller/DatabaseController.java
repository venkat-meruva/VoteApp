package com.mvr.services.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	@RequestMapping("/insert")
	public String index() {
		
		jdbcTemplate.execute("insert into contact(contact_id,name,email,address,telephone)values('123','Venkat','venkat@gmail.com','Charlotte','123456789')");
		return "Data was successfully inserted";
	}
}
	
