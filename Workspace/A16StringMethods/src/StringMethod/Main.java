package StringMethod;

public class Main {

	 public static void main(String[] args) {
	  
	  // String = a reference data type that can store one or more characters
	  //   		  a reference data types have access to useful methods
	  
	  String name = "Savio";
	  
	  
	  
	  
	  //1 ALLA VOLTA PER IL TESTING DI QUESTE FUNZIONI
	  //boolean result = name.equals("Savio"); //method che vedere se è uguale la stringa a qualche altra stringa
	  //int result = name.length(); //da in output la lunghezza della stringa
	  //char result = name.charAt(0); //mostra la prima lettera
	  //int result = name.indexOf("o"); //in che posizione è la lettera o?
	  //boolean result = name.isEmpty(); //controlla se è vuota la stringa
	  //String result = name.toUpperCase(); //mette in upper
	  //String result = name.toLowerCase(); //mette in lower
	  //String result = name.trim(); //elimina gli spazi vuoti
	  String result = name.replace('o', 'a'); //sostituisce la o con la a
	   
	  System.out.println(result);
	 }
	 
	}
