package com.example.demo.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
		this.loesungWort = loesungWort;
		this.wortLaenge = wortLaenge;
		this.versucheMax = wortLaenge;
		this.versuche = 0;
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
	
	public void eingabeWortSpeichern(String eingabe) {
		this.eingabeWort = eingabe;
//		// Fülle Felder mit EingabeWort
//		for(char c : )
//		spielfeld.getFelderArray()[this.versuche][stelleEingabe].setBuchstabe(eingabeChar);
		
	}
	
	
	public void pruefeEingabeWort() {
		
		char[] eingabeWortArray = eingabeWort.toCharArray();
		char[] loesungWortArray = loesungWort.toCharArray();
		
		ArrayList<Character> charListe = new ArrayList<Character>();
		for(char c : loesungWortArray) {
			charListe.add(c);
		}
		
		
		// Fall: richtige Lösung
		if(eingabeWort == loesungWort) {			
			
			int i = 0;
			for(char eingabeChar : eingabeWortArray) {
				
			// Setze Buchstaben und Farbe in Feld
			spielfeld.getFelderArray()[this.versuche][i].setBuchstabe(eingabeChar);
			spielfeld.getFelderArray()[this.versuche][i].setFarbe("green");
			
			i++;
			}
			
			erfolg = true;
		}//ENDE richtige Lösung
		
		// Fall: falsche Lösung
		else{	
			
			int stelleEingabe = 0;
			// Iteriere über Buchstaben der Eingabe
			for(char eingabeChar : eingabeWortArray) {
				
				// Setze Buchstaben in Feld
				spielfeld.getFelderArray()[this.versuche][stelleEingabe].setBuchstabe(eingabeChar);
				
				// Prüfe auf 'Treffer' und setze entsprechende Farbe
				
				// Fall: Buchstabe nicht in Lösung vorhanden
				if(!charListe.contains(eingabeChar))
				{
					spielfeld.getFelderArray()[this.versuche][stelleEingabe].setFarbe("gray");
				}
				
				// Fall: Buchstabe in Lösung vorhanden			
				else {
					// Fall: Buchstabe an richtiger Stelle
					if(eingabeChar == loesungWortArray[stelleEingabe]) {
						spielfeld.getFelderArray()[this.versuche][stelleEingabe].setFarbe("green");
//						// Bei mehrfachem Vorkommen des gleich Buchstaben -> Prüfe auf weitere Vorkommen
//						loesungWortArray[stelleEingabe] = ' ';
					}
					// Fall: Buchstabe an falscher Stelle
					else {
						spielfeld.getFelderArray()[this.versuche][stelleEingabe].setFarbe("orange");
//						// Bei mehrfachem Vorkommen des gleich Buchstaben -> Prüfe auf weitere Vorkommen
//						loesungWortArray[stelleEingabe] = ' ';
					}
					
				}
					
					
//				// Fall: Buchstabe in Lösung vorhanden
//				else{
//					int stelleLoesung = 0;
//					// Iteriere über Buchstaben der Lösung
//					for(char loesungChar : loesungWortArray) {
//						
//						if(eingabeChar == loesungChar) {
//							spielfeld.getFelder()[this.versuche][stelleEingabe].setFarbe("orange");
//							
//							if(stelleEingabe == stelleLoesung) {
//								spielfeld.getFelder()[this.versuche][stelleEingabe].setFarbe("green");
//								break;
//							}
//							
//						}
//					}					
//					
//					if(contains(loesungWortArray,'c')) {//						
//					}
					
				
				
				
			}
			erfolg = false;
		}//ENDE flasche Lösung
		
		versuche++;
	}//ENDE pruefeEingabe()	
	
	
}//ENDE Game
