package com.example.domain.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org. springframework. stereotype.Service;

import com.example.domain.user.service.EditService;
import com.example.repository. UserMapper;

@Service
public class EditServiceImpl implements EditService{
	
	@Autowired
	private UserMapper mapper;
	
	/**ユーザー更新(1件)*/
	@Override
	public void updateUserOne(String userId,String name,String name_kana,String password,String mail_address){
		mapper.updateOne(userId,name,name_kana,password,mail_address);
		}
	/**ユーザー削除(1件)*/
	@Override 
	public void deleteUserOne(String userId){
		int count = mapper.deleteOne(userId);
	
	}
	
	
//	下記自動生成
	@Override
	public void updateOne(String userId, String password, String userName) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public int deleteOne(String userId) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}