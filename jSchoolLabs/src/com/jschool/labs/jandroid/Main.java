package com.jschool.labs.jandroid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private void Meniu () { 
	
		 Scanner sc = new Scanner(System.in);
		 Companie companie = new Companie();
		    System.out.println("\n 1. Denumirea Companiei: ");
		    System.out.println("\nIntroduceti denumirea companiei");
		    String numeCompanie = sc.nextLine();
		    companie.setNumeCompanie(numeCompanie);
		    
		    System.out.println("\n 2. Codul Fiscal: ");
            System.out.println("\nIndroduceti Codul Fiscal");
		    long codFiscal = sc.nextLong();
		    companie.setCodFiscal(codFiscal);
		    
		    System.out.println("\n 3. Tipul Companiei: ");
		    System.out.println("\nIntroduceti Tipul Companiei");
		    CompanyType = sc.nextLine(); //??????CUm de introdus de la tastatura valorile unui enum??????
		    companie.setCompanyType(tipCompanie);
		    
		    System.out.println("\n 4. Numarul de angajati: ");
		    System.out.println("\nIntroduceti Numarul de angajati"); //??????Numarul il setam noi drept conditie  sau el se genereaza din lista?????
		                                                             //??????Daca ele se genereaza din lista atunci prin ce functie se face?????
		  
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
		   
		  System.out.println("\nLista Angajati Companie IT: " + listaDeAngajatiIt);
		
	    List<Angajat> listaDeAngajatiTransport = genereazaListaAngajati(CompanyType.TRANSPORT);
	      
		   System.out.println("\nLista angajati Companie Transport: " + listaDeAngajatiTransport);
		
	    List<Angajat> listaDeAngajatiFinaciara = genereazaListaAngajati(CompanyType.FINANCIARA);
		   
		    System.out.println("\nLista angajati Companie Financiara: " + listaDeAngajatiFinaciara );
		
		List<Angajat> listaDeAngajatiMedicala = genereazaListaAngajati(CompanyType.MEDICALA);
		
		    System.out.println("\nLista angajati Companie Medicala: " + listaDeAngajatiMedicala ); 
		    
	}
	
	private List<Angajat> genereazaListaAngajati(CompanyType ct) {
		List<Angajat> lista = new ArrayList<Angajat>();
		switch (ct) {
			case IT: { //???Conditia definirii numarului max sau min de angajati se face in acest case??? Daca da atunci cum corect sa definesc conditia????
				Director d1 = new Director(); 
				d1.setNume("Albert Enstein");
				d1.setVirsta(55);
				d1.setCotaParte(100); //???probabil de creat o functie cu  If si implementata aici??? CUM????
				lista.add(d1); 
				
				Contabil c1 = new Contabil();
				c1.setNume("Maria Vasilievna");
				c1.setVirsta(44);
				c1.setAcountantCategoryType(AcountantCategoryType.IV);//???La enum initializarea treb sa fie random?????
				lista.add(c1);
				
			    Programist p1 = new Programist();
			    p1.setNume("Vasile Marian");
			    p1.setVirsta(30);
			    p1.setProgrammingLanguageType(ProgrammingLanguageType.JavaScript); 
			    lista.add(p1);
			    
			    Programist p2 = new Programist();
			    p2.setNume("Gigi Corghencea");
			    p2.setVirsta(26);
			    p2.setProgrammingLanguageType(ProgrammingLanguageType.JAVA);//????Cum declaram mai multe valori din enum???? Sau random???
			    lista.add(p2);
		
			}	break;
		
        
			case TRANSPORT: { //???Conditia definirii max min angajati???
				Director d1 = new Director(); 
				d1.setNume("Iurie Calasnicov");
				d1.setVirsta(45);
				d1.setCotaParte(100); //???
				lista.add(d1); 
				
				Director d2 = new Director(); 
				d2.setNume("Vasile Dragunov");
				d2.setVirsta(45);
				d2.setCotaParte(100); 
				lista.add(d2); 
				
				Contabil c1 = new Contabil();
				c1.setNume("Valentina Macarov");
				c1.setVirsta(40);
				c1.setAcountantCategoryType(AcountantCategoryType.I);
				lista.add(c1);
				
				Sofer s1 = new Sofer(); //???Cum de declarat mai multi soferi random?????
				s1.setNume("Vladimir Pulemiotov");
				s1.setVirsta(34);
				s1.setDriveLicenceType(DriveLicenceType.D);//???Cum de declarat mai multe valori din enum???
				lista.add(s1);
				
				
			} break;
			
			case FINANCIARA: {//???Conditia definirii max min angajati???
				Director d1 = new Director(); 
				d1.setNume("Issac Lehmann");
				d1.setVirsta(45);
				d1.setCotaParte(100); //???
				lista.add(d1); 
				
				Director d2 = new Director(); 
				d2.setNume("Moise Liberman");
				d2.setVirsta(45);
				d2.setCotaParte(100); 
				lista.add(d2); 
				
				Contabil c1 = new Contabil();
				c1.setNume("Isabella Stern");
				c1.setVirsta(40);
				c1.setAcountantCategoryType(AcountantCategoryType.I);
				lista.add(c1);
				
				Contabil c2 = new Contabil();
				c2.setNume("Shara Shoitzman");
				c2.setVirsta(40);
				c2.setAcountantCategoryType(AcountantCategoryType.II);
				lista.add(c2);
				
				
			} break;
			
		case MEDICALA: {//???Conditia definirii max min angajati???
			Director d1 = new Director();
			d1.setNume("Leonid Cravcescu");
			d1.setVirsta(45);
			d1.setCotaParte(100);//????
			lista.add(d1);

			Director d2 = new Director();
			d2.setNume("Eduar Conisescu");
			d2.setVirsta(45);
			d2.setCotaParte(100);
			lista.add(d2);

			Contabil c1 = new Contabil();
			c1.setNume("Ana Pruteanu");
			c1.setVirsta(40);
			c1.setAcountantCategoryType(AcountantCategoryType.I);
			lista.add(c1);

			Contabil c2 = new Contabil();
			c2.setNume("Elena Dumitrescu ");
			c2.setVirsta(40);
			c2.setAcountantCategoryType(AcountantCategoryType.II);
			lista.add(c2);
			
			Medic m1 = new Medic();
			m1.setNume("Corina Mitrescu");
			m1.setVirsta(40);
			m1.setSpecialitatea("ORL");
		}
		
		return lista;	// returneaza lista cu toti angajatii creati
	   }
	}
}

	

