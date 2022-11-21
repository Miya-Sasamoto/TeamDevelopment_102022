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

import com.example.domain.user.service.EditService;
import com.example.form.EditForm;

@Controller
@RequestMapping("/user")
public class  EditController{

	@Autowired
	private EditService editService;

	@Autowired
	private ModelMapper modelMapper;

	/**編集削除画面*/
	@GetMapping("/edit/{userid}")
	public String show(@ModelAttribute EditForm form,Model model, @PathVariable("userid") Integer userid){

		EditForm user = editService.findOne(userid);
		form = modelMapper.map(user,EditForm.class);
        model.addAttribute("editForm",form);
		//ユーザー一覧画面にリダイレクト
		return"edit";
	}

    /**編集処理*/
	@PostMapping(value="/edit",params="complete")
	public String updateUser(@ModelAttribute EditForm form,Model model){
		//ユーザーを更新
		editService.updateOne(form.getUserId(),
				form.getName(),
				form.getNameKana(),
				form.getMailAddress(),
				form.getPassWord());
		
		model.addAttribute("EditForm",form);
		//ユーザー一覧画面にリダイレクト
		return"EditComplete";
	}
	

	/**ユーザー削除処理*/
	@PostMapping(value="/delete",params="delete")
	public String deleteUser(@ModelAttribute EditForm form,Model model){
		//ユーザーを削除
		editService.deleteOne(form.getUserId());
		
		model.addAttribute("EditForm",form);
		//ユーザー一覧画面にリダイレクト
		return"DeleteComplete";
	}

}


