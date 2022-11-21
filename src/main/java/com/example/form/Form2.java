package com.example.form;


import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Form2 {

	private int userId;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotEmpty(message = "日付入れてね^^")
	private String startDate;

	//@DateTimeFormat(pattern="yyyy-MM-dd")
	private String endDate;

	private String status;

	@DateTimeFormat(pattern="HH:mm:ss")
	private String startTime;

	private String endTime;

	private String breakTime;

	private String note;	

	private int attendanceId;
}
