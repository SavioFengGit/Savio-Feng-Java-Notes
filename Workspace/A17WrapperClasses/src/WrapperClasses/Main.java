package WrapperClasses;

public class Main {

	public static void main(String[] args) {
		// Conviene utilizzare i data types primitivi, in quanto ci fornisce dei metodi utili che possono essere utilizzate
		
		// wrapper class = 	provides a way to use primitive data types as reference data types
		//					reference data types contain useful methods
		//					can be used with collections (ex.ArrayList)
		//Ogni primitive corrisponde ad un wrapper 
		//primitive		//wrapper
		//---------		        //-------
		// boolean		Boolean
		// char			Character
		// int			Integer
		// double		Double
		
		// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
		
		//Utilizziamo l'autoboxing, basta semplicemente definirli direttamente con il wrapper
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		//String is already an reference data type, infatti inizia con la lettera maiuscola
		String e = "Savio";
		
		
		Integer test = a.compareTo(true); //esempio di metodo utilizzabile in quanto a è wrapper class
		System.out.println("Result: " + test);
		
		
		
		//Vediamo l'unboxing, if si aspetta una variabile boolean, quindi dal wrapper lo converte in primitive.
		//nel nostro caso a che era Boolean diventerà boolean.
		if(a==true) {
			
			System.out.println("This is true");
			
		}
	}
	
}