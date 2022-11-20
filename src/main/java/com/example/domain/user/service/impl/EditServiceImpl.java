package com.example.domain.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org. springframework. stereotype.Service;

import com.example.domain.user.service.EditService;
import com.example.form.EditForm;
import com.example.repository. UserMapper;

@Service
public class EditServiceImpl implements EditService{
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	/**ユーザー取得(1件)*/
	public EditForm findOne(Integer userId) {
		return mapper.findOne(userId);
	}
	/**ユーザー更新(1件)*/
	@Override
	public void updateUserOne(Integer userId,String name,String nameKana,String passWord,String mailAddress){
		mapper.updateOne(userId,name,nameKana,passWord,mailAddress);
		}
	/**ユーザー削除(1件)*/
	@Override 
	public void deleteUserOne(Integer userId){
		int count = mapper.deleteOne(userId);
	
	}
	
	
//	下記自動生成
	@Override
	public void updateOne(Integer userId) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public int deleteOne(Integer userId) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	@Override
	public void updateOne(Integer userId, String name, String nameKana, String mailAddress, String passWord) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}