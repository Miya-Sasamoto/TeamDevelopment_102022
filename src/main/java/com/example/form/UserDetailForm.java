package com.example.form;

import java.sql.Time;

import lombok.Data;

@Data
public class UserDetailForm {
	private int userId;
	
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private String startDate;
	
	//@DateTimeFormat(pattern="yyyy/MM/dd")
//	@NotNull
	private String endDate;
	
	private String status;
	
	private Time startTime;
	
	private Time endTime;
	
	private String breakTime;
	
	private String note;
	
	private int attendanceId;
}
