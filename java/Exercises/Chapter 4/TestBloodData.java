//imports
import java.util.Scanner;

//new class driver
public class TestBloodData {
	
	//new main
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		String typeO = "O";
		String bloodType;
		char rhPos = '+';
		String rhType;
		BloodData bloodDataA = new BloodData("O", '-');
		BloodData bloodDataB = new BloodData("B", '+');

		System.out.println("What is your blood type? ");
		bloodType = keyboard.next();
		System.out.println("is it + or -? ");
		rhType = keyboard.next();
		System.out.println("You are: " + bloodType + rhType);

		System.out.println("The blood type is: " + typeO + rhPos);
		System.out.println(bloodDataA);
		System.out.println(bloodDataB);
	}//end main

}//end class driver
