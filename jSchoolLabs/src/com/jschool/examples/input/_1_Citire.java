package com.jschool.examples.input;
/*
 * Acest program este o demonstrare an modalitatii de introducere a datelor de la tastatura si afisarea lor pe ecran. 
 * Realizarea alegerii a diferitor optiuni a aplicatiei, De asemenea demonstreaza modalitatea de utilizare a tablourilor, 
 * initializarea, introducerea, afisarea si procesarea elementelor lor utilizind instructiuni for si if. 
 */
import java.util.Scanner;

public class _1_Citire {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in,"UTF-8"); // definim un obiect de tip Scanner care va citi datele de la tastatura
		
		System.out.println("Introducerti un text si apasati ENTER: ");
		String text = sc.nextLine();		// citeste cite o linie
		System.out.println("Ati introdus textul : " + text);		
		
		System.out.println("Introducerti un numar intreg si apasati ENTER: ");		
		Integer numar = sc.nextInt();		// citeste un int
		System.out.println("Ati introdus numarul : " + numar);
		
		System.out.println("Introducerti un numar zecimal si apasati ENTER: ");
		Float f = sc.nextFloat();			// citeste un float sau un int
		System.out.println("Ati introdus numarul : " + f);
		
		System.out.println("Introducerti un text si apasati ENTER: ");
		String text2 = sc.next();			//citeste un sir de caractere pina la primul spatiu
		System.out.println("Ati introdus textul : " + text2);		
		
		
		
	}
}
