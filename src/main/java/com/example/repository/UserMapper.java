package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.form.NewRegisterForm;


@Mapper
public interface UserMapper {
    
	public int insertOne(NewRegisterForm newRegisterForm);
}