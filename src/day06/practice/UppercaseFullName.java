package day06.practice;

//Write a Java program that takes a predefined string "John Doe", and prints the full name in uppercase.

public class UppercaseFullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method 1
//		String fullName = "John Doe";
//		String uppercaseFullName = fullName.toUpperCase();
//		
//		System.out.println(uppercaseFullName);
		
		//Method 2
		String firstName = "John";
		String lastName = "Doe";
		
		String fullNameUppercase = firstName.concat(" " +lastName);
		
		System.out.println(fullNameUppercase.toUpperCase());
	}

}
