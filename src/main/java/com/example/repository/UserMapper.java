package com.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.example.domain.user.model.MUser;
import com.example.form.EditForm;
import com.example.form.NewRegisterForm;


@Mapper
public interface UserMapper {
	
	public int updateOne(MUser user);
	
	//ユーザー取得(1件)
		public MUser findOne(Integer attendanceId);
		
	public void insertOne(MUser user);
		
		public void addOne(NewRegisterForm newRegisterForm);

	
	/**ユーザー取得(1件)
	 * @param mailAddress 
	 * @param passWord 
	 * @param nameKana 
	 * @param name */
	public EditForm lookOne(@Param("user_id")Integer user_id);

	
//    public int insertOne(MUser user);
//    
//  public int insertOne(NewRegisterForm newRegisterForm);
//   /**ユーザー登録(1件)*/
  public void updateOne(@Param("user_id")Integer user_id,@Param("name")String name,@Param("name_kana")String name_kana,
		  @Param("password")String password,@Param("mail_address")String mail_address);
  /**ユーザー削除(1件)*/
  public int deleteOne(@Param("user_id")Integer user_id);
   
}