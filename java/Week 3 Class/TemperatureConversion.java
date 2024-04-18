//imports
import java.util.Scanner;

//new class
class TemperatureConversion{
	
	//new main
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		double temperatureCelcius;
		double temperatureFahrenheit;
		
		System.out.println("what is the temperate in Fahrenheit?");
		temperatureFahrenheit = keyboard.nextDouble();
		
		temperatureCelcius = 5/9 * (temperatureFahrenheit - 32);
		System.out.println("It is " + temperatureCelcius + " degrees Celcius.");
		
	}//end main
	
}//end class