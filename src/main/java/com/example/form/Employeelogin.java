package com.example.form;

/*import org.springframework.format.annotation.DateTimeFormat;*/
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;

import lombok.Data;

@Data
public class Employeelogin {
	private static void init(Model model) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//Principalからログインユーザの情報を取得
		String userId = auth.getName();
		model.addAttribute("userId", userId);
	}

	/**
	 * ID
	 */
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String user_id;
	/**
	 * 名前
	 */

	private String name;
	/**
	 * カナ
	 */

	private String name_kana;
	/**
	 * パスワード
	 */

	private String password;
	/**
	 * メールアドレス
	 */

	private String mail_address;

	// @Override
	// public boolean isAccountNonExpired() {
	//	 return  !expired;
	// }
	// 
	// @Override
	// public boolean isAccountNonLocked() {
	//	 return !locked;
	// }
	// 
	// @Override
	// public boolean isCredentialsNonExpired() {
	//	 return !expired;
	// }
	// 
	// @Override
	// public boolean isEnabled() {
	//	 return !locked;
	// }
	/**
	 * 生年月日
	 */
	/* @Column(name = "birthday")
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private  Date birthday;
	 /**
	  * 性別
	  */
	/* @Column(name = "gender")
	 private Integer gender;
	 
	 @Column(name = "prefecture_code")
	 private Integer prefecture_code;
	
	 @Column(name = "department_code")
	 private Integer department_code;
	 
	
	 @Column(name = "entry_date")
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private  Date entry_date;*/
}