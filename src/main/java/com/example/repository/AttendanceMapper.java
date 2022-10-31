package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.user.model.MAttendance; 

@Mapper
public interface AttendanceMapper {
	public int insertOne(MAttendance attendance);
	
	public List<MAttendance> findMany(MAttendance attendance);

}