package com.example.demo.menue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenueController {

	@GetMapping
	public String zeigeMenue(Model model) {
		
		return "home";
	}
	
}
