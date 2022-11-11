package com.example.domain.service;

import java.util.List;

import com.example.domain.model.MAttendanceList;

public interface AttendanceService {

//	ユーザー情報取得
	public List<MAttendanceList> getAttendanceList(MAttendanceList attendance);
}
