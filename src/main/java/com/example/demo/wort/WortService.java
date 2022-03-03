package com.example.demo.wort;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WortService {
	
	private final WortRepository wortRepository; 

	@Autowired
	public WortService(WortRepository wortRepository) {
		this.wortRepository = wortRepository;
	}
	
	
	// Methode zum Anzeigen aller Wörter
	public List<Wort> findeAlleWoerter(){
		return wortRepository.findAll();
	}
	
	
}
