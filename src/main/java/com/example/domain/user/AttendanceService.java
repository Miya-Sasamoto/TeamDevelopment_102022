package com.example.domain.user;

import java.util.List;

import com.example.domain.user.model.MAttendance;

public interface AttendanceService {

	public List<MAttendance> getAttendanceIndex(MAttendance attendance);
}
