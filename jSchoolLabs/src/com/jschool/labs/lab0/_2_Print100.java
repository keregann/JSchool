package com.jschool.labs.lab0;

/* De facut un program care citeste de la tastatura variabile de diferite tipuri de numere si text 
 * si le transmite unei metode cu numele Print100() care le printeaza de 100 de ori 
 * utilizind for sau while separate prin virgula si la urma pune punct.
 */

import java.util.Scanner;

public class _2_Print100 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int x;
		System.out.println("Introduceti numar de tip intreg pentru a fi afisat de 100 ori: ");
		x = sc.nextInt();
		print100(x);
		System.out.println(); 

		float f;
		System.out.println("\nIntroduceti numar de tip zecimal pentru a fi afisat de 100 ori: ");
		f = sc.nextFloat();
		print100(f);
		System.out.println();

		String s;
		System.out.println("\nIntroduceti un sir de caractere pentru a fi afisat de 100 ori: ");
		s = sc.next();
		print100string(s);
		System.out.println();

	}

	static void print100(double numar) {
		int i = 0, n = 100;
		while (i < n) {
			System.out.print(i + ") numar=" + numar);
			if (i < n - 1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
			i++;
		}
	}

	static void print100string(String cuvint) {
		int i = 0, n = 100;
		while (i < n) {
			System.out.print(i + ") cuvint=" + cuvint);
			if (i < n - 1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
			i++;
		}
	}
}
