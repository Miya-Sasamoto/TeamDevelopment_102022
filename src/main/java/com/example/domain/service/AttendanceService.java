package com.example.domain.service;

import java.util.List;

import com.example.domain.model.MAttendanceList;

public interface AttendanceService {

	public List<MAttendanceList> getAttendanceIndex(MAttendanceList attendance);
}
