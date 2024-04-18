//imports
import java.util.Scanner;

//new class
class ShadyRestRoom{
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		final double QUEEN_COST = 125;
		final double KING_COST = 139;
		final double KING_COUCH_COST = 165;
		String option;
		int option2;
		double roomCost;
		boolean bedEntryIsValid = false;

		//room selection
		System.out.println("What kind of room do you want? ");
		System.out.println("1. Queen at $125 per night");
		System.out.println("2. King at $139 pre night.");
		System.out.println("3. King with a pullout couch at $139 pre night.");
		System.out.println();
		System.out.print("Enter the number of your selection.");
		option = keyboard.nextLine();

	switch (option){
		case "1": roomCost = QUEEN_COST;
			bedEntryIsValid = true;
			break;
		case "2": roomCost = KING_COST;
			bedEntryIsValid = true;
			break;
		case "3": roomCost = KING_COUCH_COST;
			bedEntryIsValid = true;
			break;
		default: roomCost = 0;
			System.out.println("Your selection wasn't out of bounds.");
			break;
		}//end switch
		
		if (bedEntryIsValid){

			//view selection
			System.out.println("Which view would you like? ");
			System.out.println("1. Lake view. $15 plus room cost.");
			System.out.println("2. Park view. no addition to your room cost.");
			System.out.println();
			System.out.println("Enter the number of your selection. ");
			option2 = keyboard.nextInt();

			switch (option2){

				case 1: roomCost = roomCost + 15;
					break;
				case 2: roomCost = roomCost;
					break;
				default: roomCost = roomCost + 15;
					break;
			}

			System.out.println("Your room cost is: " + roomCost);

		}//end if


	}//end main
	
}//end class