
package com.example.domain.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org. springframework. stereotype.Service;

import com.example.domain.user.model.MasterUser;
import com.example.domain.user.service.EditService;
import com.example.repository.SugawaraMapper;

@Service
public class EditServiceImpl implements EditService{
	
	@Autowired
	private SugawaraMapper mapper;
	
	/**ユーザー取得*/
	@Override
	public List<MasterUser>getMasterUserｓ(){
		return mapper.lookMany();
	}

	/**ユーザー取得(1件)*/
	@Override
	public MasterUser getUserOne(String userId){
		return mapper.lookOne(userId);
	}

	/**ユーザー(編集1件)*/
	@Override
	public void editUserOne(String userId,String name,String nameKana,String passWord,String mailAddress){
		 mapper.editOne(userId,name,nameKana,passWord,mailAddress);
		}
	
	/**ユーザー削除(1件)
	 * @return */
	@Override 
	public void deleteUserOne(String userId){
		int count = mapper.deleteOne(userId);
	
	}

	@Override
	public MasterUser lookOne(String userId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	

		
	}