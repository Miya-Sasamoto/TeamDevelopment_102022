package com.example.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.form.Employeelogin;
import com.example.repository.UserLoginMapper;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	//DBからユーザ情報を検索するメソッドを実装したクラス
	@Autowired
	private UserLoginMapper userLoginMapper;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		int userId = Integer.parseInt(userName);
		Employeelogin user = userLoginMapper.findloginUser(userId);
		System.out.println(user);

		if (user == null) {
			throw new UsernameNotFoundException("User" + userName + "was not found in the database");
		}
		//        return new org.springframework.security.core.userdetails.User(user.getName(), new BCryptPasswordEncoder().encode(user.getPassword()), getGrantedAuth(user));

		//権限のリスト
		//AdminやUserなどが存在するが、今回は利用しないのでUSERのみを仮で設定
		//権限を利用する場合は、DB上で権限テーブル、ユーザ権限テーブルを作成し管理が必要
		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		GrantedAuthority authority = new SimpleGrantedAuthority("USER");
		grantList.add(authority);

		//UserDetailsはインタフェースなのでUserクラスのコンストラクタで生成したユーザオブジェクトをキャスト
		UserDetails userDetails = (UserDetails) new User(user.getUser_id(),
				(user.getPassword()), grantList);

		return userDetails;
	}

}