package com.jschool.labs.lab0;
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
		/*
		 * Ca sa incrementez valorile variabilelor nu nio vinit nimic in cap
		 * decit sa folosesc ciclu for, insa nu inteleg ce operatie face el cind
		 * incrementeaza si decrementeaza variabilele, dupa cum imi dau seama el
		 * ia valoarea finala la incementare si apoi o trimite la decrementare.
		 * In cerintele programului se cerea ca sa fac incrementarea si
		 * decrementarea in main, probabil am gresit folosind ciclu for, dar nu
		 * am vrut sa incarc programul cu o gramada de variablie de tip int i2=
		 * i++ dupa mine si astai o metoda. UNica ce nu stiu cum se
		 * incrementeaza string-urile si boolean-urile si dac e posibil, si
		 * vashe dac are rost.
		 */

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
		for (; l > 999999999; l--) {
			System.out.println(decr + ch + l);
		}
		System.out.println(val + ch + f);
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