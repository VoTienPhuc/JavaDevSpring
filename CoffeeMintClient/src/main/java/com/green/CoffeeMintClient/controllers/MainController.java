package com.green.CoffeeMintClient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.CoffeeMintClient.dao.UserService;
import com.green.CoffeeMintClient.models.User;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String showLoginView() {
		return "login";
	}
	
	@GetMapping("/login2")
	public String showLoginView2(Model model) {	
		User user=new User();
		model.addAttribute("user",user);
		return "login2";
	}
	
	@PostMapping("/login2")
	public String doLogin2(@ModelAttribute("user")User formUser) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		User dbUser=userService.getUserByUserName(formUser.getUsername());
		if(dbUser!=null && encoder.matches(dbUser.getPassword(),formUser.getPassword()))
			return "redirect:/";
		else
			return "login2";
	}
	
	@GetMapping("/product")
	public String showProductView() {
		return "product";
	}
}
