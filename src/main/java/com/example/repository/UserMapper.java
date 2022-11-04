package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.user.model.MUser; 

@Mapper
public interface UserMapper {
	public int insertOne(MUser user);
	//ユーザー取得(1件)
		public MUser findOne(Integer attendanceId);
}