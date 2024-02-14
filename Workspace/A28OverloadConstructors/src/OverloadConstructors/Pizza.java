package OverloadConstructors;

public class Pizza {


	String bread;
	String sauce;
	String cheese;
	String topping;
	
	Pizza(){
		
	}
	// faccio l'overload del costruttore in modo tale, da poter istanziare solo quello che desidero durante la creazione dell'oggetto
	Pizza(String bread){
		
		this.bread = bread;
	}
	
	Pizza(String bread,String sauce){
		
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread,String sauce,String cheese){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	Pizza(String bread,String sauce,String cheese,String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
}