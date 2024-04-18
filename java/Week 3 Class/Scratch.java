class Name{
	private String bloodType;
	private String rHFactor;
	
	constructor(){
		setting up the object to start;
	}//end constructor
	
	constructor( , ){
		setting up the object to start;	
	}//end constructor
	//not always used
	public getBloodType();
	public setBloodType( , );
}//end class

//using a class as a record.
//the person.java 
class Person
{
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String Lastname){
		
		this.firstName = John;
		this.lastName = Doe;
		
	}
	
	public Person(String firstName, String Lastname){
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
}

class Driver{
	public static void main(String[] args){
		Person PersonA = new Person();
		Person PersonB = new Person("Mike", "Smith");
		
		
	}//end main
	
	@Override
	public String toString(){
		
		return " [" + firstName + ", " + lastName + "] ";	
		
	}
	
}//end class

class Couple{
	
	private Person personA;
	private Person personB;
	
	public Couple(Person personA, Person personB){
		
		this.personA = personA;
		this.personB = personB;
		
	}
}//end class
/*
in side the main
create PersonA
create PersonB
create Couple(PersonA, PersonB)
*/