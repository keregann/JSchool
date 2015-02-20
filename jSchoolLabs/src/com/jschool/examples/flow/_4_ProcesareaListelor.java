package com.jschool.examples.flow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _4_ProcesareaListelor {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>(); // cream o lista de tip tablou
		lista.add(4);	// se incepe de la pozitia 0
		lista.add(12);
		lista.add(-1);
		lista.add(0);
		lista.add(7);
		System.out.print("Lista initiala: \t\t\t\t");
		afiseazaLista(lista);		
	
		System.out.print("\nLista contine numarul 12? Raspuns = " + lista.contains(12));
		lista.remove(2); // stergem elementul 3 pozitia 2
		System.out.print("\nDupa ce am sters elementul al treilea: \t\t");
		afiseazaLista(lista);

		System.out.print("\nLista inversata: \t\t\t\t");
		Collections.reverse(lista);
		afiseazaLista(lista);
		
		// declaram o lista de tip poiner
		List<Integer> listaLinked = new LinkedList<Integer>();
		listaLinked.addAll(lista);		// copiem toate elementele din lista veche in ceea noua
		
		// stergem elementele din lista veche
		lista.clear();
		System.out.print("\nDupa ce am curatit lista nu mai are elemente: \t\t\t\t");		
		afiseazaLista(lista);
		
		
		// afisam lista noua
		System.out.print("\nElementele din lista noua: \t\t\t");		
		afiseazaLista(listaLinked);
	
		// afisam lista noua sortata
		System.out.print("\nElementele din lista noua sortate: \t\t");
		Collections.sort(listaLinked);
		afiseazaLista(listaLinked);
		
	
		int suma = 0, produs = 1;
		for (int item : listaLinked) {			
			suma += item;			// s = s + numar;
			produs *= item;			// p = p * numar;
		}
		System.out.print("\nSuma = "  + suma + " produsul = " + produs); 
	}
	
	
	static void afiseazaLista(List<Integer> collection) {		// am facut functia statica sa nu mai fie nevoie de cat obiect de tip clasei _4_Liste
		for (int element : collection) {			// for specific pentru collectii, se mai numeste foreach
			System.out.print(element + "  ");
		}		
	}
	
	

}
