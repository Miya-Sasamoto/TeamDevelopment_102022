package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.user.model.MUser;
import com.example.form.Employeelogin;

@Mapper
public interface UserLoginMapper {
	public int insertOne(MUser user);

	public Employeelogin findloginUser(int user_id);

}