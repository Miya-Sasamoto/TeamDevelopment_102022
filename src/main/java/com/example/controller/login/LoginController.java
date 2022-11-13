package com.example.controller.login;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
//@RequestMapping("login1")
public class LoginController {
	
	/**ログイン画面を表示*/
	@GetMapping("/login1")
	public String Login() {
		
	    String password = "123456";
	    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String hashedPassword = passwordEncoder.encode(password);
	    System.out.println("hasyyuka");
	    System.out.println(hashedPassword);


		return  "/loginmypage/login1";
	}
	
	@GetMapping("/shinki")
	public String Shinki() {

		return "/shinki";
	}

	
//	
	
	
//	//ログイン成功時のマイページ画面への遷移
//   @PostMapping("/login1")
//   public String postLogin() {
//        return "redirect:/loginmypage/Mypage1";
//   

}