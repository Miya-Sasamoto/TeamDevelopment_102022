package com.example.domain.user.service;


import java.util.List;

import com.example.domain.user.model.MasterUser;

public interface EditService {
		
	public MasterUser lookOne(String userId);
	
	/**ユーザー取得*/
	public List<MasterUser>getMasterUserｓ();

	/**ユーザー取得(1件)*/
	public MasterUser getUserOne(Integer userId);

	/**ユーザー編集(1件)*/
	public void editUserOne(Integer userId, String name, String nameKana, String mailAddress, String passWord);
	
//	public void editOne(String userId, String name, String nameKana, String mailAddress, String passWord);
	//	/**ユーザー削除(1件)*/
//	public void deleteOne(@Param("userId")String userId);
	
	/**ユーザー削除(1件)*/
	public void deleteUserOne(Integer userId);
//
//	
//	/**ユーザー更新(1件)*/
//	public MasterUser updateUserOne(Integer userId, String name, String nameKana,String mailAddress, String password);
	public void updateUserOne(MasterUser complete);
}