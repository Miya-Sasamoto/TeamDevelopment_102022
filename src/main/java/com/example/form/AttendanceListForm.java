package com.example.form;

import java.sql.Time;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class AttendanceListForm {
	private Integer userId;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private String status;
	private Time startTime;
	private Time endTime;
	private Time workTime;
	private Time breakTime;
	private String note;
	private String reasonForRevision;
	private Integer attendanceId;
}
