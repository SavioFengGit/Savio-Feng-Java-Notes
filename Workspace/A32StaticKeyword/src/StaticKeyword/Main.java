package StaticKeyword;

public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Patrick");
		
		System.out.println(Friend.numberOfFriends); //tale valore sarà uguale per tutti gli oggetti creati "friend1,2,3", in quanto 
		// è static e quindi appartiene alla classe e non agli oggetti
		// System.out.println(Friend1.numberOfFriends); //questo è sbagliato perchè appunto non è un metodo dell'oggetto
		
	}
}
