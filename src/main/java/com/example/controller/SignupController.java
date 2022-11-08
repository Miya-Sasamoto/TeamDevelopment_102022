package com.example.controller;

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
	@GetMapping("/detail/{attendanceId}") 
	public String getUser(SignupForm form, Model model,
	@PathVariable("attendanceId") Integer attendanceId) {
		
		model.addAttribute("attendanceId", attendanceId);
		
		MUser user= userService.findOne(attendanceId); 
		
		//MUserをformに変換
		form= modelMapper.map(user,SignupForm.class);
		
		//Modelに登録
		model.addAttribute("userDetailForm",form);
		
		
		return "/clock_out";
	}


	
	/**退勤登録処理*/
	@PostMapping("/complete") 
	public String postSignup(Model model,Locale locale,@ModelAttribute SignupForm form, BindingResult bindingResult)
		 { 
		
		//System.out.println(form.getStartTime());
		
		//formをMUserクラスに変換
		
		MUser complete = modelMapper.map(form,MUser.class); 
		
		complete.setAttendanceId(9);
		//退勤登録
		userService.updateOne(complete);
		
		//完了画面に遷移
		return "/complete";
		
	}
}