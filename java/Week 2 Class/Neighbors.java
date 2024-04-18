//imports
import java.util.Scanner;

//new class
class Neighbors{
		
	//new main
	public static void main(String[] args){
		
		int totalHouses;
		int houses;
		int blocks;
		int subdivisions;
		int cities;
		Scanner Keyboard = new Scanner(System.in);
		
		final int HOUSES_PER_CITY = 8640;
		final int HOUSES_PER_SUBDIVISION = 288;
		final int HOUSES_PER_BLOCK = 24;
		
		
		System.out.println("How many houses? ");
		totalHouses = keyboard.nextInt();
		System.out.println(totalHouses + " total houses.");
		
		
		int temp;
		
		temp = totalHouses;
		cities = temp / HOUSES_PER_CITY; 
		temp = temp % HOUSES_PER_CITY;
		subdivisions = temp / HOUSES_PER_SUBDIVISION;
		temp = temp % HOUSES_PER_SUBDIVISION;
		blocks = temp / HOUSES_PER_BLOCK;
		houses = temp % HOUSES_PER_BLOCK;
		
		System.out.println("# of Cities: " + cities);
		System.out.println("# of Subdivisions: " + subdivisions);
		System.out.println("# of Blocks: " + blocks);
		System.out.println("# of Houses: " + houses);
		
	}//end main
	
}//end class

