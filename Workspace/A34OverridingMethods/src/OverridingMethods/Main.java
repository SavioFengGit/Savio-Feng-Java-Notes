package OverridingMethods;

public class Main {

	public static void main(String[] args) {
		
		// method overriding = 	Declaring a method in sub class,
		//						which is already present in parent class.
		//						done so that a child class can give its own implementation
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		dog.speak(); //nella classe Dog è stato fatto l'override di una funzione della classe madre Animal
				
	}
}
