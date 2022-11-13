package com.example.domain.service.impl;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.model.MAttendanceList;
import com.example.domain.service.AttendanceService;
import com.example.repository.AttendanceMapper;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	
	@Autowired 
	public AttendanceMapper attendanceMapper;
	
	
	@Override
	public List<MAttendanceList> getAttendanceList(MAttendanceList attendance) {
		return attendanceMapper.findMany(attendance);
	}
	
	@Override
	public MAttendanceList getAttendanceOne(Integer attendanceId) {
		return attendanceMapper.selectOne(attendanceId);
		
	}
	
	@Override
	public void updateAttendanceOne(
			Integer attendanceId,
			String status,
			Date startDate,
			Time startTime,
			Date endDate,
			Time endTime,
			Time breakTime,
			String reasonForRevision
			) {
		
		System.out.println("data:" + attendanceId  + reasonForRevision);
		attendanceMapper.updateOne(attendanceId,status,startDate,startTime,endDate,endTime,breakTime,reasonForRevision);
	}
	
}
