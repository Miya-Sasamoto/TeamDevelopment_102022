package com.example.domain.user.model;

<<<<<<< Updated upstream
import java.sql.Time;
import java.util.Date;

=======
import java.util.Date;
import lombok
>>>>>>> Stashed changes
import lombok.Data;

@Data
public class MUser {
<<<<<<< Updated upstream
	private int userId;
	private Date startDate;
	private Date endDate;
	private String status;
	private Time startTime;
	private Time endTime;
	private String breakTime;
=======
	private String userId;
	private Date start_date;
	private Date end_date;
	private String status;
	private String start_time;
	private String end_time;
	private String break_time;
>>>>>>> Stashed changes
	private String note;
	

}
