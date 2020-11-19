package com.ashokit.controller;


public class WelcomeController {


	public String showWelcome(Model model){
		model.addAttribute("msg", "Welcome to Ashok IT ...!!!");
		return "index";
	}
}
