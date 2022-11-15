package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java. util.Locale;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.form.SignupForm;

//import lombok.extern.slf4j.Slf4j; 


@Controller
@RequestMapping("/user")
//@Slf4j
public class Clock_outController{
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private  ModelMapper modelMapper;
	
	
	//退勤登録画面を表示
	@GetMapping("/detail/{attendanceId}") 
	public String getUser(Model model, @ModelAttribute SignupForm form, 
	@PathVariable("attendanceId") Integer attendanceId) {
		
		
//		model.addAttribute("signupForm", form);
		
		MUser user= userService.findOne(attendanceId); 
		
		//MUserをformに変換
		form= modelMapper.map(user,SignupForm.class);
		
		//Modelに登録
		model.addAttribute("signupForm",new SignupForm());
		
		
		
		return "/clock_out";
	}


	
	/**退勤登録処理*/
	@PostMapping("/complete") 
	public String postSignup(Model model,Locale locale,@ModelAttribute @Validated SignupForm form, BindingResult bindingResult) {
	if(bindingResult.hasErrors()) {
		// 入力チェックエラーの場合
	      List<String> errorList = new ArrayList<String>();
	      
	      for (ObjectError error : bindingResult.getAllErrors()) {
	    	  errorList.add(error.getDefaultMessage());
	    	  
	      	}

		return "/clock_out";
	}
		
//		System.out.println(form.getStartTime());
		
		//formをMUserクラスに変換
		
		MUser complete = modelMapper.map(form,MUser.class); 
		
		complete.setAttendanceId(50);
		//退勤登録
		userService.updateOne(complete);
		
		//完了画面に遷移
		return "/complete";
		
	}
	
	 @RequestMapping("/top")
	    public String home() {
	        return "/Mypage1";
	    }
}