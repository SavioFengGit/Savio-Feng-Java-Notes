package StaticKeyword;

public class Friend {


	String name;
	
	static int numberOfFriends; //tale variabile static non sarà modificabile dagli oggetti, ma varrà per tutti gli oggetti creati
	
	Friend(String name){
		this.name=name;
		numberOfFriends++;
	}	
}
