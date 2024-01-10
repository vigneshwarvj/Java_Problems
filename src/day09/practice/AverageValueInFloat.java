package day09.practice;

//Write a Java program that takes an array of floating-point numbers as input and calculates the average of the numbers. 
//Print the average value.

public class AverageValueInFloat {

	public static void main(String[] args) {

		double[] numbers = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };

		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		double average = sum / numbers.length;
		
		System.out.println(average);
	}
	
}
