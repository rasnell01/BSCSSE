//imports
import java.util.Scanner;

class AcmePay {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final double FIRST_SHIFT_PAY = 17.00;
        final double SECOND_SHIFT_PAY = 18.50;
        final double THIRD_SHIFT_PAY = 22.00;
        double hoursRegular;
        double hoursOvertime;
        double totalHours; //DISPLAY
        boolean retirementPlan = false;
        double retirementPlanDeduction;//3% is deducted from paycheck DISPLAY
        double regularPay; //hours times shift rate. DISPLAY
        double overtimePay; //hours overtime times (shift rate * 1.5) DISPLAY
        double netPay; //total of regular and overtime and retirement deduction DISPLAY
        int shift;
        double shiftWorked;
        double grossPay;
        int temp;

        //prompt user for hours worked.
        System.out.println("How many hours were worked? ");
        totalHours = keyboard.nextDouble();

        //prompt user for shift worked.
        System.out.println("Which shift did you work on? ");
        shift = keyboard.nextInt();

        //if the shift was 2 or 3 prompt user for rather or not to participate in the retirement plan.
        switch (shift){

            case 1 : retirementPlan = false;
                shiftWorked = FIRST_SHIFT_PAY;
                break;
            case 2 : System.out.println("Would you like to participate in the retirement plan? 0 for no 1 for yes");
                temp = keyboard.nextInt();
                shiftWorked = SECOND_SHIFT_PAY;
                    switch (temp){
                        case 0 : retirementPlan = false;
                            System.out.println("You have opted out of the retirement program. ");
                            break;
                        case 1 : retirementPlan = true;
                            System.out.println("You have opted into the retirement program. ");
                            break;
                        default: retirementPlan = false;
                            break;
                    }//end switch
                    break;
            case 3 : System.out.println("Would you like to participate in the retirement plan? 0 for no 1 for yes");
                temp = keyboard.nextInt();
                shiftWorked = THIRD_SHIFT_PAY;
                    switch (temp){
                        case 0 : retirementPlan = false;
                            System.out.println("You have opted out of the retirement program. ");
                            break;
                        case 1 : retirementPlan = true;
                            System.out.println("You have opted into the retirement program. ");
                            break;
                        default: retirementPlan = false;
                            break;
                    }//end switch
                    break;
            default: retirementPlan = false;
                shiftWorked = FIRST_SHIFT_PAY;
                break;
        }//end switch

        //display the shift worked
        System.out.println("you worked on shift: " + shift);

        //display the hourly pay rate
        System.out.println("your hourly pay rate on this shift is: " + shiftWorked);

        //display the regular pay
        //display the OT pay
        //display the total pay
        if (totalHours > 40){

            overtimePay = (totalHours - 40) * (shiftWorked * 1.5);
            regularPay = 40 * shiftWorked;
            grossPay = regularPay + overtimePay;
            hoursRegular = 40;
            hoursOvertime = totalHours - 40;
            System.out.println("You worked " + hoursRegular + " at $" + regularPay + " of regular hours. ");
            System.out.println("You worked " + hoursOvertime + " at $" + overtimePay + " of overtime hours. ");
            System.out.println("Your total pay before deductions is: $" + grossPay);

            //display the retirement deduction amount
            //display the net pay
            if (retirementPlan = false){

                netPay = grossPay;
                System.out.println("Your net pay is: $ " + netPay);

            } else if (retirementPlan = true){

                retirementPlanDeduction = grossPay * .03;
                System.out.println("Your retirement plan deduction amount is $" + retirementPlanDeduction);
                netPay = grossPay - retirementPlanDeduction;
                System.out.println("Your net pay is: $" + netPay);

            } else {

                System.out.println("What did you do? ");

            }

        } else if (totalHours <= 40 && totalHours > 0){

            hoursRegular = totalHours;
            regularPay = totalHours * shiftWorked;
            grossPay = regularPay;
            System.out.println("You worked " + hoursRegular + " at $" + regularPay + " of regular hours. ");
            System.out.println("Your total pay before deductions is: $" + grossPay);

            //display the retirement deduction amount
            //display the net pay
            if (retirementPlan = false){

                netPay = grossPay;
                System.out.println("Your net pay is: $ " + netPay);

            } else if (retirementPlan = true) {

                retirementPlanDeduction = grossPay * .03;
                System.out.println("Your retirement plan deduction amount is $" + retirementPlanDeduction);
                netPay = grossPay - retirementPlanDeduction;
                System.out.println("Your net pay is: $" + netPay);

            } else {

                System.out.println("What did you do now?");

            }//end if

        } else {

            System.out.println("you didn't work this pay period.");

        }//end if

    }//end main

}//end class

