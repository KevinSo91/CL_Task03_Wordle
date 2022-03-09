package com.example.demo.game;

import java.lang.reflect.Array;

public class Spielfeld {
	
	private int anzahlZeilen;
	
	private int anzahlSpalten;
	
	private Feld[][] felderArray;
	
	
	public Spielfeld(int zeilen, int spalten) {
		
		this.anzahlZeilen = zeilen;
		this.anzahlSpalten = spalten;
		this.felderArray = new Feld[zeilen][spalten];
	}


	public int getAnzahlZeilen() {
		return anzahlZeilen;
	}


	public void setAnzahlZeilen(int anzahlZeilen) {
		this.anzahlZeilen = anzahlZeilen;
	}


	public int getAnzahlSpalten() {
		return anzahlSpalten;
	}


	public void setAnzahlSpalten(int anzahlSpalten) {
		this.anzahlSpalten = anzahlSpalten;
	}


	public Feld[][] getFelderArray() {
		return felderArray;
	}


	public void setFelder(Feld[][] felder) {
		this.felderArray = felder;
	}
	
	
}
