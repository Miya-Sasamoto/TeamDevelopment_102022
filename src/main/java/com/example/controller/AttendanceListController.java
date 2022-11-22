package com.example.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.model.MAttendanceList;
import com.example.domain.service.AttendanceService;
import com.example.form.AttendanceListForm;

@Controller
@RequestMapping("/attendance")
public class AttendanceListController{

	//	出退勤情報サービス
	@Autowired
	private AttendanceService attendanceService;

	@Autowired
	private ModelMapper modelMapper;

	///　出退勤情報一覧画面の表示
	@GetMapping("/list")
	public String getAttendanceList(@ModelAttribute AttendanceListForm form, Model model){
		MAttendanceList attendance = modelMapper.map(form, MAttendanceList.class);

		List<MAttendanceList> attendanceList = attendanceService.getAttendanceList(attendance);

		model.addAttribute("attendanceList",attendanceList);

		return "attendance/attendance_index";
	}
}
