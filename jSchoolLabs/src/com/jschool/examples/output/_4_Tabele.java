package com.jschool.examples.output;

public class _4_Tabele {

	public static void main(String[] args) {
		System.out.println("+------------+----------+--------+----------------+--------------+");
		System.out.println("| Nume       | Prenume  | Virsta | Resedinta      | Telofon      |");
		System.out.println("+------------+----------+--------+----------------+--------------+");
		System.out.println("+------------+----------+--------+----------------+--------------+");
		System.out.println("| Ghincolov  | Ion      | 28     | str. Gribov    | +37369123456 |");
		System.out.println("+------------+----------+--------+----------------+--------------+");
		System.out.println("| Corghencea | Alex     | 30     | str. Livezilor | +37369678954 |");
		System.out.println("+------------+----------+--------+----------------+--------------+");
		System.out.println("| Ciumadan   | Vitali   | 19     | nu-i peacasa   | l-o pierdut  |");
		System.out.println("+------------+----------+--------+----------------+--------------+");

		// se poate de folosit caractere ASCII sau ISO insa treb de salvat file corespunzator si consola de setat sa arate corect ASCII sau ISO

		
		// http://www.theasciicode.com.ar
		// in cod in stringuri se pot folosti caracterele de sub un anumit cod: ALT+65 echivalet cu litera 'a', ALT+200 este semnul colt-stinga-jos "╚"
		System.out.println("To be able to display in ASCII need to save the code in UTF-8 format");
		System.out.println(	"\n\t╔═══════════╦═════════╦═════════════╗"			// string se trece de pe rind pe rind cu + iar in interion se folosesc \n pentru a trece din rind nou in consola  
						+ 	"\n\t║ Nume      ║ Prenume ║ Detalii     ║"
						+ 	"\n\t╠═══════════╬═════════╬═════════════╣"
						+ 	"\n\t║ Familia   ║ Numele  ║ niste date  ║"
						+ 	"\n\t╚═══════════╩═════════╩═════════════╝");
			
	}
}
