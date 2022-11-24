package com.example.domain.user.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org. springframework. stereotype.Service;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.SasakiService;
import com.example.repository.SasakiMapper;

@Service
public class SasakiServiceImpl implements SasakiService {

	@Autowired 
	private SasakiMapper mapper;

	/**ユーザー登録*/
	@Override 
	public void updateOne(MUser user) { 
		mapper.updateOne(user);
	}

	public void signup(MUser user) { 
		mapper.insertOne(user);
	}

	//ユーザー取得(1 件）
	@Override 
	public MUser findOne(Integer attendanceId) { 
		return mapper.findOne(attendanceId);
	}
}