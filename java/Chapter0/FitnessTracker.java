//imports
import java.time.LocalDate;
import java.time.Month;

//new class 
public class FitnessTracker {
			
	FitnessTracker tracker = new FitnessTracker();
	int minutesParticipation = 0;
	String activityType;
	LocalDate date = LocalDate.of(2024, Month.JANUARY, 01);

    //getter method
	private String getActivityType(String activityType){

		return activityType;
	}//end getter method

	//new object
	private int getMinutesParticipation(int minutesParticipation){

		return minutesParticipation;
	}//end getMinutesParticipation
	//default constructor
	private FitnessTracker(){

	}
	//end default constructor

	
}//end class
