package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.service.AttendanceService;

@Controller
@RequestMapping("/attendance")
public class AttendanceCorrectionController {
	
	@Autowired
	private AttendanceService attendanceService;
	
	@Autowired
	private ModelMapper mapper;
	
//	@GetMapping("/edit/{attendanceId:.+}")
//	public String getAttendance(@ModelAttribute AttendanceListForm form, Model model,@PathVariable("attendanceId") String attendanceId){
//		MAttendance attendance = mapper.map(form, MAttendance.class);
//		
//		
//		
//		List<MAttendance> attendanceIndex = attendanceService.getAttendanceList(attendance);
//		
//		model.addAttribute("attendanceIndex",attendanceIndex);
//	
//		return "attendance/attendance_edit";
//	}

}

//@GetMapping("/detail/{userId:.+}")
//public String getUser(UserDetailForm form, Model model,
//		@PathVariable("userId") String userId) {
//	
//	MUser user = userService.getUserOne(userId);
//	user.setPassword(null);
//	
//	form = modelMapper.map(user, UserDetailForm.class);
//	form.setSalaryList(user.getSalaryList());
//	
//	model.addAttribute("userDetailForm",form);
//	
//	return "user/detail";
//}
//
//@PostMapping(value = "/detail", params = "update")
//public String updateUser(UserDetailForm form, Model model) {
//	
//	try {
//		userService.updateUserOne(form.getUserId(),
//				form.getPassword(),
//				form.getUserName());
//	}catch(Exception e) {
//	  //log.error("ユーザー更新でエラー",e);
//	}
//
//	return "redirect:/user/list";
//}
