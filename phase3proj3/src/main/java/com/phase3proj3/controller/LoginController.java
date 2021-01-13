package com.phase3proj3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phase3proj3.model.User;
import com.phase3proj3.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService logserv;

	@GetMapping("/Login")
	public String login() {
		return "Login";
	}

	@PostMapping("/Login")
	public String login(@RequestParam("uname") String uname, @RequestParam("pass") String pass, Model model) {
		
		model.addAttribute(User.builder().password(pass).username(uname).build());
		
		if (logserv.login(uname, pass)) {
			return "LoginSuccess";
		}

		return "LoginFailure";

	}

}
