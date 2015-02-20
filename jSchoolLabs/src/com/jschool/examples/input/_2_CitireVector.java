package com.jschool.examples.input;
/*
 * Acest program este o demonstrare an modalitatii de introducere a datelor de la tastatura si afisarea lor pe ecran. 
 * Realizarea alegerii a diferitor optiuni a aplicatiei, De asemenea demonstreaza modalitatea de utilizare a tablourilor, 
 * initializarea, introducerea, afisarea si procesarea elementelor lor utilizind instructiuni for si if. 
 */
import java.util.Scanner;

public class _2_CitireVector {

	public static void main(String[] args) {
		
		int a[] = null;	// cream un tablou fara elemente
		
		Scanner sc = new Scanner(System.in);	// creem un scaner
		System.out.println("Introduceti numarul de elemente care va contine vectorul \"a\" (prin \"ENTER\"):  ");
		int n = sc.nextInt();	// citim un int care se inscrie in variabila n
		a = new int[n];			// in tabloului a ii creem n elemente
		System.out.println("Introduceti elementele vectorului \"a\" (prin \"ENTER\"):  ");
		for (int i = 0; i < n; i++) {		// iteram i de la 0 pina la n 
			a[i] = sc.nextInt();			// fiecare numar citit se atribuie unui element a de pe pozitia i
		}
		
		System.out.println("Numerele din vectorul \"a\" ");
		for (int i = 0; i < a.length; i++) {	// se itereaza de la 0 pina la lungimea vectorului (se putea pina la n)
			System.out.print(a[i] + " ");		// se priteaza elementul de pe pozitia i
		}				
			
	}
}
