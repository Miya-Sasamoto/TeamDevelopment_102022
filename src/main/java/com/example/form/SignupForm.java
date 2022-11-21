package com.example.form;


import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {

	private int userId;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String startDate;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotEmpty(message = "日付入れてね^^")
	private String endDate;

	private String status;

	private String startTime;

	@DateTimeFormat(pattern="HH:mm:ss")
	private String endTime;

	private String breakTime;

	private String note;

	private int attendanceId;
}
