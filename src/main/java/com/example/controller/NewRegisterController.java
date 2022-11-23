package com.example.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MasterUser;
import com.example.domain.user.service.NewRegisterService;
import com.example.form.NewRegisterForm;

//import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
//@Slf4j

public class NewRegisterController{


	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private NewRegisterService service;
	@Autowired
	PasswordEncoder passwordEncoder;

    
	@GetMapping("/NewRegister")
	public String getNewRegister(Model model) {
		model.addAttribute("newRegisterForm",new NewRegisterForm());
		// hello.htmlに画面遷移 
		return "NewRegister";
	}

	@PostMapping("/NewRegister")
	public String postNewRegister(@ModelAttribute NewRegisterForm form,Model model){
		MasterUser masterUser=modelMapper.map(form,MasterUser.class);

		//パスワードをハッシュ化して登録する
		//newRegisterForm.setPassWord(passwordEncoder.encode(newRegisterForm.getPassWord())); 
		//BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		masterUser .setName(form.getName());
		masterUser .setNameKana(form.getNameKana());
		masterUser .setMailAddress(form.getMailAddress());
		//newRegisterForm .setPassWord(form.getPassWord());
		masterUser .setPassWord(passwordEncoder.encode(form.getPassWord()));
		service.addOne(masterUser);
		return "/CompleteNewRegister";
	}   

}


