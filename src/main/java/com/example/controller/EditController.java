package com.example.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.user.model.MasterUser;
import com.example.domain.user.service.EditService;
import com.example.form.EditForm;

@Controller
public class  EditController{

	@Autowired
	private EditService editService;

	@Autowired
	private ModelMapper modelMapper;

	/**編集削除画面*/
	@GetMapping("/edit/{userId:.+}")
	public String show(@ModelAttribute EditForm form,Model model,
			@PathVariable("userId") Integer userId){
		
		//ユーザーを一件取得
		MasterUser masterUser = editService.getUserOne(userId);
		masterUser.setPassWord(null);

		//MasterUserをformに変換
		form = modelMapper.map(masterUser,EditForm.class);
		model.addAttribute("editForm",form);
 
		System.out.println(form);
		//編集削除画面にリダイレクト
		return"/edit";
	}

	/**編集処理*/
	@PostMapping("/edit/complete")
	public String editUserOne(@ModelAttribute EditForm form,Model model){
		
		System.out.println(form.getUserId());
		System.out.println(form.getName());
		System.out.println(form.getNameKana());
		System.out.println(form.getMailAddress());
		System.out.println(form.getPassWord());
		
		//		//ユーザーを更新
//		editService.editUserOne(form.getUserId(),
//				form.getName(),
//				form.getNameKana(),
//				form.getMailAddress(),
//				form.getPassWord());

		MasterUser complete = modelMapper.map(form,MasterUser.class);
//		form = modelMapper.map(masterUser,EditForm.class);
		model.addAttribute("editForm",form);
		
//		editService.editUserOne(complete);
		
		//ユーザー一覧画面にリダイレクト
		return "/complete";
//		return"/editcomplete";
	}


	/**ユーザー削除処理*/
//	@PostMapping(value="/delete",params="delete")
//	public String deleteUser(EditForm form,Model model){
//		//ユーザーを削除
//		editService.deleteUserOne(form.getUserId());
//
//		//		model.addAttribute("EditForm",form);
//		//ユーザー一覧画面にリダイレクト
//		return"deletecomplete";
//	}

}