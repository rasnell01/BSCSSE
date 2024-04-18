//imports
import java.util.Scanner;

//new class
class Property{
	
	private String name;
	private int houseCount;
	private int hotelCount;
	
	//default constructor
	public Property(){
		
		name = Default;
		houseCount = 0;
		hotelCount = 0;
		
		
	}//default constructor
	//new constructor
	public Property(String name, int houseCount, int hotelCount){
		
		this.name = name;
		this.houseCount = houseCount;
		this.hotelCount = hotelCount;
		
	}//end Constructor
	
	//*************************************************************
	public void getInformation(Scanner keyboard){
		
		private String phrase;
		
		System.out.println("Enter a name for property: ");
		name = keyboad.nextLine();
		
		System.out.println("Enter the number of houses:  ");
		phrase = keyboard.nextLine();
		houseCount = Integer.parseInt(Phrase);
		
		System.out.println("Enter the number of hotels: ");
		phrase = keyboard.nextLine();
		hotelCount= Integer.parseInt(Phrase);
		name;
		houseCount;
		hotelCount;
		
	}//end method getInformation
	
	//*************************************************************
	@Override
	public String toString(){
		
		
		return "[nme : " + name + ", houses: " + houseCount + ", hotels : " + hotelCoount + "]";
	}//end 
	
	
	//***********************************************************
	//For ttesting purposes only
	public static void main(String[] args){	
		
		Property myProperty = new Property("Fan's", 3, 7);
		
		System.out.println(myProperty);
		
	}//end main
	
}//end class