package com.jschool.examples.output;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _2_PrintFormat {

	public static void main(String[] args) {
		String text = "Un text lung de mai multe caractere";
		System.out.println(text);		
		System.out.format("%s", text);  // la functia format ii arati formatul in care sa fie imprimata variabila
		
		String cuvint = "display";
		System.out.print("\n\t Cuvintul " +  cuvint + " are " + cuvint.length() + " litere."); //aici folosim concatenare
		System.out.format("\n\t Cuvintul %s are %d litere.", cuvint, cuvint.length()); 	// aici trimitem parametri care vor inlocui caractelele de format %s si %d
		System.out.format("\n%10s", text); // afiseaza fariabila in 10 pozitii
		
		Integer i = 14265;
		System.out.format("\n|%d|", i);
		System.out.format("\n|%15d|", i); // va imprima numarul i in format decimal pe 15 pozitii aliniat la dreapta
		System.out.format("\n|%-15d|", i); // aliniat la stinga
		System.out.format("\n|%-15d|-20%s|", i, cuvint); // aliniat la stinga
		
		System.out.print("\n\nPe pozitia de parametri se poate de efectuat calcule");
		System.out.format("\n'%s' - format string, \n %c - caracter, %d - decimal(integer), %f - float, 0x%H hex, 0b%s - binary, %b - boolean", 
				text,		// nu e pbligatori ca parametrii si alte componente din cod sa fie in acelas rind, spatiile si rindurile noi sunt ignorate de compilator 		
				'╔', 
				-101 + 50 , 
				3.14f * (-10), 
				0xFF,				 
				Integer.toBinaryString(0b11010011),
				3+4>0);				
		
		Calendar c = Calendar.getInstance();
	    System.out.format("\n%tB %te, %tY, %tl:%tM %tp", c, c, c, c, c, c); // -->  "May 29, 2006"  "2:34 am"
	    System.out.format("%n%tD %tT", c, c);    // -->  "05/29/06"  // aici se poate de folosit %n in loc de \n
	    
	    //pentru data se poate de folosit SimpleDateFormat
	    Date acum = new Date();
	    System.out.println("\n\nData si ora de azi: " + acum  + "; ziua: " + acum.getDay() + " ora: " + acum.getHours());	    
	    SimpleDateFormat dataSimpla = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");	    
	    System.out.println(dataSimpla.format(acum));
	    System.out.println("Data completa din clasa Calendar: " + c);
	    System.out.println("Data in format calendar: " + c.getTime() + ", timpul in milisecunde incepind din 1970 (Unix timestamp): " + c.getTimeInMillis());
	    
	    // http://www.epochconverter.com/
	    
	    // http://docs.oracle.com/javase/tutorial/java/data/numberformat.html
	    // http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	}
}
