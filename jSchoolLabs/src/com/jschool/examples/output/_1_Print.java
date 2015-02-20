package com.jschool.examples.output;

public class _1_Print {

	public static void main(String[] args) {

		// print boolean
		boolean b = true;
		boolean decission =  b && 7 > 100;		// care e rezultatul operatiilor logice si de ce?
		System.out.println(decission);
		
		// print char
		char newLine = '\n';
		System.out.print(newLine);				// newline contine simbolul trecerii din rind si la imprimare asa si se intimpla
		char letter = 'A';
		System.out.print(letter);				// print imprima de unde a ramas data trecut cursorul

		System.out.println("\n\t\t2 rinduri noi.\n");
	
		System.out.println("litera \"letter\" din rind nou = " + letter);	// ghilimelele sunt simbol rezervat in Java si ca sa le printam se foloseste escape character '\' ca si la simbolul rind nou
		
		System.out.println("letter in int: " +  (int) letter);		// char si int sunt compatibile, folosim cast la int si transformam litera A in valoarea ei int care e 65 din codul ASCII
		System.out.println("newline in int:" + (int) newLine);		
		
		// tricky
		System.out.println("newline + letter: " + newLine + letter);		// TODO: ce se intimple in astea 4 exemple?
		System.out.println("newline + letter: " + (newLine + letter));
		System.out.println("newline + letter: ");
		System.out.println( newLine + letter );
		
		// print String
		String word = "song";
		String sentence = "I have wrote a ";
		char dot = '.';		// char ii compatibil cu String deoarece String e compus din charuri
		System.out.println(sentence + word + dot);
		
		// print numbers
		int integer = 101;
		double zecimal = 3.14;
		System.out.println("Suma numereler integer + zecimal = " + integer + zecimal);
		System.out.println("Suma numereler integer + zecimal = " + (integer + zecimal));		// TODO: iarasi acelash caz ca mai sus, ce se intimpla?
		
	}

}
