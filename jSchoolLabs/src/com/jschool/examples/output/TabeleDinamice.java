package com.jschool.examples.output;

public class TabeleDinamice {

	String coloanaNume = "Nume";
	String coloanaPrenume = "Prenume";
	String coloanaDetalii = "Detalii";
	String nume1 = "Ghincolov";
	String nume2 = "Corghencea";
	String pren1 = "Ion";
	String pren2 = "Alex";
	String det1 = "oricum nu raspunde";
	String det2 = "l-o pierdut";
		
	// folosim functia matematica max care determina max dintre doua numere
	// String.lenght() returneaza lungimea actuala a unui sir de caractere
	// max(1, max(2,3)) va returna max absolut
	int col1 = 	Math.max(	coloanaNume.length(), 		Math.max(nume1.length(), nume2.length())	);  
	int col2 = 	Math.max(	coloanaPrenume.length(),	Math.max(pren1.length(), pren2.length())	);
	int col3 = 	Math.max(	coloanaDetalii.length(), 	Math.max(det1.length(), det2.length())		);
	
	public static void main(String[] args) {
		
		// Modalitatea programistica de a desena tabele dinamice dupa marime :) vishii pilotaj
		TabeleDinamice td = new TabeleDinamice(); // cream un obiect de tipul TableDynamic pentru a putea folosi proprietatile si metodele ei 		
		td.printLiniaSus();
		td.printRind(td.coloanaNume, td.coloanaPrenume, td.coloanaDetalii);
		td.printLiniaMijloc();
		td.printRind(td.nume1, td.pren1, td.det1);
		td.printLiniaMijloc();
		td.printRind(td.nume2, td.pren2, td.det2);
		td.printLinaJos();
		
	}
	
	void print205(int numarulDeSimboluri){
		for (int i = 0; i < numarulDeSimboluri + 2 ; i++) {  // ulterior a lasam 2 spatii pentru vizibilitate 
			System.out.print("═"); // 205 reprezinta un simbol special pu tabele '═', 
		}
	}
	
	void printLiniaSus(){
		System.out.print("\n\t╔");
		print205(col1);
		System.out.print("╦");
		print205(col2);
		System.out.print("╦");
		print205(col3);
		System.out.print("╗");			
	}
	
	void printRind(String coloana1, String coloana2, String coloana3){		
		System.out.print("\n\t║");
		System.out.format(" %-" + col1 + "s ", coloana1);
		System.out.print("║");
		System.out.format(" %-" + col2 + "s ", coloana2);
		System.out.print("║");
		System.out.format(" %-" + col3 + "s ", coloana3);
		System.out.print("║");	
	}
	
	void printLiniaMijloc(){
		System.out.print("\n\t╠");
		print205(col1);
		System.out.print("╬");
		print205(col2);
		System.out.print("╬");
		print205(col3);
		System.out.print("╣");
	}
	void printLinaJos(){
		System.out.print("\n\t╚");
		print205(col1);
		System.out.print("╩");
		print205(col2);
		System.out.print("╩");
		print205(col3);
		System.out.print("╝");	
	}
}
