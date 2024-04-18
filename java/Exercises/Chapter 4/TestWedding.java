//imports
import java.time.LocalDate;
import java.util.Scanner;

//new class
class TestWedding{

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		LocalDate date;
		int mo;
		int day;
		int year;
		String location;
		Person bride = new Person(name);
		Person groom = new Person(name);
		Couple aCouple = new Couple(bride, groom);
		Wedding aWedding = new Wedding(aCouple);

		System.out.println("what is the name of the Bride? ");
		name = keyboard.nextLine();

		System.out.println("what is the name of the Groom? ");
		name = keyboard.nextLine();

		System.out.println("Where is it going to take place? ");
		location = keyboard.nextLine();

		System.out.println("What is the year of the wedding? ");
		year = keyboard.nextInt();

		System.out.println("what is the month of the wedding? ");
		mo = keyboard.nextInt();

		System.out.println("what is the day of the wedding? ");
		day = keyboard.nextInt();
		date = LocalDate.of(year, mo, day);

		System.out.println(aWedding + " " + date + " " + location);
	}//end main

}//end class