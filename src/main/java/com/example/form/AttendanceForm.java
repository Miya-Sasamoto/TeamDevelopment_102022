package com.example.form;

import java.sql.Time;
import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class AttendanceForm {
	
	private Integer attendanceId;
	private Integer userId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	
	private String status;
	
	private Time startTime;
	private Time endTime;
	private Time breakTime;
	
	private String note;
	
	@NotBlank
	private String reasonForRevision;

}
