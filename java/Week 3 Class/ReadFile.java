//import
import java.util.Scanner;

//new class
class ReadFile{
	
	//new main
	public static void main(String[] args){
		
		Scanner inputSource = new Scanner(System.in);
		double ageCount = 0;
		double payCount = 0;
		
		String nameA = inputSource.nextString();
		Double ageA = inputSource.nextDouble();
		ageCount++;
		Double payA = inputSource.nextDouble();
		payCount++;
		
		String nameB = inputSource.nextString();
		Double ageB = inputSource.nextDouble();
		ageCount++;
		Double payB = inputSource.nextDouble();
		payCount++;
		
		String nameC = inputSource.nextString();
		Double ageC = inputSource.nextDouble();
		ageCount++;
		Double payC = inputSource.nextDouble();
		payCount++;
		
		System.out.println("The average age is: " + averageAge(ageA, ageB, ageC, ageCount));
		System.out.println("The average pay is: " + averagePay(payA, payB, payB, payCount));
		
	}//end main
	
	//new method
	public static averageAge(double ageA, double ageB, double ageC, double ageCount){
		
		
		double sumOfages = ageA + ageB + ageC;
		double averageAge = sumOfages / ageCount;		
		
		return averageAge;
	}//end method averageAge
	
	//new method
	public static averagePay(double payA, double payB, double payC, double payCount){
		
		double sumOfPay = payA + payB + payC;
		double averagePay = sumOfpay / payCount;
			
		
		return averagePay;
	}//end method averagePay
}//end main