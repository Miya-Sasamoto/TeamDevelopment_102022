package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.model.MAttendanceList;
import com.example.domain.service.AttendanceService;
import com.example.form.AttendanceListForm;
import com.example.form.AttendanceUpdate;

@Controller
@RequestMapping("/attendance")
public class AttendanceCorrectionController {
	
	@Autowired
	private AttendanceService attendanceService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/edit/{attendanceId:.+}")
	public String getAttendance(@ModelAttribute AttendanceListForm form, Model model,@PathVariable("attendanceId") Integer attendanceId){
		MAttendanceList attendanceCorrection = attendanceService.getAttendanceOne(attendanceId);
		
		form = modelMapper.map(attendanceCorrection, AttendanceListForm.class);
		
		model.addAttribute("attendanceUpdateForm",form);
		
		//model.addAttribute("attendanceCorrection",attendanceCorrection);
	
		return "attendance/attendance_edit";
	}
	
	@PostMapping(value = "/edit" , params = "update")
	public String updateAttendance(@ModelAttribute AttendanceUpdate form, Model model) {
		
		attendanceService.updateAttendanceOne(
				form.getAttendanceId(),
				form.getStartDate(),
				form.getStartTime(),
				form.getEndDate(),
				form.getEndTime(),
				form.getBreakTime(),
				form.getReasonForRevision()
				);
		
		
		model.addAttribute("attendanceUpdateForm",form);
		
//		return "redirect:list";
		return "redirect:attendanceCorrectionDone";
	}
	
	@GetMapping("/attendanceCorrectionDone")
	public String getAttendanceDone(){
		return "attendance/attendanceCorrectionDone";
	}

}

	
