package com.example.form;

import java.sql.Date;
import java.sql.Time;

import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
public class SignupForm {

	
	private int userId;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotEmpty(message = "日付入れてね^^")
	private String startDate;
	
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