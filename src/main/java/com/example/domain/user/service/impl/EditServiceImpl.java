//package com.example.domain.user.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org. springframework. stereotype.Service;
//
//import com.example.domain.user.service.EditService;
//import com.example.repository. UserMapper;
//
//@Service
//public class EditServiceImpl implements EditService{
//	
//	@Autowired
//	private UserMapper mapper;
//	
//	/**ユーザー更新(1件)*/
//	@Override
//	public void updateUserOne(String userId,String password,String userName){
//		mapper.updateOne(userId,password,userName);
//		}
//	/**ユーザー削除(1件)*/
//	@Override 
//	public void deleteUserOne(String userId){
//		int count = mapper.deleteOne(userId);
//	
//	}
//
//}