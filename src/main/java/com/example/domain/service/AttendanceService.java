package com.example.domain.service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import com.example.domain.model.MAttendanceList;

public interface AttendanceService {

//	ユーザー情報取得
	public List<MAttendanceList> getAttendanceList(MAttendanceList attendance);
	
	public MAttendanceList getAttendanceOne(Integer attendanceId);
	
	public void updateAttendanceOne(
			Integer attendanceId,
			Date startDate,
			Time startTime,
			Date endDate,
			Time endTime,
			Time breakTime,
			String reasonForRevision
			);
	
}
