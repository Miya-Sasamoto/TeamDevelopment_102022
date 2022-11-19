package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;


@Mapper
public interface UserMapper {

//    public int insertOne(MUser user);
//    
//  public int insertOne(NewRegisterForm newRegisterForm);
//   /**ユーザー登録(1件)*/
  public void updateOne(@Param("user_id")String user_id,@Param("name")String name,@Param("name_kana")String name_kana,
		  @Param("password")String password,@Param("mail_address")String mail_address);
  /**ユーザー削除(1件)*/
  public int deleteOne(@Param("user_id")String user_id);
   
}