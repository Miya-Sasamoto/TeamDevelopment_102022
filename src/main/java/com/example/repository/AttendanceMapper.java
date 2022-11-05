package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.model.MAttendance;
import com.example.domain.model.MAttendanceList; 

@Mapper
public interface AttendanceMapper {
	public int insertOne(MAttendance attendance);
	
	public List<MAttendanceList> findMany(MAttendanceList attendance);

}