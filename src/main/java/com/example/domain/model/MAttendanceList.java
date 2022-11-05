package com.example.domain.model;

import java.sql.Time;
import java.util.Date;

import lombok.Data;

@Data
public class MAttendanceList {
	private Integer attendanceId;
	private String name;
	private Date startDate;
	private Date endDate;
	private String status;
	private Time startTime;
	private Time endTime;
	private Time workTime;
	private Time breakTime;
	private String note;
}
