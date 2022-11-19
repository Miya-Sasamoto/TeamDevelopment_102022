package com.example.domain.user.service;


import org.springframework.data.repository.query.Param;

public interface EditService {
	
	
	/**ユーザー更新(1件)*/
	public void updateOne(@Param("userId")String userId,@Param("password")String password,@Param("userName")String userName);

	/**ユーザー削除(1件)*/
	public int deleteOne(@Param("userId")String userId);
	

	/**ユーザー更新(1件)*/
	public void updateUserOne(String userId, String name, String name_kana, String password, String mail_address);


	/**ユーザー削除(1件)*/
	public void deleteUserOne(String userId);

	
}

