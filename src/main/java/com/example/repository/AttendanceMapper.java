package com.example.repository;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.model.MAttendance;
import com.example.domain.model.MAttendanceList; 

@Mapper
public interface AttendanceMapper {
	public int insertOne(MAttendance attendance);
	
	public List<MAttendanceList> findMany(MAttendanceList attendance);
	
	public MAttendanceList selectOne(Integer attendanceId);
	
	public void updateOne(
			@Param("attendanceId")Integer attendanceId,
			@Param("status")String status,
			@Param("startDate")Date startDate,
			@Param("startTime")Time startTime,
			@Param("endDate")Date endDate,
			@Param("endTime")Time endTime,
			@Param("breakTime")Time breakTime,
			@Param("reasonForRevision")String reasonForRevision);
}