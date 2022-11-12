package com.example.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.service.impl.NewRegisterService;
import com.example.form.NewRegisterForm;

//import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
//@Slf4j

public class NewRegisterController{

    @Autowired
    private NewRegisterService service;
    
//   @Autowired
    private  ModelMapper modelMapper;
    
    
    
    
     @GetMapping("/NewRegister")
    public String getNewRegister(Model model) {
        // hello.htmlに画面遷移 
        return "NewRegister";
         }
     
     @PostMapping("/NewRegister")
    public String postNewRegister(@ModelAttribute NewRegisterForm form,Model model){
        NewRegisterForm newRegisterForm = new NewRegisterForm();
        newRegisterForm .setName(form.getName());
        newRegisterForm .setNameKana(form.getNameKana());
        newRegisterForm .setMailAddress(form.getMailAddress());
        newRegisterForm .setPassWord(form.getPassWord());
        service.insert(newRegisterForm);
        return "/CompleteNewRegister";
    }   
     
     
//      @PostMapping("/CompleteNewRegister")    
//        public String postCompleteNewRegister(Model model) {
//        return "/CompleteNewRegister";
//        
//        }
   
}
