package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Employeelogin;


@Mapper
public interface LoginRepository { 
	public Employeelogin identifyUser (String user_id);
}