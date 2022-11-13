package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.user.model.MUser;
import com.example.entity.Employeelogin;

@Mapper
public interface UserMapper {
	public int insertOne(MUser user);

	public Employeelogin findloginUser(int user_id);

}