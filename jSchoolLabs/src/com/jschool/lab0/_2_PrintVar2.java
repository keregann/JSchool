package com.jschool.lab0;

import java.util.Scanner;

public class _2_PrintVar2 {

	public static void main(String args[]) {

		Scanner print100 = new Scanner(System.in);
		int i = 1; /*Am declarat mai multe variabile pentru ciclu while, daca ma folosesc de una singura apu ciclu nu lucreaza*/
		int a = 1;
		int b = 1;
		int x;

		System.out.print("Introduceti numar de tip \"int\"  pentru afisare repetata: ");
		x = print100.nextInt();
		while (i <= 100) {
			System.out.print("Valoarea lui x este: " + x + "," + " ");
			i++;
		}

		System.out.print("."+'\n'); /*Nu stiu cum la ultima afishare sa scot virgula, deasta si se primeste virgula + punct */
		
		float f;
       System.out.println("Introduceti numar de tip \"float\" pentru afisare repetata: ");
        f = print100.nextFloat();
        while (a <= 100) {
			System.out.print("Valoarea lui f este: " + f + "," + " ");
			a++;
        }
        System.out.print("."+'\n');
        
        String s;
        System.out.println("Introduceti o valoare de tip \"String\" pentru afisare repetata: ");
         s = print100.next();
         while (b <= 100) {
 			System.out.print("Valoarea lui s este: " + s + "," + " " );
 			b++;
         }
         System.out.print("."+'\n');
	}

}

