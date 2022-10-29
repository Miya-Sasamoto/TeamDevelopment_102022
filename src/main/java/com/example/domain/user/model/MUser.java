package com.example.domain.user.model;

import java.sql.Time;
import java.util.Date;

import lombok.Data;

@Data
public class MUser {
	private int userId;
	private Date startDate;
	private Date endDate;
	private String status;
	private Time startTime;
	private Time endTime;
	private String breakTime;
	private String note;
	

}
