package com.example.controller;

import java.util.Date;
import java. util.Locale;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.form.SignupForm;
import com.example.form.UserDetailForm;

//import lombok.extern.slf4j.Slf4j; 


@Controller
@RequestMapping("/user")
//@Slf4j
public class SignupController{
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private  ModelMapper modelMapper;
	
	//退勤登録画面を表示
	@GetMapping("/detail/{userId}/{startDate}") 
	public String getUser(UserDetailForm form, Model model,
	@PathVariable("startDate") Date stratDate,
	@PathVariable("userld") Integer userld) {
		model.addAttribute("userId",5);
		return "/clock_out";
	}


	
	/**退勤登録処理*/
	@PostMapping("/complete") 
	public String postSignup(Model model,Locale locale,@ModelAttribute SignupForm form, BindingResult bindingResult)
		 { 
		
		System.out.println(form.getStartTime());
		
		//formをMUserクラスに変換
		
		MUser complete = modelMapper.map(form,MUser.class); 
		
		//退勤登録
		userService. signup(complete);
		
		//完了画面に遷移
		return "/complete";
		
	}
}
	

















