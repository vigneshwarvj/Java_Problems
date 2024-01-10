package day08.practice;

//Write a Java program that calculates the sum of first 10 natural numbers and prints the result.

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum of the first 10 natural numbers: " + sum);
	}

}
