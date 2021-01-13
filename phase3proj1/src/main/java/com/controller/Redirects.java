package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping("/main")
public class Redirects {

	@Autowired
	private UserService userservice;

	@PostMapping("/edit")
	public String editUser(@RequestParam("userID") int userID, @RequestParam("uname") String uname,
			@RequestParam("pass") String pass, @RequestParam("city") String city, @RequestParam("email") String email) {
		userservice.userUpdate(new User(userID, uname, pass, city, email));
		return "redirect:/main/usersearch";
	}

	@GetMapping("/edit")
	public String editUser(@RequestParam("userID") Integer userID, Model model) {
		User u = userservice.userSearch(userID);

		if (u != null) {
			model.addAttribute("user", u);
			return "edit";
		}
		model.addAttribute("userID", userID);
		return "Searcherror";

	}

	@PostMapping("/usersearch")
	public String loginValid(@RequestParam("userID") Integer userID, Model model) {

		User u = userservice.userSearch(userID);

		if (u != null) {
			model.addAttribute("user", u);
			return "success";
		}
		model.addAttribute("userID", userID);
		return "error";

	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration() {
		return "registration";
	}

	@PostMapping("/registration")
	public String registrationValid(@RequestParam("uname") String uname, @RequestParam("pass") String pass,
			Model model) {
		model.addAttribute("uname", uname);
		if (userservice.registration(uname, pass)) {
			return "regis_pass";
		} else {
			return "regis_error";
		}
	}

	@RequestMapping(value = "/usersearch", method = RequestMethod.GET)
	public String usersearch() {
		return "usersearch";
	}

	@GetMapping("/loadusers")
	@ResponseBody
	public List<User> loadUsers() {
		return userservice.getNames();
	}

}
