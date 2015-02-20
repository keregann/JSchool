package com.jschool.examples.flow;

public class _2_For {

	public static void main(String[] args) {
				
		// for ( initializarea ; conditie; schimbarea variabilei) {}
		System.out.print("incepe de la 0 si se termina la 9: \t ");
		for (int i = 0; i < 10; i++) {	// incepe de la 0 si se termina la 9			
			System.out.print(i + "  ");
		}		
		
		System.out.print("\nincepe de la 9 si se termina la 0: \t"); // din rind nou
		for (long l = 10; l > 0; l--) {	// incepe de la 9 si se termina la 0			
			System.out.print(l + "  ");
		}
		
		System.out.print("\n\nincepe de la 0 si se termina la 100 numarind din 5 in 5: \t");
		for (short s = 0; s < 100; s+=5) {	// incepe de la 0 si se termina la 100 numarind din 5 in 5			
			System.out.print(s + "  ");
		}
		
		System.out.print("\nincepe de la 0 si se termina la 3 insa itereaza cu 0.2:	\t");
		for (float f = 0f; f < 3; f += 0.2) {	// incepe de la 0 si se termina la 3 insa itereaza cu 0.2		
			System.out.format("%3.1f  ", f);
		}		
		
		System.out.print("\nFor in for, 3 iteratii pu i si in fiecare avem 4 iteratii pu j");
		for (int i = 18; i < 21; i++) {		// 3 iteratii in crestere	
			for (int j = 5; j >= 3; j--) {	// 4 iteratii interne in descrestere
				System.out.println(i + " * " + j + " = " + i*j);
			}			
		}
		System.out.print("\nfor cu doua variabile: ");
		for ( int i=0, j=0; i<10 && j<12; i++, j++ ) { // cind i < 10 conditia devine falsa si ciclul se opreste
			System.out.print(i + j + "  ");
		}
		
		
	}

}
