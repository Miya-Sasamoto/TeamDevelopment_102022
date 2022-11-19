package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.service.EditService;
import com.example.form.EditForm;

@Controller
@RequestMapping("/user/edit")
public class  EditController{
@Autowired
	private EditService editService;


/**編集削除画面*/
@PostMapping(value="/user/edit",params="update")
public String updateUser(EditForm form,Model model){
	//ユーザーを更新
	editService.updateOne(form.getUserId(),
			form.getPassWord(),form.getName());
	//ユーザー一覧画面にリダイレクト
	return"redirect:/user/EditComplete";
}

/**ユーザー削除処理*/
@PostMapping(value="/edit",params="delete")
public String deleteUser(EditForm form,Model model){
	//ユーザーを削除
	editService.deleteOne(form.getUserId());
	//ユーザー一覧画面にリダイレクト
	return"redirect:/user/DeleteComplete";
	}

}
	

