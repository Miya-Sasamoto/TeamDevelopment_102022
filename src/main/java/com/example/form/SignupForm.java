package com.example.form;

import java.sql.Date;
import java.sql.Time;

import lombok.Data;

@Data
public class SignupForm {

	
	private int userId;
	
//	@DateTimeFormat(pattern="yyyy-MM-dd")
//	@NotNull(message = "生年月日を入力してください")
	private Date startDate;
	
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date endDate;
	
//	@NotNull
	private String status;
	
	//@NotNull
	private String startTime;
	
	private Time endTime;
	
	private Time breakTime;
	
	//@Min(0)
	//@Max(100)
	private String note;
}