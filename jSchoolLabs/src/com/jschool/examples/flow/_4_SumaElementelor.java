package com.jschool.examples.flow;
/*
 * Acest program este o demonstrare an modalitatii de introducere a datelor de la tastatura si afisarea lor pe ecran. 
 * Realizarea alegerii a diferitor optiuni a aplicatiei, De asemenea demonstreaza modalitatea de utilizare a tablourilor, 
 * initializarea, introducerea, afisarea si procesarea elementelor lor utilizind instructiuni for si if. 
 */
import java.util.Scanner;

public class _4_SumaElementelor {

	public static void main(String[] args) {
		
		int a[] = null;
		int suma = 0;
		
		System.out.println("Doriti sa introduceti numerele vectorului \"a\" manual (Yes) sau sa folositi varianta predefinita (No)?");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		if (answer.toLowerCase().equals("yes") || "y".equals((answer).toLowerCase())) {
			System.out.println("Introduceti numarul de elemente care va contine vectorul \"a\" (prin \"ENTER\"):  ");
			int n = sc.nextInt();
			a = new int[n];
			System.out.println("Introduceti elementele vectorului \"a\" (prin \"ENTER\"):  ");
			for (int i = 0; i < n; i++) {				
			    a[i] = sc.nextInt();
			}
		} else if (answer.toUpperCase().equals("NO") || "N".equals((answer.toUpperCase()))) {
			a = new int[6];
			a[0] = 7; a[1] = -5; a[2] = 3; a[3] = 11; a[4] = 0; a[5] = -8;
		} else System.out.println("Ati ales gretit optiunea.");
		
				
		System.out.println("Numerele din vectorul \"a\": ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = " + a[i]);
			if (i < a.length -1 ) {
				System.out.print(", "); 
			}else {
				System.out.print(".");
			}
		}
		
		System.out.println("\n\nNumerele din vectorul \"a\" (in forma libera): ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1 ) System.out.print(", "); else System.out.print(".");
			
		}		
		
		System.out.print("\n\nNumerele din vectorul \"a\" mai mari decit 0: ");		
		for (int i = 0; i < a.length; i++) {
			if ( a[i] > 0 ) {
				System.out.print(a[i]);
				if (i < a.length - 1 ) System.out.print(", "); else System.out.print(".");
			} else {
				suma += a[i];
			}
		}
		
		System.out.println("\nSuma numerelor mai mici decit 0: " + suma);		
	}
}
