package day08.practice;

//Write a Java program that prints the first 10 even numbers using a do-while loop.

public class EvenNumbersInDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("First 10 Even Numbers:");

		//Method 1;
		
//        int count = 1;
//        int number = 0;
//
//        do {
//            number += 2;
//            System.out.println(number);
//            count++;
//        } while (count <= 10);
        
		//Method 2;
		
		int i = 2;

		do {
			System.out.println(i);
			i = i + 2;
		} while (i <= 20);
	}
}
