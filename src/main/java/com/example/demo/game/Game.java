package com.example.demo.game;

public class Game {
	
	// ****************************************************** Attribute **********************************************************************
		
	private int wortLaenge;
	
	private String sprache;
	
	private String eingabeWort;
	
	private String loesungWort;
	
	private boolean erfolg;
	
	private int versucheMax;
	
	private int versuche;
	
	private Spielfeld spielfeld;
	
	
	// ***************************************************** Konstruktoren *********************************************************************
	
	
	public Game(){		
	}
	
	public Game(String sprache, int wortLaenge, String loesungWort) {		
		this.sprache = sprache;
		this.wortLaenge = wortLaenge;
		this.versucheMax = wortLaenge;
		this.spielfeld = new Spielfeld(versucheMax, wortLaenge);
	}

	
	// ***************************************************** Getter/Setter *********************************************************************

	
	public int getWortLaenge() {
		return wortLaenge;
	}

	public void setWortLaenge(int wortLaenge) {
		this.wortLaenge = wortLaenge;
	}

	public String getSprache() {
		return sprache;
	}

	public void setSprache(String sprache) {
		this.sprache = sprache;
	}

	public String getEingabeWort() {
		return eingabeWort;
	}

	public void setEingabeWort(String eingabeWort) {
		this.eingabeWort = eingabeWort;
	}

	public String getLoesungWort() {
		return loesungWort;
	}

	public void setLoesungWort(String loesungWort) {
		this.loesungWort = loesungWort;
	}

	public boolean isErfolg() {
		return erfolg;
	}

	public void setErfolg(boolean erfolg) {
		this.erfolg = erfolg;
	}

	public int getVersucheMax() {
		return versucheMax;
	}

	public void setVersucheMax(int versucheMax) {
		this.versucheMax = versucheMax;
	}

	public int getVersuche() {
		return versuche;
	}

	public void setVersuche(int versuche) {
		this.versuche = versuche;
	}

	public Spielfeld getSpielfeld() {
		return spielfeld;
	}

	public void setSpielfeld(Spielfeld spielfeld) {
		this.spielfeld = spielfeld;
	}
	
	
	// ***************************************************** Methoden *********************************************************************
	
	
	public void pruefeEingabeWort() {
		
	}
	
	
	
	
}
