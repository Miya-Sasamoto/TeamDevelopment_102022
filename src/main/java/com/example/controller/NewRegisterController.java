package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.service.NewRegisterService;
import com.example.form.NewRegisterForm;

//import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
//@Slf4j

public class NewRegisterController{

    
    @Autowired
    private NewRegisterService service;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Bean    
    @GetMapping("/NewRegister")
    public String getNewRegister(Model model) {
        model.addAttribute("newRegisterForm",new NewRegisterForm());
        // hello.htmlに画面遷移 
        return "NewRegister";
    }

    @PostMapping("/NewRegister")
    public String postNewRegister(@ModelAttribute NewRegisterForm form,Model model){
        //パスワードをハッシュ化して登録する
        //newRegisterForm.setPassWord(passwordEncoder.encode(newRegisterForm.getPassWord())); 
        //BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
        NewRegisterForm newRegisterForm = new NewRegisterForm();
        newRegisterForm .setName(form.getName());
        newRegisterForm .setNameKana(form.getNameKana());
        newRegisterForm .setMailAddress(form.getMailAddress());
        //newRegisterForm .setPassWord(form.getPassWord());
        newRegisterForm .setPassWord(passwordEncoder.encode(form.getPassWord()));
        service.add(newRegisterForm);
        return "/CompleteNewRegister";
    }   

}


