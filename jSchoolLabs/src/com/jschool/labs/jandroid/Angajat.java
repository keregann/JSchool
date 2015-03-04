package com.jschool.labs.jandroid;

public class Angajat {
	private String nume;
	private int virsta;
	
	public String getNume() { // adauga getter si setter pu fiecare field
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVirsta() {
		return virsta;
	}
	public void setVirsta(int virsta) {
		this.virsta = virsta;
	}
	
	
	
	

	// de creat clasele dupa exemplul cu am creat Director
	/*Director:
		1. Cota parte - 

		Contabil:
		1. Categorie - 1,2 sau 3 - valoare fixa		, (enum de string sau char I, II, si III cel mai bine sau chiar numere)

		Sofer
		1. Tip permis: A,B,C,D,E,F,G - Lista(Enum tipuri permis)		// iarasi enum de charuri

		Medic
		1. Specialitatea		// string

		Programator:
		1. Limbaje - Lista cu limbaje cunostcute (Lista string)		// List<String> limbaje;
		*/
}
