package com.jschool.lab0;

import java.util.Scanner; // Mai spune ca pt scanner mai treb  importate si clasa lui.... idreni feni :P

public class _2_PrintVar {
  
    public static void main(String args[]) {
         
       Scanner afişeazăUrmatorul = new Scanner(System.in);
          
          int x;
             System.out.print("Introduceti cifra pentru incrementare repetata: ");
             x = afişeazăUrmatorul.nextInt();
          while( x < 100 ) {
             System.out.print("Valoarea lui x este: " + x );
             x++;
             System.out.print("\n"); 
          
       }
          
          double d;
             System.out.print("Introduceti a doua cifra, cu conditia sa fie mai mica ca 10, pentru incrementare repetata: ");
               d = afişeazăUrmatorul.nextDouble();
          do { 
             System.out.print("Valoarea lui d este: " + d );
               d=d+0.1;
             System.out.print("\n");
             }
          while( d < 10 );
          

          /* La faza urmatoare cind vreau sa introduc o variabila de tip String de la tastatura, imi afisheaza ca e null.
           * Daca schimb variablila in "char" pai programul imi ruleaza dar imi baga exceptie. Probabil cit intrun caz cit si in altul
           * eu nu folosesc declaratia metodei corect, dar nustiu unde so gasesc. In cazul cu "char" am folosit declaratia .findInLine("").charAt(0)
           * si acolo imi da eroare la rulare, dar compilarea merge.
           */ 
             System.out.print("Introduceti litera pentru incrementare repetata: ");
             String a = afişeazăUrmatorul.findInLine("");        
           
             System.out.print("Valoarea incrementarii este: " + a );
             System.out.print("\n");
             
         /* Am facut un "for" sa-ti arat ca am am priceput principiul  si am incrementat, dar numai cu variabila definita, 
          * nu-mi reuseste la moment sa le leg cu introducerea de la tastatura.
          */
         for(char ch = 'a'; ch < 'z' ; ch++ ) { 
             System.out.print("Valoarea incrementarii este: " + ch );
             System.out.print("\n");
         }  
    }
}

