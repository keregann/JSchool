package com.jschool.labs.lab0;

/*
 * De facut un program care declara variabile de toate tipurile din java initializate cu o valoare.
 * In main se incrementeaza si decrementeaza valorile lor si le afiseaza la ecran (scr)
*/

public class _1_Variabile {
	public static void main(String args[]) {
		byte b = 1;
		short s = 1000;
		int i = 10000;
		long l = 1000000000;
		float f = 2.3f;
		double d = 3.4;
		char ch = '=';
		String decr = "Valoarea decrementata ";
		String incr = "Valoarea incrementata ";
		String val = "Valoarea initiala  ";
		boolean x = true;
		boolean y = false;
		
		// what was expected
		System.out.println("! " + i++);
		System.out.println(s--);
		System.out.println(l-=705-l);
		System.out.println(f+=0.25);
		System.out.println(d+=f);
		System.out.println("! " + ( i++ + s) );		// intii se aduna valoare int a lui ch si se afiseaza, dupa asta i se incrementeaza
		System.out.println("! " + ++i);			// intii se incrementaza apoi se afiseaza
		System.out.println(s-ch+d);
		
		System.out.println(val + ch + b);
		for (; b < 2; b++) {
			System.out.println(incr + ch + b);
		}
		
		for (; b > 0; b--) {
			System.out.println(decr + ch + b);
		}
		System.out.println(val + ch + s);
		
		for (; s < 1002; s++) {
			System.out.println(incr + ch + s);
		}
		
		for (; s > 999; s--) {
			System.out.println(decr + ch + s);
		}		
		System.out.println(val + ch + i);
		
		for (; i < 10002; i++) {
			System.out.println(incr + ch + i);
		}
		
		for (; i > 9999; i--) {
			System.out.println(decr + ch + i);
		}
		System.out.println(val + ch + l);
		
		for (; l < 1000000002; l++) {
			System.out.println(incr + ch + l);
		}
		
	/*	for (; l > 999999999; l--) {
			System.out.println(decr + ch + l);
		}
		System.out.println(val + ch + f);
		*/
		for (; f < 2.4; f++) {
			System.out.println(incr + ch + f);
		}
		
		for (; f > 0; f--) {
			System.out.println(decr + ch + f);
		}
		System.out.println(val + ch + d);
		
		for (; d < 3.5; d++) {
			System.out.println(incr + ch + d);
		}
		
		for (; d > 0; d--) {
			System.out.println(decr + ch + d);
		}
	}

}