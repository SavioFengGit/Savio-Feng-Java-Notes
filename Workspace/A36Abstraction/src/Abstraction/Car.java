package Abstraction;

public class Car extends Vehicle{

	@Override //qui avviene l'implementazione del metodo definito nella classe madre
	void go() {
		System.out.println("The driver is driving the car");
		
	}
}
