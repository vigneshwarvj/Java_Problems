package day06.practice;

//Write a Java program that takes your firstname and lastname and concatenates them into your fullname.

public class MyNameIntoConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Vigneshwar";
		String lastName = "Vijayakumar";
		
		String fullName = firstName.concat(" " + lastName);
		
		System.out.println(fullName);

	}

}
