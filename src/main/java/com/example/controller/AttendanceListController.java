package com.example.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.AttendanceService;
import com.example.domain.user.model.MAttendance;
import com.example.form.AttendanceListForm;

@Controller
@RequestMapping("/attendance")
public class AttendanceListController{
	
	@Autowired
	private AttendanceService attendanceService;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping("/list")
	public String getAttendanceIndex(@ModelAttribute AttendanceListForm form, Model model){
		MAttendance attendance = mapper.map(form, MAttendance.class);
		
		
		
		List<MAttendance> attendanceIndex = attendanceService.getAttendanceIndex(attendance);
		
		model.addAttribute("attendanceIndex",attendanceIndex);
	
		return "attendance/attendance_index";
	}
}
