package com.example.domain.user.service;

import com.example.form.NewRegisterForm; 
public interface NewRegisterService {
//    /**ユーザー登録*/
//    public void signup(MUser user); 
//   @Autowired
//    private UserMapper userMapper;
  
    /**ユーザー登録*/
    public void add(NewRegisterForm newRegisterForm); 
//   userMapper.insertOne(newRegisterForm);
    
 }