package com.example.controller;

import org.springframework.stereotype. Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MypageController {


	@GetMapping("/edit")//編集
	public String Edit() {


		return "/edit";
	}
	
	
	@GetMapping("/attendance")//出勤
	public String Attendance() {


		return "/attendance";
	}
	
	@GetMapping("/complete")//退勤
	public String Complete() {


		return "/complete";
	}
	
	@GetMapping("/attendance_index")//勤怠一覧
	public String Attendance_index() {


		return "/attendance_index";
	}
	
	



}
