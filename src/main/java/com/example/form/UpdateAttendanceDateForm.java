package com.example.form;

import java.sql.Time;
import java.util.Date;

import lombok.Data;

@Data
public class UpdateAttendanceDateForm {
	
	private Date startDate;
	private Date endDate;
	
	private String status;
	
	private Time startTime;
	private Time endTime;
	private Time breakTime;
	
	private String note;
	private String reasonForRevision;

}
