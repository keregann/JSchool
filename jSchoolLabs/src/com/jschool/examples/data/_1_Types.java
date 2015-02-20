package com.jschool.examples.data;

public class _1_Types {

	public static void main(String[] args) {
		int integer = 101;
		double zecimal = 3.14;
		float flotant = (float) zecimal;	// float si double au acelash format doar ca float pastreaza numere mai mici, deci daca sigur avem un numar mic se poate face cast la un tip mai mic
		short mic = (short) integer;		// facem cast de la int la short, daca suntem siguri ca numarul nu depasetse valoare maxima al short
		double dd = flotant;				// cast de la un tip mic la unul mare se face implicit
		System.out.println("Suma numereler integer + flotant = " + (integer + flotant));		
		
		// putem folosi tipurile din clasa Integer care are mai multe posibilitati
		Integer aInteger = 14;					// putem initialuiza ca pe int simplu
		Integer bInteger = new Integer(15);		// putem initializa ca pe un obiect nou
		Integer cInteger = null;				// deoarece e obiect poate fi null
		int testInt = aInteger + bInteger;		// si sunt compatibile cu tipurile primare
		
		System.out.println("aInteger + bInteger : " + testInt);
		System.out.println("cInteger: " + cInteger);
		
		// cind adunam int cu null da exceptie NullPointerException
		// decomenteaza si incearca
	//	System.out.println("Suma a 3: " + (testInt + cInteger));  
		
		
		Float f1 = 6.27f;				// declaram f1 = 6.27 implicit de tipul flotant
		Float f2 = (float) 6.28;		// declaram f2 = 6.28 dar nu implicit float ci folostind cast la float din double
		Double d = 6.29;				// numarul 6.29 in java deja e double
		System.out.println("Suma f1 + f2 + d = " + f1 + f2 + d);		// aceiasi chestie ca mai sus
		System.out.println("Suma f1 + f2 + d = " + (f1 + f2 + d)); // de unde atitea cifre dupa virgula?
		
		//Clasele de tipuri au multe avantaje.
		Short s = 171;
		System.out.println("\n-------------------------------------");
		System.out.println("Short.toString(): " + s.toString());
		System.out.println("Short.MAX_VALUE: " + s.MAX_VALUE);
		System.out.println("Short.MIN_VALUE: " + s.MIN_VALUE);
		System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE + " (acelash lucru se poate de facut direct de la clasa)");		
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
		System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
		System.out.println("Tipul lui Double este : " + Double.TYPE);
		System.out.println("Marimea lui Double este : " + Double.SIZE);
		System.out.println("Puterea maxima lui Double este : " + Double.MAX_EXPONENT);		

	}

}
