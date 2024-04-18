import java.util.Scanner;

class LargestNumber{
	
	public static void main(String[] args){
		
		Scanner keyboard = new keybaord(System.in);
		int numberA;
		int numberB;
		
		System.out.println("Enter the first integer: ");
		numberA = keyboard.nextInt();
		System.out.println("Enter the second integer: ");
		numberB = keyboard.nextint();
		
		if(numberA > numberB)
			System.out.println(NumberA + " is the larger number. ");
		else if(numberB > numberA)
			System.out.println(NumberB + " is the larger number. ");
		else(numberA = numberB)
			System.out.println("the numbers are equal");
		
	}//end main
	
}//end class