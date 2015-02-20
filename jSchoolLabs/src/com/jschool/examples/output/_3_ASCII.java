package com.jschool.examples.output;

public class _3_ASCII {

	public static void main(String[] args) {
		char c = (char) 65;
		System.out.println("Caracterul pe pozitia 65 in table ASCII este \'" + c + "\'." );
		int i;
		for (i=0; i< 150; i++) {
			System.out.print(  (char) i + ", ");			
		}
		
		System.out.println();
		for (i=0; i<120; i++) {
			System.out.print( "=" );			
		}
		System.out.println();
		
		for (i=0; i< 3000; i++) {
			System.out.print(  (char) i + ", ");
			
			//	la fiecare 50 de caractere il trecem din rind nou			
			if ( i % 50 == 0 ) { // i se imparte la 20 si daca restul imartirii este egal de 0
				System.out.println();
			}
		}

	}
	

}
