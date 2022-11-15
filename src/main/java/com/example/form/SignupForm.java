package com.example.form;

import java.sql.Time;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class SignupForm {

	private int userId;
	
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private String startDate;
	
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotEmpty(message = "日付入れてね^^")
	private String endDate;
	
	private String status;
	
	private Time startTime;
	
	private String endTime;
	
	private String breakTime;
	
	private String note;
	
	private int attendanceId;
}
