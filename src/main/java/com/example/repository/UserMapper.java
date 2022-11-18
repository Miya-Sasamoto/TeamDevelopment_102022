package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;


@Mapper
public interface UserMapper {

//    public int insertOne(MUser user);
//    
//  public int insertOne(NewRegisterForm newRegisterForm);
//  
  public void updateOne(@Param("user_id")String user_id,@Param("password")String password,@Param("name")String name);
  /**ユーザー削除(1件)*/
  public int deleteOne(@Param("user_id")String user_id);

    
    
    
    
    
    
    
}