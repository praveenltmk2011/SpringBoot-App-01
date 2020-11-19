package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String showWelcome(Model model){
		model.addAttribute("msg", "Welcome to Ashok IT ...!!!");
		return "index";
	}
}
