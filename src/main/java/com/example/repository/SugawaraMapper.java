package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.example.domain.user.model.MasterUser;



@Mapper
public interface SugawaraMapper {



	//ユーザー登録(1件)
	public int addOne(MasterUser masterUser);

	/**ユーザー取得*/
	public List<MasterUser>lookMany();

	//    /**ユーザー取得(1件)

	public MasterUser lookOne(String userId);


	//   /**ユーザー編集(1件)*/
	public void editOne(@Param("userId")String UserId,@Param("name")String name,@Param("NameKana")String NameKana,
			@Param("passWord")String passWord,@Param("mailAddress")String mailAddress);

	/**ユーザー削除(1件)*/
	public int deleteOne(@Param("userId")String userId);

}