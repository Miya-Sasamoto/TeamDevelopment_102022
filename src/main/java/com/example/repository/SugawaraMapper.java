package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.example.domain.user.model.MasterUser;



@Mapper
public interface SugawaraMapper {
	

	
	//ユーザー追加(1件)
	public void addOne(MasterUser MasterUser);

	
	/**ユーザー取得(1件)
	 * @param mailAddress 
	 * @param passWord 
	 * @param nameKana 
	 * @param name */
	public void lookOne(@Param("user")String user_id);

	
//    public int insertOne(MUser user);
//    
//  public int insertOne(NewRegisterForm newRegisterForm);
//   /**ユーザー登録(1件)*/
  public void updateOne(@Param("user")String user_id,@Param("user")String name,@Param("user")String name_kana,
		  @Param("user")String password,@Param("mail_address")String mail_address);
 
  /**ユーザー削除(1件)*/
  public int deleteOne(@Param("user")String user_id);
   
}