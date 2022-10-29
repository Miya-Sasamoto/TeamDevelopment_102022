package com.example.form;

import java.sql.Date;
import java.sql.Time;

import lombok.Data;

@Data
public class SignupForm {

	private int userId;
	
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date startDate;
	
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date endDate;
	
	private String status;
	
	private Time startTime;
	
	private Time endTime;
	
	private Time breakTime;
	
	private String note;
}
