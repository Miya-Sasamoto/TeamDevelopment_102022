package com.example.domain.user.model;



import java.util.Date;

import lombok.Data;

@Data
public class MUser {
	private int userId;
	private Date startDate;
	private Date endDate;
	private String status;
	private String startTime;
	private String endTime;
	private String breakTime;
	private String note;
	

}
