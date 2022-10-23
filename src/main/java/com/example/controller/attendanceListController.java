package com.example.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/attendance")
public class attendanceListController extends HttpServlet{
	
	@GetMapping("/index")
	public String getAttendanceList(Model model){
		
		
		
		
		return "attendance/attendance_index";
	}
}
