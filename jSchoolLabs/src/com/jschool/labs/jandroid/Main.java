package com.jschool.labs.jandroid;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private meniu () {
	
		
		/* Meniul principal se printeaza pe ecran pe rind cele 4 fielduri de introduse		  
			  1. Denumirea companiei 
			  2. Codul fiscal
			  3. Tipul companiei
			  4. Numarul de angajati
			  
		creaza un scaner care citeste optiunea 1,2,3,4 cu sc.nextInt(), verifici cu if daca se afla in diapazon sau e inafara
		initializezi o instanta de clasa de tip Companie
		si setezi fieldurile corespunzatoare prin seteri
		Companie companie = new Companie();		
		
		desenezi pe ecran cu print fiecare text de genul
		"Introduceti denumirea companiei: "
		si citesti cite un string sau int in dependenta de field
		String numeCompanie = sc.next();
		companie.setNume(numeCompanie);			  			  
		 
		
		*/
		
		List<Angajat> listaDeAngajatiIt = genereazaListaAngajati(CompanyType.IT);
		// printeza lista
		// la fel si cu restul
		// dupa ce lucreaza facem sa lucreze random
		
		
	}
	
	private List<Angajat> genereazaListaAngajati(CompanyType ct) {
		List<Angajat> lista = new ArrayList<Angajat>();
		switch (ct) {
			case IT: {
				Director d1 = new Director();
				d1.setName("Albert Enstein");
				d1.setVirsta(55);
				d1.cotaParte(100);
				lista.add(d1);
				
				// de creat 1 contabil si de adaugat in lista
				// de creat 2 programeri si de adaugat in lista
				// cind programul o sa lucreze o sai facem sa se creeze random
				
			}	break;
			// de facut case pentru celelalte tipuri de companie
        
			case Transport: {
			}
			case Financiara: {
				
			}
			//samd
		}
		
		return lista;	// returneaza lista cu toti angajatii creati
	}

}
