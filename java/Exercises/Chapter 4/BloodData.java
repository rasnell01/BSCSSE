//imports

//new class 
public class BloodData {

	

	static String bloodType;
	static char rhFactor;

	public BloodData(String bloodType, char rhFactor){

		this.bloodType = bloodType;
		this.rhFactor = rhFactor;

	}

	@Override
	public String toString() {

		return " [" + bloodType + ", " + rhFactor + "] ";

	}

}//end class
