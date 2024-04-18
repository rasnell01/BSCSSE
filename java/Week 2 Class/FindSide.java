//imports
import java.util.scanner;

//new class
class FindSide{
	
	//new main
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		double sideB;
		double sideC;
		double result;
		
		System.out.println("What is the length of the first side? ");
		sideB = keyboard.nextDouble();
		
		System.out.println("What is the length of the first side? ");
		sideC = keyboard.nextDouble();
		
		result = calculateSideA(sideC, sideB);
		System.out.println("The third side of the triangle is: " + result);
		
	}//end main
	
	//test stubbing
	private static calculateSideA(double sideC, double sideB){
		
		//a^2 + b^2 = c^2
		//a^2 = c^2 - b^2
		double sideA;
		double sideA2;
		
		sideA2 = (sideC * sideC) - (sideB * sideB);
		sideA = Math.sqrt(sideA2);
		
		return sideA;
	}
	//new method
	
}//end main