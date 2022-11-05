package com.example.domain.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.user.AttendanceService;
import com.example.domain.user.model.MAttendance;
import com.example.repository.AttendanceMapper;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	
	@Autowired 
	public AttendanceMapper attendanceMapper;
	
	@Override
	public List<MAttendance> getAttendanceIndex(MAttendance attendance) {
		return attendanceMapper.findMany(attendance);
	
}
}