package com.example.controller;

import org.springframework.stereotype. Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MypageController {
	
	
//	@RequestMapping(value="/searchList",method = RequestMethod.POST)
//	public String login(Model model,@ModelAttribute Employeelogin employeelogin){
//		model.addAttribute("user_id", employeelogin.getUser_id());
//		model.addAttribute("name",employeelogin.getName());
//		
//	}
	
	@GetMapping("/Mypage1")
	public String Mypage() {

		return "/Mypage1";
	}



	@GetMapping("/edit")//編集
	public String Edit() {


		return "/edit";
	}
	
	
	@GetMapping("/attendance")//出勤
	public String Attendance() {


		return "/attendance";
	}
	
	@GetMapping("/clock_out")//退勤
	public String Clock_out() {


		return "/clock_out";
	}
	
	@GetMapping("/attendance/attendance_index")//勤怠一覧
	public String Attendance_index() {


		return "/attendance/attendance_index";
	}
	
	



}
