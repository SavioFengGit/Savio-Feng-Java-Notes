package Constructors;

public class Main {

	public static void main(String[] args) {
		
		Human human1 = new Human("Rick",65,70); //posso assegnargli grazie al costruttore le sue variabili, altrimenti eredita quelle della classe madre
		Human human2 = new Human("Morty",16,50);
			
		human1.drink();
		human2.eat();
		System.out.println(human1.name); //l'oggetto creato puo avere le sue istanze, in quanto la classe ha il costruttore
		System.out.println(human1.age); // se non ci fosse il costruttore, age, name e weight sarebbero quelli della classe madre
		System.out.println(human1.weight);
	}
}
