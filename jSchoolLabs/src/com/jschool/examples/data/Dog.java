package com.jschool.examples.data;

public class Dog extends Animal{
	
	public Dog(){
		super(); //cheama constructorul default de la clasa super 
	}
	
	public Dog(String nume) {
		super(nume); // cheama construcorul cu signatura String de la clasa de la care mostenete
		super.exista = true;
	}
	
	public void saySomething(){
		if (super.exista)		// poate vorbi numai daca e viu
			System.out.println("Ma cheama " + super.getNume() + " si am " + super.getVirsta() + " ani. Ham Ham!");
	}

}
