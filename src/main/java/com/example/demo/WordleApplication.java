package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.game.GameService;

@SpringBootApplication
public class WordleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(WordleApplication.class, args);
		
		//****************************** TEST ***********************************
		System.out.print("test:\n");
		
		GameService gameservice = new GameService();
		gameservice.starteSpiel("deutsch", 4, "Hund");
		gameservice.getGame().setEingabeWort("Hand");
		gameservice.getGame().pruefeEingabeWort();
		
		//**************************** ENDE TEST *********************************
	}

}
