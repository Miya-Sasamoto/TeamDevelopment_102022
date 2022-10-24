package com.example.controller;

import java. util.Locale;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.form.SignupForm; 


@Controller
@RequestMapping("/user")
public class SignupController{
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private  ModelMapper modelMapper;
	
	/**出勤登録画面を表示*/
	@GetMapping("/signup") 
	public String getSignup(Model model, Locale locale) { 
		System.out.println("ここを通っている");
		return "/attendance";
	} 
	
	
	/**出勤登録処理*/
	@PostMapping("/complete") 
	public String postSignup(Model model,Locale locale,@ModelAttribute SignupForm form)
		 { 
		
		System.out.println("ここを通っている２２");
		
		//formをMUserクラスに変換
		
		MUser complete = modelMapper.map(form,MUser.class); 
		
		//出勤登録
		userService. signup(complete);
		
		//完了画面に遷移
		//完了画面作る
		return "/complete";
		
	}
}
	

















