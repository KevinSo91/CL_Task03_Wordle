package com.example.demo.wort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/words", "woerter"})
public class WortController {
	
	private final WortService wortService;
	
	@Autowired
	public WortController(WortService wortService) {
		this.wortService = wortService;
	}
	
	
	
	@GetMapping(value = {"/all", "alle"})
	public String zeigeWoerter(Model woerterModel){
		woerterModel.addAttribute("woerterListe", wortService.findeAlleWoerter());
		return "woerter";		
	}
	

}
