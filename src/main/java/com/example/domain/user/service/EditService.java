package com.example.domain.user.service;


import java.util.List;

import com.example.domain.user.model.MasterUser;

public interface EditService {
	
	
//	public EditForm lookOne(String userId);	
	
	public MasterUser lookOne(String userId);
	
	/**ユーザー取得*/
	public List<MasterUser>getMasterUserｓ();

	/**ユーザー取得(1件)*/
	public MasterUser getUserOne(String userId);

	
	
	/**ユーザー編集(1件)*/
	public void editUserOne(String userId, String name, String nameKana, String mailAddress, String passWord);
	
//	public void editOne(String userId, String name, String nameKana, String mailAddress, String passWord);
	//	/**ユーザー削除(1件)*/
//	public void deleteOne(@Param("userId")String userId);
	
	/**ユーザー削除(1件)*/
	public void deleteUserOne(String userId);
//
//	
//	/**ユーザー更新(1件)*/
//	public MasterUser updateUserOne(String userId, String name, String nameKana,String mailAddress, String password);
	
}