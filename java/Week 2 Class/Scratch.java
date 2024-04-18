//imports
import java.util.Scanner;

//new class
class Scratch{
	
	public static void main(Strings[] args){
		
		int numberA;
		int numberB;
		int resultA;
		int resultB;
		int result;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("please enter the first interger");
		numberA = keyboard.nextInt();
		
		System.out.println("please enter the second integer");
		numberB = keyboard.nextint();
		
		System.out.println("The result is: " + result);
		
		
	}//end main
	
	//new method
	public static calculateResult(int result){
		
		resultA = numberA * numberB;
		resultB = numberA + numberB;
		result = resultA - resultB;
		
		return;
		
	}//end method calculateResult
	
}//end class