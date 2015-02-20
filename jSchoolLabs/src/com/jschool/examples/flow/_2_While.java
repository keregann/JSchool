package com.jschool.examples.flow;

public class _2_While {

	public static void main(String[] args) {
		int a = 15;						// init variabilei
		while( a > 0 ) {				// conditia ciclului
			System.out.print(a + " ");	// intructiune
			a--;						// schimbarea variabilei
		}
		
		System.out.println(); // din rind nou
		float f = 3.14f;
		while( f < 3.4 ) {	
			System.out.format("%3.2f ", f);				
			f += 0.01;						
		}
		
		System.out.println(); 
		f = 3.14f;
		do {		// do/while lucreaza exact ca while
			System.out.format("%3.2f ", f);				
			f += 0.01;
		} while (f < 3.4);
		
	}

}
