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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.SasakiService;
import com.example.form.Form2;


@Controller
@RequestMapping("/user")
public class SignupController{

	@Autowired
	private SasakiService sasakiService;

	@Autowired
	private  ModelMapper modelMapper;

	/**出勤登録画面を表示*/
	@GetMapping("/signup") 
	public String getSignup(Model model, Locale locale) { 
		model.addAttribute("userId",1);
		model.addAttribute("form2",new Form2());
		return "attendance";
	} 

	/**出勤登録処理*/
	@PostMapping("/signup/complete") 
	public String Signup(Model model,Locale locale,@ModelAttribute @Validated Form2 form,BindingResult result){ 
		if(result.hasErrors()) {
			// 入力チェックエラーの場合
			List<String> errorList = new ArrayList<String>();

			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());

			}
//			form.getuserId()
			model.addAttribute("userId",1);
			model.addAttribute("form2",new Form2());
			return "/attendance";
		}

		System.out.println(form.getStartTime()+":00");
		form.setStartTime(form.getStartTime()+":00");

		//formをMUserクラスに変換

		MUser complete = modelMapper.map(form,MUser.class); 

		//出勤登録
		sasakiService. signup(complete);

		//完了画面に遷移
		return "/complete";
	} 
}