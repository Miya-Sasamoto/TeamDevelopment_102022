package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.application.service.NewRegisterService;



@Controller
public class EditController{
    
 @Autowired
 private NewRegisterService service;
 
 @GetMapping("/Edit")
 public String getNewRegister() {
     // hello.htmlに画面遷移 
     return "Edit";
  }
 
 @PostMapping("/Edit")
 public String postRequest(@RequestParam("textI") String str, Model model) {
      
 // 画面から受け取った文字列をModelに登録 
     model.addAttribute("sample", str);
 // response.htmlに画面遷移 
     return "Edit/response";
  }
 
 @PostMapping("/Edit/db")
 public String postDbRequest(@RequestParam("text2")String id,Model model){
     //1件検索    
     Employee employee=service.getEmployee(id);
     //検索結果をModelに登録
     model.addAttribute("employee",employee);
     //db.htmlに画面遷移
     return"Edit/db";}

}