package com.jschool.examples.data;

enum Mobile {		// exemplu tipic
	   Samsung(400), Nokia(250),Motorola(325);		// itemii
	  
	   private int price;							// field enumului
	   
	   Mobile(int p) {								// constructorul, se cheama cind apelezi la Mobile.Nokia
	      this.price = p;
	   }
	   
	   int showPrice() {							// functie, pot fi de care vrei cite vrei
	      return this.price;
	   } 
	}

public class _8_Enum {
	  public static void main(String args[]) {
		   
		  	System.out.println("Selected : " + Mobile.Nokia);		// adresarea la enum dupa item
		  	System.out.println("Selected : " + Mobile.valueOf("Samsung"));		// adresarea dupa item name		  	
		  		
		  	System.out.println("Selected : " + Mobile.valueOf(Mobile.Motorola.toString()));	// se cheama valueOf de la item.toString
		    System.out.println("CellPhone List:");
		    for(Mobile m : Mobile.values()) { 		// enum.values() returneaza itemii enumului (ftie standarta) 
		        System.out.println(m + " costs " + m.showPrice() + " dollars");
		    }      
	  }
}

// enum nui o tema simpla si sunt multe implementari diferite in dependenta de necesitate


	