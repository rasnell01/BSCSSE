//imports
import java.util.Scanner;

//new class
class HotelRules{
	
	//new main
	public static void main(String[] args){
		
		//declare variables
		Property propertyA;
		Property propertyB;
		Property propertyC;
		
		Scanner keyboard = new Scanner(System.in);
		
		//prompt user and get information on properties
		propertyA = new Property();
		System.out.println(">>>>> Property A: ");
		propertyA.getInformation(keyboard);
		
		//ask about the hotel and which propterty to put it on
		
		//put the hotel on the property
		
		//display report
		System.out.println();
		System.out.println("***** REPORT SUMMARY *****");
		System.out.println("Property A: " + propertyA);
	}//end main
	
}//end class