package com.example.demo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = {"/game", "/spiel"})
public class GameController {
	
	private final GameService gameService;
	
	@Autowired
	public GameController(GameService gameService) {
		this.gameService = gameService;		
	}
	
	@GetMapping
	public String zeigeGame(Model model){
		
	
		return "game";
	}
	
//	@GetMapping
//	public String zeigeGame(Model model, @RequestParam(required = false) String buchstabe00,
//										@RequestParam(required = false) String buchstabe01,
//										@RequestParam(required = false) String buchstabe02,
//										@RequestParam(required = false) String buchstabe03,
//										@RequestParam(required = false) String buchstabe04) {
//		
//		model.addAttribute("buchstabe00", buchstabe00);
//		model.addAttribute("buchstabe01", buchstabe01);
//		model.addAttribute("buchstabe02", buchstabe02);
//		model.addAttribute("buchstabe03", buchstabe03);
//		model.addAttribute("buchstabe04", buchstabe04);
//	
//		return "game";
//	}
	
	@PostMapping
	public String eingabe(Model model) {
		
		return "game";
	}

}
