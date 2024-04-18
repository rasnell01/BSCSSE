//imports
import java.util.Scanner;

//new class
class TemperatureConversion{
	
	//new main
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		double acceleration;
		double time;
		double distance;
		
		System.out.println("what is your acceleration?");
		acceleration = keyboard.nextDouble();
		
		System.out.println("what is your time in minutes?");
		time = keyboard.nextDouble();
				
		distance = (1.0 / 2.0) * acceleration * (time * time);
		System.out.println("It is " + temperatureCelcius + " degrees Celcius.");
		
	}//end main
	
}//end class