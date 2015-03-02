package com.jschool.examples.data;

import java.util.List;
import java.util.Vector;

public class _7_Interfete {

	
	public interface Guitar{		// interfatza
		String sound();
	}
	
	public class ElectricGuitar implements Guitar{		// clasa care mosteneste interfata
		public String sound(){
			return "crunch";
		}
	}
	
	public class WesternGuitar implements Guitar{		// aceste clase sunt interne, adica inner, se putea de declarat in fisiere separate
		public String sound(){
			return "strumm";
		}
	}
	
	public class ClassicalGuitar implements Guitar{
		public String sound(){
			return "arpegio";
		}
	}
		
	public class Play{
		public String sweep()
		{
			List<Guitar> ls = new Vector<Guitar>();	
			StringBuilder sb = new StringBuilder();
			ls.add(new ElectricGuitar());				// in lista se adauga obiecte de tip Guitar indiferent ca ele in realitate sunt 
			ls.add(new WesternGuitar());				// de diferite tipuri de clase
			ls.add(new ClassicalGuitar());
			ls.add(new ElectricGuitar());
			ls.add(new WesternGuitar());
			ls.add(new ClassicalGuitar());
			ls.add(new WesternGuitar());
			ls.add(new ClassicalGuitar());
			ls.add(new WesternGuitar());
			
			for(Guitar g: ls)
			{
				sb.append(g.sound()+ " ");
			}
			return (String) sb.toString();
		}
	}
		
	public static void main(String[] args) {
		_7_Interfete inst = new _7_Interfete();		// instamtiam si accesam metodele prin obiect
		Play p = inst.new Play();
		System.out.println(p.sweep());
	}
	

}



