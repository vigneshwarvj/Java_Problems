package day08.practice;

//Write a Java program that prints the first 10 natural numbers using a for loop.

public class NaturalNumbersInForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("First 10 Natural Numbers:");
		
		//We can give int i = 1; and call i instead of naturalNumbers;
		
		for(int naturalNumbers = 1; naturalNumbers <= 10; naturalNumbers++) {
			System.out.println(naturalNumbers);
		}
	}

}
