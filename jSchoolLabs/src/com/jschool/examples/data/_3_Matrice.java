package com.jschool.examples.data;

public class _3_Matrice {

	static final int COLOANE = 2;	// constante - static se creaza odata cu create programului, final nu se mai poate schimba
	static final int LINII = 3;
	
	public static void main(String[] args) {
		int[][] a = new int[LINII][COLOANE];	// declarare
		
		a[0][0] = 1; a[0][1] = 15;		// setare valori
		a[1][0] = 3; a[1][1] = 55;
		a[2][0] = 4; a[2][1] = 432;

		
		
		System.out.println("elementul a(0,1) linia 1 coloana 2 este : " + a[0][1]);
		System.out.println("elementul a(2,1) linia 3 coloana 2 este : " + a[2][1]);

		
		int b[][] = {						// initializata cu valori
				{	0,	1,	2,	3,	4	}, 
				{	-9,	8,	7,	+6,	5	},
				{	9,	-8,	77,	6,	5	}
				
		};	
		
		System.out.println("elementul b(1,0) linia 2 coloana 1 este : " + b[1][0]);
		System.out.println("elementul b(2,4) linia 3 coloana 5 este : " + b[2][4]);
		
		
	}
	

}
