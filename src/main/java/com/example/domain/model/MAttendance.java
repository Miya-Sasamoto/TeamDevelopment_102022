package com.example.domain.model;

import java.sql.Time;
import java.util.Date;

import lombok.Data;

@Data
public class MAttendance {
	private Integer userId;
	private Date startDate;
	private Date endDate;
	private String status;
	private Time startTime;
	private Time endTime;
	private Time breakTime;
	private String note;
	private String reasonForRevision;
	
}
