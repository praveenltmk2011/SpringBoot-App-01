package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {				//HIS-122

	@GetMapping("/greet")
	public String displayGreet(Model model) {
		String msgTxt = "Good Afternoon ...!!!";
		model.addAttribute("msg", msgTxt);
		return "index";
	}
}
