package Input;


import java.util.Scanner; 
public class Input {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in); //crea l'oggetto di tipo scanner
	
	System.out.println("What's your name? ");
	
	String name = scanner.nextLine(); //input da tastiera
	
	System.out.println("Welcome " + name + "\n");
	
	
	System.out.println("How old are you? ");
	
	int age = scanner.nextInt(); //input età
	scanner.nextLine(); //trova il carattere di fine riga non letta dal nextInt
	
	System.out.println("Oh you are " + age + "\n");
	
	
	System.out.println("What's your favourite colour? ");
	
	String colour = scanner.nextLine(); //input da tastiera
	
	System.out.println("Yes i like the colour " + colour + "\n");
	
	
	scanner.close (); // Chiude lo scanner
	
	
	
	// se esegui uno scanner line, e poi uno scanner int e di nuovo uno scanner line, 
	// il terzo non funzionerà perchè lo scanner int, non va a leggere \n, 
	// per sistemare questa cosa bisogna aggiungere uno scanner.nextLine() alla fine
	// di ogni scanner int
	
	}
	
	
}
