package Constructors;

public class Human {

	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight){ //costruttore, che inizializza tali variabili durante la creazione dell'oggetto
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
		
}
