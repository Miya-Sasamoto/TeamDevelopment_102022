package com.example.domain.user.model;

import java.util.Date;

import lombok.Data;

@Data
public class MUser {
	private String id;
	private Date start_date;
	private Date end_date;
	private String status;
	private String start_time;
	private String end_time;
	private String break_time;
	private String note;
	

}
