package com.jschool.labs.lab0;

public class _2_recomandare {

	public static void main(String[] args) {
		
		//.. citeste de la tastatura un int, un short, un long, un byte si cheama,
		// uite exemplul care am trimis simbata din JavaExamples din package input si in loc de initializarea variabileleor in cod citestele de la tastatura
		int i = 10;
		byte b = 5;
		
		System.out.println("Print 100 int:");
		print100Double(i);		// functia primeste long deci automat o sa poata lucra si cu tipuri mai mici
		System.out.println("\nPrint 100 byte:");
		print100Double(b);
		String s = "text";
		char c = 'j';
		System.out.println("\nPrint 100 string:");
		print100String(s);
		System.out.println("\nPrint 100 char:");
		print100String(String.valueOf(c)); // char il transformam in string cu ajut functiei String.valueOf()
		System.out.println("\nPrint 100 byte folosind funtia de print100String():");
		print100String(String.valueOf(b));	// in principiu pu caz nostru ca doar imprimam, putem transforma 
											//tot in string si folosim o singura funtie, insa in caz ca va fi nevoie de 
											// operatii aritmetice nu vom putea folosi string, deasta e mai bine 2
		
		
	}

	static void print100String(String cuvint){		
		for (int i=0; i<100; i++) {
			System.out.print(cuvint + "  ");
		}
	}
	
	static void print100Double(double numar){		
		int i = 0;
		while ( i < 100 ) {
			System.out.print(numar + "  ");
			i++;
		}
	}
}
