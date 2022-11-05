package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.application.service.NewRegisterService;
import com.example.form.NewRegisterForm;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
@Slf4j

public class NewRegisterController{

    @Autowired
    private NewRegisterService service;

    @GetMapping("/NewRegister")
    public String getNewRegister() {
        // hello.htmlに画面遷移 
        return "NewRegister";
    }

    @PostMapping("/NewRegister")
    public String postNewRegister(@ModelAttribute NewRegisterForm form,Model model){
        log.info(form.toString());

        NewRegisterForm newRegisterForm = new NewRegisterForm();
        newRegisterForm .setName(form.getName());
        newRegisterForm .setName_kana(form.getName_kana());
        newRegisterForm .setMail_address(form.getMail_address());
        newRegisterForm .setPassword(form.getPassword());
        service.insert(newRegisterForm);

        return "redirect:/CompleteNewRegister";
    }
}
