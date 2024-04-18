import java.util.Scanner;

class TableBuilder{
	
	public static void main(String[] args){
		
		int[] testTableA = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] testTableB = {23, 56, 3, 7, 15, 31, 21, 54, 8, 78};
		
		displayContents(testTableA);
		makeEven(testTableB);
	}//end main
	
	//_______________________________________________________________________
	private static void displayPowersTable(int[] table){
		
		int squared;
		int cubed;
		int number;
		for (int i = 0; i< table.length; i++){
			
			number = table[i];
			squared = number * number;
			cubed = squared * number;
			System.out.printf("%4d  %6d  %10d	\n", number, squared, cubed);
			
		}//end for loop
		
	}//end method
	
	//-----------------------------------------------------------------------
	private static void makeEven(int[] table){
		
		for (int i = 0; i< table.length; i++){
			
			number = table[i];
			if (number % 2 == 0)
				countinue;
			else
				table[i] = number + 1;
			
		}//end for loop
		
	}//end method
	
	//--------------------------------------------------------------------------
	private static void displayContents(int[] table){
		
		for (int i = 0; i< table.length; i++){
			
			System.out.print( "[" + table [i] + "]");

		}//end for loop
		
		System.out.println();
	
	}//end method
	
}//end class