package com.example.demo.game;

import java.lang.reflect.Array;

public class Spielfeld {
	
	private int anzahlZeilen;
	
	private int anzahlSpalten;
	
	private Feld[][] felder;
	
	
	public Spielfeld(int zeilen, int spalten) {
		
		this.anzahlZeilen = zeilen;
		this.anzahlSpalten = spalten;
		this.felder = new Feld[zeilen][spalten];
	}
	
	
}
