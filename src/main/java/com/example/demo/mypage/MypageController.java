package com.example.demo.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MypageController {
	
	@GetMapping("/Mypage1")
	public String getMypage() {
		return "Mypage1";
	
	}


}
