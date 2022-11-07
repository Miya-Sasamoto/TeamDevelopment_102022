package com.example.domain.user.service;

import com.example.domain.user.model.MUser; 
public interface UserService {
	/**ユーザー登録*/
	public void updateOne(MUser user); 
	//ユーザー取得(1件)
		public MUser findOne(Integer attendanceId);
}