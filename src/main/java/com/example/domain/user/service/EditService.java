package com.example.domain.user.service;


import org.springframework.data.repository.query.Param;

public interface EditService {
	/**ユーザー更新(1件)*/
	public void updateOne(@Param("userId")String userId,@Param("password")String password,@Param("userName")String userName);

	/**ユーザー削除(1件)*/
	public int deleteOne(@Param("userId")String userId);
	
}

