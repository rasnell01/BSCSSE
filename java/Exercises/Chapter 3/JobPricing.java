//imports
import java.util.Scanner;

//new class
public class JobPricing {

    //new main
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        double travelTime;
        double costOfMaterials;
        double workingTime;

        System.out.println("***************** Renew Your Home Company job estimate software *****************\n");
        System.out.println("What is the name of the job?");
        String jobName = keyboard.nextLine();

        System.out.println("How many hours of travel? ");
        travelTime = keyboard.nextDouble();

        System.out.println("What is the cost of the materials? ");
        costOfMaterials = keyboard.nextDouble();

        System.out.println("How many hours of work will it take? ");
        workingTime = keyboard.nextDouble();

        System.out.println("The estimated cost of the job " + jobName +" is: $" + jobEstimate
                (travelTime, costOfMaterials, workingTime));

    }//end main

    //new method to calculate the cost estimate of the job
    public static double jobEstimate(double travelTime,double costOfMaterials, double workingTime) {

        final int HOURLY_RATE = 35;
        final int TRAVEL_RATE = 12;
        double jobEstimate;
        double travelTimeCost;
        double manpowerCost;

        manpowerCost = HOURLY_RATE * workingTime;
        travelTimeCost = TRAVEL_RATE * travelTime;
        jobEstimate = costOfMaterials + travelTimeCost + manpowerCost;

        return jobEstimate;
    }//end method jobEstimate

}//end class
