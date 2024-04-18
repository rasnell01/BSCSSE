import java.util.Scanner;

class MathTable{
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		int numberA;
		int numberB;
		int numberC;
		int numberD;
		int numberE;
		int tempA;
		int tempB;
		
		System.out.println("Please enter the first number: ");
		numberA = keyboard.nextInt();
		System.out.println("Please enter the first number: ");
		numberB = keyboard.nextInt();
		System.out.println("Please enter the first number: ");
		numberC = keyboard.nextInt();
		System.out.println("Please enter the first number: ");
		numberD = keyboard.nextInt();
		System.out.println("Please enter the first number: ");
		numberE = keyboard.nextInt();
		
		for(;;){
			tempA = numberA * numberA;
			tempB = numberA * numberA * numberA;
			System.out.println(numberA + ", " +tempA + ", " + tempB);
			break;
		}//end for
		for(;;){
			tempA = numberB * numberB;
			tempB = numberB * numberB * numberB;
			System.out.println(numberB + ", " +tempA + ", " + tempB);
			break;
		}//end for
		for(;;){
			tempA = numberC * numberC;
			tempB = numberC * numberC * numberC;
			System.out.println(numberA + ", " +tempA + ", " + tempB);
			break;
		}//end for
		for(;;){
			tempA = numberD * numberD;
			tempB = numberD * numberD * numberD;
			System.out.println(numberD + ", " +tempA + ", " + tempB);
			break;
		}//end for
		for(;;){
			tempA = numberE * numberE;
			tempB = numberE * numberE * numberE;
			System.out.println(numberE + ", " +tempA + ", " + tempB);
			break;
		}//end for
		
	}//end main
	
}//end class