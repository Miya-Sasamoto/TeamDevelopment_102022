package com.example.domain.service;


import org.springframework.data.repository.query.Param;

import com.example.form.EditForm;

public interface EditService {
	
	/**ユーザー取得(1件)*/
//	public EditForm findOne(Integer userId);
//	
//	ユーザー情報取得
//	public List<EditList> getAttendanceList(Edit editList);
	public EditForm findOne(Integer userId);	
	
	/**ユーザー更新(1件)*/
	public void updateOne(@Param("userId")Integer userId);
	public void updateOne(Integer userId, String name, String nameKana, String mailAddress, String passWord);
	
	/**ユーザー削除(1件)*/
	public int deleteOne(@Param("userId")Integer userId);
	/**ユーザー削除(1件)*/
	public void deleteUserOne(Integer userId);

	
	/**ユーザー更新(1件)*/
	public void updateUserOne(Integer userId, String name, String nameKana,String mailAddress, String password);
	
}

