package com.example.form;

import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
public class SignupForm {

	
	private int userId;
	

	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotEmpty(message = "日付入れてね^^")
	private String startDate;
	
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotEmpty(message = "日付入れてね^^")
	private String endDate;
	
//	@NotNull
	private String status;
	
	//@NotNull
	private String startTime;
	
	private String endTime;
	
	private String breakTime;
	
	//@Min(0)
	//@Max(100)
	private String note;
	
	private int attendanceId;
}
