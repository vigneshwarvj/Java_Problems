package day06.practice;

//Write a Java program that takes a predefined string "surya umapathy", and capitalizes the first letter of the first and last names to output "Surya Umapathy". 
//Assume the first name and last name are separated by a space.

public class CaptializeTheFirstLetterInName {

	public static void main(String[] args) {
		
	String fullName = "vigneshwar vijayakumar";

	String newName = fullName.toUpperCase();
	int findSpace = fullName.indexOf(" ");
	int findSpace2 = findSpace + 1;

	String output = newName.charAt(0) + fullName.substring(1, findSpace) + " " + newName.charAt(findSpace2)
			+ fullName.substring(findSpace2 + 1);

	System.out.println(output);
	
}

}