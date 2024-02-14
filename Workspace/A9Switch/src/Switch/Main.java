package Switch;

public class Main {

	public static void main(String[] args) {

		//switch = statement that allows a variable to be tested for equality against a list o values
		
		String day = "Friday";
		
		//dentro al switch inserisci la variabile da testare
		switch(day) {
					
		case "Sunday": System.out.println("It's Sunday");
		break; //stoppa non fa altro, altrimenti continua a valutare
		case "Monday": System.out.println("It's Monday");
		break;
		case "Tuesday": System.out.println("It's Tuesday");
		break;
		case "Wednesday": System.out.println("It's Wednesday");
		break;
		case "Thursday": System.out.println("It's Thursday");
		break;
		case "Friday": System.out.println("It's Friday");
		break;
		case "Saturday": System.out.println("It's Saturday");
		break;
		
		default: System.out.println("No day present!"); //se nessuno matcha, avvia il default
		}
	}

}
