package com.example.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
//@RequestMapping("login1")
public class LoginController {
	
	/**ログイン画面を表示*/
	@GetMapping("/login1")
	public String Login() {

		return "loginmypage/login1";
	}
	
	
	//ログイン成功時のマイページ画面への遷移
   /* @PostMapping
      String postLogin() {
        return "redirect:/Mypage1";
    }*/

}