import java.util.ArrayList;
import java.util.List;

public class PayRateCalculator {

    public static void main(String[] args){

        List<Integer> payRates = new ArrayList<>();
        List<String> employees = new ArrayList<>();
        List<Integer> payment = new ArrayList<>();
        List<Integer> hours = new ArrayList<>();
        List<Integer> payStubs = new ArrayList<>();
        fillPayRate(payRates);
        fillEmployees(employees);
        calculatePayment(payment);
        fillHours(hours);
        payStubs.forEach(System.out::println);

    }//end main

    private static void fillPayRate(List<Integer> payRates){

        payRates.add(30);
        payRates.add(40);
        payRates.add(60);
        payRates.add(80);

    }//end method

    private static void fillEmployees(List<String> employees){

        employees.add("Joanne");
        employees.add("Jack");
        employees.add("Mike");

    }//end method

    private static void fillHours(List<Integer> hours){

        hours.add(25);
        hours.add(55);
        hours.add(70);

    }

    private static void calculatePayment(List<Integer> payment){

        //payment.add();
        //payment.add();
        //payment.add();

    }//end method

    private static void fillPayStubs(List<Integer> payStubs){


    }//end method

}//end class
