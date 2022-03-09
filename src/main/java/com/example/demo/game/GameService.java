package com.example.demo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

	private Game game;
	
	@Autowired
	public GameService() {
	}
	
	public void starteSpiel(String sprache, int wortLaenge, String loesungWort) {	

		this.game = new Game(sprache, wortLaenge, loesungWort);
		
	}

	public Game getGame() {
		return game;
	}
	
	
	
}
