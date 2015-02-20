package com.jschool.examples.data;

public class _6_Mostenire {

	public static void main(String[] args) {
		Animal animal = new Animal(); // constr default		
		System.out.println("animal: nume = " + animal.getNume() + ", virsta = " + animal.getVirsta());
		Dog dog1 = new Dog();  // dog mosteneste de la Animal numele si virsta
		System.out.println("dog1: nume = " + dog1.getNume() + ", virsta = " + dog1.getVirsta());
		dog1.saySomething(); // nu va zice nimic deoarece e mort, 'exista' din animal e false java default
		dog1.exista = true;		// am chemat paladinu si io facut resurrect
		dog1.saySomething();	// amu alearga si hamaie bucuros
		
		Animal dog2 = new Dog("Mike"); // Dog totusi e animal insa e specificat ca e Dog 
		// Dog in acest caz nu va avea metoda saySomething deoarece ne uitam la el ca la clasa Animal
//***		dog2.saySomething();		// aici va da eroare
		// virsta e 2 deoarece asta e valoarea din costructorul 2 din Animal
		System.out.println("dog2: nume = " + dog2.getNume() + ", virsta = " + dog2.getVirsta());
		
		Dog dog3 = (Dog) dog2;  // dog 3 e definit ca Dog si serverte ca referinta la obiectul dog2 dar trebuie de indicat implicit prin cast		
		System.out.println("dog3: nume = " + dog3.getNume() + ", virsta = " + dog3.getVirsta());		
		// am facut cast la Dog ca sa avem acces la metoda saySomething
		dog3.saySomething();
	}

}
