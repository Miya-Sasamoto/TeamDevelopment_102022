package com.example.controller;

import java. util.Locale;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.form.SignupForm;

//import lombok.extern.slf4j.Slf4j; 


@Controller
@RequestMapping("/user")
//@Slf4j
public class SignupController{
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private  ModelMapper modelMapper;
	
	
	
	/**出勤登録画面を表示*/
	@GetMapping("/signup") 
	public String getSignup(Model model, Locale locale) { 
		model.addAttribute("userId",6);
//		model.addAttribute("SignupForm",new SignupForm());
		return "/attendance";
	} 
	
	
	/**出勤登録処理*/
	@PostMapping("/complete") 
	public String postSignup(Model model,Locale locale,@ModelAttribute @Validated SignupForm form,BindingResult bindingResult){ 
//		if(bindingResult.hasErrors()) {
//			// 入力チェックエラーの場合
//		      List<String> errorList = new ArrayList<String>();
//		      
//		      for (ObjectError error : bindingResult.getAllErrors()) {
//		    	  errorList.add(error.getDefaultMessage());
//		      	}
//		      model.addAttribute("SignupForm",form);
//		      model.addAttribute("validationError", errorList);
//			return "/attendance";
//		}
		System.out.println(form.getStartTime());
		
		//formをMUserクラスに変換
		
		MUser complete = modelMapper.map(form,MUser.class); 
		
		//出勤登録
		userService. signup(complete);
		
		//完了画面に遷移
		//完了画面作る
		return "/complete";
		
	}
}
	

