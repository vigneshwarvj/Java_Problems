package day07.practice;

//Write a Java program that reads an integer. If the number is positive, print "The number is positive." 
//If the number is negative, print "The number is negative." 
//If the number is zero, print "The number is zero."

public class IntegerPrintsPositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 19;
		
		if(age > 0) {
			System.out.println("The number is Positive!");
		} else if(age < 0) {
			System.out.println("The number is Negative!");
		} else {
			System.out.println("The number is Zero!");
		}
	}

}
