package com.jschool.examples.flow;

public class _1_If {

	public static void main(String[] args) {
		int i = 10;
		double d = 3.14;
		
		if ( i < d ) {
			System.out.println( i + " < " + d );
		}

		if ( i > d ) {
			System.out.println( i + " > " + d );
		}
		
		if ( i >= d) {				// mai mare sau egal
			System.out.println( i + " >= " + d ); 			
		}
		
		if ( i != 0) {
			System.out.println( i + " nu e 0" );		
		}
		
		if ( i != 0 && i > d ) {
			System.out.println( i + " > " + d + " and not 0");
		}
		
		if ( i == 0 && i > d ) {	// nu afiseaza nimic deoarece cel putin o conditie nu se indeplineste
			System.out.println( i + " > " + d + " and is 0");
		}
		
		if ( i == 0 || i > d ) {	// se afiseaza deoarece cel putin o conditie se indeplineste
			System.out.println( "ori " + i + " > " + d + " ori i este 0");
		}
		
		if ( i < d ) {	// daca nu se indeplineste conditia se executa blocul else
			System.out.println("blocul if" );
		} else {
			System.out.println("blocul else" ); 	
		}
		
		System.out.println("\ni = " + i +  " d = " + d);
		if ( i > 0 ) {
			System.out.println( "blocul if i > 0" );
			if ( i > d) {	// if/else interior la blocul din primul if
				System.out.println( "blocul if i > d din blocul if i > 0");
			} else {
				System.out.println( "blocul else i > d din blocul if i > 0");
			}
		} else {	// se refera la primul if
			System.out.println( "blocul else i > 0" );
		}
		
		d += 50;  // marim variabila d cu 50 si vedem cum lucreaza acelash block
		System.out.println("\ni = " + i +  " d = " + d);		
		if ( i > 0 ) {
			System.out.println( "blocul if i > 0" );
			if ( i > d) {	// if/else interior la blocul din primul if
				System.out.println( "blocul if i > d din blocul if i > 0");
			} else {
				System.out.println( "blocul else i > d din blocul if i > 0");
			}
		} else {	// se refera la primul if
			System.out.println( "blocul else i > 0" );
		}
	}

}
