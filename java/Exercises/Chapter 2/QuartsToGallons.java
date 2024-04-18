//imports

//new class
class QuartsToGallons {

    //new main
    public static void main(String[] args){

        int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        int quartsLeft;

        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        quartsLeft = quartsNeeded % QUARTS_IN_GALLON;

        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + quartsLeft + " quarts");

    }//end main

}//end class
