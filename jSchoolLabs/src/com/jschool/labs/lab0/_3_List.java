package com.jschool.labs.lab0;

import java.util.ArrayList;
import java.util.List;

/*
 * De facut un program care contruieste 5 obiecte de tip Integer si 10 de tip Long. De construit 2 liste: ArrayList<Integer> si ArrayList<Long> 
 * si de adaugat obiectele in lista. Sa se printeze toate elementele listelor.
 */

public class _3_List {

	public static void main(String[] args) {

		Integer i = new Integer(5); // crearea obiectelor de tip integer ex:
									// _1_Types
		Integer i2 = new Integer(6);
		Integer i3 = new Integer(7);
		Integer i4 = new Integer(2);
		Integer i5 = new Integer(4);

		Long l = new Long(10000000); // crearea obiectelor de tip Long
		Long l2 = new Long(20000000);
		Long l3 = new Long(30000000);
		Long l4 = new Long(40000000);
		Long l5 = new Long(50000000);
		Long l6 = new Long(60000000);
		Long l7 = new Long(70000000);
		Long l8 = new Long(80000000);
		Long l9 = new Long(90000000);
		Long l10 = new Long(100000000);

		List<Integer> listaInteger = new ArrayList<Integer>(); // crearea listei cu elemente de tip Integer ex: _4_Liste
		listaInteger.add(i);                                   // adaugarea obiectelor in lista Integer
		listaInteger.add(i2);
		listaInteger.add(i3);
		listaInteger.add(i4);
		listaInteger.add(i5);

		List<Long> listaLong = new ArrayList<Long>(); // crearea listei cu elemente de tip Long
		listaLong.add(l);                             // adaugarea obiectelor in lista Long
		listaLong.add(l2);
		listaLong.add(l3);
		listaLong.add(l4);
		listaLong.add(l5);
		listaLong.add(l6);
		listaLong.add(l7);
		listaLong.add(l8);
		listaLong.add(l9);
		listaLong.add(l10);

		afiseazaListaInteger(listaInteger); // afisarea listei Integer ex: _4_ProcesareaListelor
											
		afiseazaListaLong(listaLong);       // afisarea listei Long
	}
	static void afiseazaListaInteger(List<Integer> listaInteger) {
		System.out.print("Lista Integer= " + listaInteger);
	}
	static void afiseazaListaLong(List<Long> listaLong) {
		System.out.print("Lista Long= " + listaLong);

	}

}
