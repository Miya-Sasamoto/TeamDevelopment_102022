package com.example.form;

import java.sql.Time;
import java.util.Date;

import lombok.Data;

@Data
public class AttendanceListForm {
	private String userId;
	private Date startDate;
	private Date endDate;
	private String status;
	private Time startTime;
	private Time endTime;
	private String breakTime;
	private String note;
}
