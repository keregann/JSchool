package com.jschool.examples.data;

public class _5_Clase {

	public static void main(String[] args) {
		// cream 3 obiecte de tipul clasei Animal utilizind constructorii lor
		Animal a1 = new Animal();				// constructorul default
		Animal a2 = new Animal("Bobik");		// contructorul cu 1 parametru
		Animal a3 = new Animal("Bobik", 3);		// contructorul cu 2 parametri
		
		System.out.println("animal1: nume = " + a1.getNume() + ", virsta = " + a1.getVirsta());
		System.out.println("animal2: nume = " + a2.getNume() + ", virsta = " + a2.getVirsta());
		System.out.println("animal3: nume = " + a3.getNume() + ", virsta = " + a3.getVirsta());
		a3.setNume("Leonidas");		// aici deja numele si virsta se schimba
		a3.setVirsta(15);
		System.out.println(a3.getNume() + " lup batrin, are deamu " + a3.getVirsta() + " ani.");
		System.out.println("Exista: " + a3.exista); // deoarece nu am setat nicaieri exista, a ramas false care e default pentru boolean in java
		
		int virsta = 9;
		boolean sanatos = true;
		boolean isDead = virsta > 13 && sanatos ;
		Animal a4 = new Animal(isDead);
		System.out.println("animal4: nume = " + a4.getNume() + ", virsta = " + a4.getVirsta());
		
		System.out.println("- Da " + a4.getNume() + " a vostru, mai traieste inca? ");
		if (a4.exista) {  // deoarece exita e public nu e nevoie de getter
			System.out.println("- Da inca se primbla.");
		} else {
			System.out.println("- Gata i-o batut ceasu.");
		}
		System.out.println("- Da cit ani are deamu? ");
		System.out.println("- Treb sa vreo " + a4.getVirsta() + " deamu.");
		
	}

}
