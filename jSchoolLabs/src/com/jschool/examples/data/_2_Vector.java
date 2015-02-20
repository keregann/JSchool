package com.jschool.examples.data;

public class _2_Vector {

	public static void main(String[] args) {
		int a[] = {1, 2, -3, 0, 7};
		
		System.out.println("Elementul 3 pozitia 2 din tablou: " + a[2]);  //numaratoarea incepe de la 0
		System.out.println("Elementul 5 pozitia 4 din tablou: " + a[4]);  
		
		int pozitia = 0;		
		System.out.println("Elementul " + pozitia + " din tablou: " + a[pozitia]);
		pozitia += 4; // echivalent cu pozitia = pozitia + 4; adica adaugam 4 la valoarea curenta
		System.out.println("Elementul " + pozitia + " din tablou: " + a[pozitia]);
		pozitia++;		// adaugam 1 
		System.out.println("Elementul " + pozitia + " din tablou: " + a[pozitia]); // arunca exceptie pentru ca a pozitia nu se afla in limitele tabloului
			
		
		
	}

}
