//imports
import java.util.Scanner;
//new class for driver
public class TestFitnessTracker {
	
	//new main
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the activity that you did? ");
		FitnessTracker.activityType = keyboard.next();
		System.out.println("How many minutes did you do this activity for? ");
		FitnessTracker.minutesOfExercise = keyboard.nextInt();

		System.out.println("You did " + FitnessTracker.activityType + " for " + FitnessTracker.minutesOfExercise + " minutes. ");

	}//end main
	
}//end class 
