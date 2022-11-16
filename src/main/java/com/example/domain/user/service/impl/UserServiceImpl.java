package com.example.domain.user.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org. springframework. stereotype.Service;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service. UserService;
import com.example.repository. UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserMapper mapper;

	/**ユーザー登録*/
	@Override 
	public void updateOne(MUser user) { 
		System.out.println("ここまで来てる");
	}
//		
//		user.setUserId(5);
//		user.setNote("更新されました");


	public void signup(MUser user) { 

	mapper.insertOne(user);

	}

	//ユーザー取得(1 件）
		@Override 
		public MUser findOne(Integer attendanceId) { 
			return mapper.findOne(attendanceId);
		}
}

