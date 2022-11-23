package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.user.model.MUser;
import com.example.form.NewRegisterForm; 



@Mapper
public interface SugawaraMapper {
	
	public int updateOne(MUser user);
	
	//ユーザー取得(1件)
		public MUser findOne(Integer attendanceId);

		public void add_One(NewRegisterForm newRegisterForm);
		
		public int addOne(NewRegisterForm newRegisterForm);
}
