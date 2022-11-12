package com.example.domain.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org. springframework. stereotype.Service;

import com.example.domain.user.model.MUser;
import com.example.repository. UserMapper;

@Service
public class UserServiceImpl implements NewRegisterService {
    
    @Autowired 
    private UserMapper mapper;
    
    /**ユーザー登録*/
    @Override 
    public void signup(MUser user) { 
        
    mapper.insertOne(user);
    }
}