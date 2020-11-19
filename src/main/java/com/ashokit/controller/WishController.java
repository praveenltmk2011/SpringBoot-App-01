package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishController {

	@GetMapping("/wish")				//HIS-134
	public String wish(Model model) {
		String wish = "Good Afternoon ";
		model.addAttribute("msg", wish);
		return "index";
	}
}
