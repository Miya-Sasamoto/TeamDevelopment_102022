package com.example.application.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.form.NewRegisterForm;
import com.example.repository.UserMapper;

@Service
public class NewRegisterService{
    
    @Autowired
    private UserMapper userMapper;
    /**ユーザー登録*/
    public void  insert(NewRegisterForm newRegisterForm) {
    userMapper.insertOne(newRegisterForm);
    }
}