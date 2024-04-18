//imports
import java.util.Scanner;
import java.time.Clock;

//new class
class manyParts{
	
	//new main
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		int number;
		
		displayWelcomeMessage(welcomeMessage);
		
		number = getInformationFromUser();
		
		result = preformCalculations(number);
		
		displayReport(result);
		
	}//end main
	
	//new method
	public welcomeMessage(TIME_OF_DAY){
		
		//new if elses
		if (TIME_OF_DAY >= 0000 && < 1200);
			System.out.println("Good moring! ")
		else ( TIME_OF_DAY >= 1200 && < 1700);
			System.out.println("Good afternoon!");
		else (TIME_OF_DAY >= 1700 && < 2000);
			System.out.println("Good Evening!");
		else (TIME_OF_DAY >=2000 && < 0000);
			System.out.println("Good Night!");
		
	}//end mehtod welcomeMessage
	
	
	//new method
	public static informationFromUser(){
		
		userName = keyboard.nextString;
		userPassword = keyboard.nextString;
		
		//setup the user and password input and check methods
		
	}//end method informationFromUser
	
	//new method
	public static calculations(number){
		
		//whatever calculations need done
		
	}//end method calculations
	
	//new method
	public report(){
		
		//captures the information from the user and the pertinent information from
		//the other sources that are needed.
		
	}//end method
	
}//end class
