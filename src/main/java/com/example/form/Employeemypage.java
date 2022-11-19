package com.example.form;


import lombok.Data;

@Data
public class Employeemypage {
	
/**
* ID
*/
//@GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
