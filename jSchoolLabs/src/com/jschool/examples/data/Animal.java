package com.jschool.examples.data;

public class Animal {
	
	private int virsta;		// fielduri private, nici o alta clasa nu are acces la ele
	private String nume;
	public boolean exista; 
			
	// constructorii pot fi privati sau publici si servers pentru initializarea fieldurilor la crearea obiectului
	// this - e cuvint cheie care se refera la obiectul curent in care ne aflam
	public Animal() {		// contructorul default - fara parametri
		this.virsta = 1;	// se refera la fiedul virsta din clasa curenta		
		this.nume = "Bim";
	}

	public Animal(String nume) {	// constr cu 1 param
		this.virsta = 2;
		this.nume = nume;
	}

	public Animal(String nume, int virsta) {	// constructor cu 2 param
		this.nume = nume;			// this nume e fieldul din clasa curenta iar nume e parametrul functiei
		this.virsta = virsta;
	}
	
	public Animal(Boolean e) {	// constructor care cheama alt constructor
		this("Sharik", 7);		// chemam constructorul 3 utilizind cuvintul cheie this
		this.exista = true;
		
	}
	
	// geterii si setterii sunt functii publice si pot fi folosite de orice alta clasa si servesc pu a modifica fieldurile care sunt private 
	public int getVirsta() {	// getter, functia care citeste virsta
		return virsta;
	}
	public void setVirsta(int virsta) {  // setter, functia care scrie virsta
		this.virsta = virsta;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}

}
