package OverloadMethods;

public class Main {

	public static void main(String[] args) {
		
		// overloaded methods = methods that share the same name but have different parameters
		//						method name + parameters = method signature
		
		double x = add(1.2,1.55); //caso del metodo con 2 argomenti double
		
		System.out.println(x);
		
	}
	
	
	
	//definizione dei metodi add, in base a quanti argomenti e al data types degli argomenti, lui capisce quale metodo utilizzare
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}	
}