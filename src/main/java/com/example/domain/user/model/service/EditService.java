package com.example.domain.user.model.service;

import com.example.domain.user.model.MUser;
import com.example.form.NewRegisterForm; 
public interface EditService {
    /**ユーザー登録*/
    public void signup(MUser user); 
    
    /**ユーザー登録*/
    public void  insert(NewRegisterForm newRegisterForm) {
    userMapper.insertOne(newRegisterForm);
    }

}