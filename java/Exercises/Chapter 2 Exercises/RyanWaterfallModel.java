//Ryan Snell
//12 Feb 2024
//Chapter 2 Exercise

//imports
import java.util.*;

//new class
class RyanWaterfallModel{

    //new main
    public static void method(String[] args){

        //String[] waterfallSteps = {"Requirement Analysis", "System Design", };
        ArrayList<String> waterfallSteps = new ArrayList<>();
        waterfallSteps.add("requirement analysis");
        waterfallSteps.add("system design");
        waterfallSteps.add("program design");
        waterfallSteps.add("coding");
        waterfallSteps.add("unit and integration testing");
        waterfallSteps.add("acceptance testing");
        waterfallSteps.add("operation and maintenance");

        ArrayList<String> tempList = new ArrayList<>();
        tempList.addAll(WaterfallSteps);
        Collections.suffle(tempList);

        System.out.println("Here are the eight steps, please type them in, in the correct order seperated by a space.");
        for(int i = 0; i < templist.size(); i++){

            System.out.println("" + tempList.get[i]);
	
	
        private static attempts{

                //prompt the user
                Scanner keyboard = new Scanner(System.in);
                int chances = 0;
                int MAX_ATTEMPTS = 4;
                StringBuilder control = new StringBuilder();
                for (int i = 0; i < waterfallSteps.size(); i++){

                    control.append(waterfallSteps[i]);
                    control.append(" ");

                }//end for loop
                control.toString();
                answer.toString();

                while (chances < MAX_ATTEMPTS){


                    System.out.println("Please type your answers in the correct order," +
                            " with spaces in between the answers.");
                    String answer = keyboard.nextLine();

                    //if the user replies correctly
                    if (control .= answer){

                        System.out.println("Congratulations! You have answered correctly!");
                        break;
                    } else {

                        chances++;
                        System.out.println("Sorry, that is not the correct order.");

                    }//end if

                    break;

                }//end while loop

            }//end method attempts

        }//end main

    }//end class


	