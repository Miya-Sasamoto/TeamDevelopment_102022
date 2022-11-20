package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.example.form.EditForm;


@Mapper
public interface UserMapper {

	
	/**ユーザー取得(1件)
	 * @param mailAddress 
	 * @param passWord 
	 * @param nameKana 
	 * @param name */
	public EditForm findOne(@Param("user_id")Integer user_id);

	
//    public int insertOne(MUser user);
//    
//  public int insertOne(NewRegisterForm newRegisterForm);
//   /**ユーザー登録(1件)*/
  public void updateOne(@Param("user_id")Integer user_id,@Param("name")String name,@Param("name_kana")String name_kana,
		  @Param("password")String password,@Param("mail_address")String mail_address);
  /**ユーザー削除(1件)*/
  public int deleteOne(@Param("user_id")Integer user_id);
   
}