package com.jschool.lab0;

import java.util.Scanner;


public class _2_Print100 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Introduceti numar de tip intreg pentru a fi afisat de 100 de ori: ");
		x = sc.nextInt();
		print100(x);
		System.out.println(); // rind nou
/*
		float f;
		System.out.println("Introduceti numar de tip \"float\" pentru afisare repetata: ");
		f = sc.nextFloat();
		int i = 0, n = 100;
		while (i < n) {
			System.out.print("Valoarea lui f este: " + f + ", ");
			i++;
		}
		System.out.print("." + '\n');

		String s;
		System.out.println("Introduceti o valoare de tip \"String\" pentru afisare repetata: ");
		s = sc.next();
		i = 0;
		while (i < n) {
			System.out.print("Valoarea lui s este: " + s + ", ");
			i++;
		}
		System.out.print("." + '\n');
		*/
	}
	
	static void print100(double numar){		
		int i = 0, n = 100;
		while (i < n) {					 
			System.out.print("i=" + i + " numar=" + numar);
			if ( i < n - 1 ) { 
				System.out.print(", ");
			} else {
				System.out.print(".");
			}			
			i++;
		}
	}
}
