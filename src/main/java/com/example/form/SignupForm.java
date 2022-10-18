package com.example.form;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {

	private String userId;
	
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date start_date;
	
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date end_date;
	
	private String status;
	
	private String start_time;
	
	private String end_time;
	
	private String break_time;
	
	private String note;
}
