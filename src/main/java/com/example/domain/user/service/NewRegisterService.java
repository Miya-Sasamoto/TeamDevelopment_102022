package com.example.domain.user.service;

import com.example.domain.user.model.MasterUser; 
public interface NewRegisterService {
//    /**ユーザー登録*/
//    public void signup(MUser user); 
//   @Autowired
//    private UserMapper userMapper;
  
    /**ユーザー登録*/
    public void addOne(MasterUser masterUser); 
//   userMapper.insertOne(newRegisterForm);
    
 }