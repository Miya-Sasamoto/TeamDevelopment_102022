package com.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")

public class CompleteNewRegisterController{

    
    @GetMapping("/CompleteNewRegister")
    
    public String getCompleteNewRegister(){
        
     
        return "user/CompleteNewRegister";
   }
    @PostMapping("/user/CompleteNewRegister")
    public String postCompleteNewRegister(){
        return "redirect:/CompleteNewRegister";
    
    }
    
    }


   