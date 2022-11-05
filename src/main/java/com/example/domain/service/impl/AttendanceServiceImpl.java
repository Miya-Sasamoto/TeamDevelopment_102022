package com.example.domain.service.impl;

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
	public List<MAttendanceList> getAttendanceIndex(MAttendanceList attendance) {
		return attendanceMapper.findMany(attendance);
	}
	
}
