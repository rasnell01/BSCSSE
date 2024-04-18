//imports
import java.time.LocalDate;
import java.time.Month;

//new class
public class FitnessTracker {

    FitnessTracker tracker = new FitnessTracker();
    static int minutesOfExercise;
    static String activityType;
    LocalDate date = LocalDate.of(2024, Month.JANUARY, 1);

    //getMinutesOfExercise method
    private int getMinutesOfExercise(){

        return minutesOfExercise;

    }//end getMinutesOfExercise method

    //setMinutesOfExercise Method
    public void setMinutesOfExercise(int minutes){

        minutesOfExercise = minutes;

    }//end setMinutesOfExercise Method

    //getActivityType Method
    private String getActivityType(){

        return activityType;

    }//end getActivityType method

    //setActivityType
    public void setActivityType(String activity){

        activityType = activity;

    }

}//end class

