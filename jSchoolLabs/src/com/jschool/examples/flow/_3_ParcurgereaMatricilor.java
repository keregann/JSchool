package com.jschool.examples.flow;

import java.util.Random;

public class _3_ParcurgereaMatricilor {
	static final int N = 50;
	public static void main(String[] args) {
		int a[] = {1, 2, -8, 0, 7};		
		
		System.out.println("vecotul a in mai multe rinduri:");
		for (int i = 0; i < a.length; i++) {	// itereaza de la pozitia 0 si termina ciclul la pozitia (lenght - 1)
			System.out.println("a[" + i + "] = " + a[i]);
		}		
		
		System.out.println("primul element a[0]: " + a[0] + "lungimea vectorului: " + a.length + ", ultimul element a[" + a.length + "-1]: " + a[a.length-1]);
		System.out.print("\nVecotul a intro singura linie: { ");
		for (int i = 0; i < a.length; i++) {  
			if ( i == a.length -1 ) {  // cind ajunge la penultima pozitie deseneaza elementul si inchide acolada
				System.out.print(a[i] + " }.");
				break;		// comanda care face sa iasa din ciclu fortzat
			}
			System.out.print(a[i] + ", ");	// cind ajungem la ultima pozitie aceasta intructiune nu se mai executa
		}
		
		// Popularea cu date
		double b[] = new double[N];		
		for (int i = 0; i < b.length; i++) {
			b[i] = Math.random() * 100 * Math.pow(-1, i);  	// random din numerele pina la 100, functia pow ridica -1 la puterea i 
															// (-1) la puterea para da 1, ia la putere impara da -1, si asa obtinem numere negative 
		}
		
		System.out.println("\nVectorul b cu " + N + " de elemente de tip flotant generate cu ajutorul functiei random():");
		for (int i = 0; i < b.length; i++) {
			System.out.format("%5.2f  ", b[i]);
		}
		
		
	}

}
