package day12.practice;

//Write a Java method to validate an email address. A valid email address should contain '@' and '.' characters.

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String email = "vignesh.vijay@globalfuncity.com";
		String regex = "^.*@.*\\..*$";
		
		System.out.println(email);

		Boolean isEmailMatch = Pattern.matches(regex, email);

		if (isEmailMatch) {
			System.out.println("The email address is: Valid");
		} else {
			System.out.println("Sorry, The email address is: Invalid");
		
	}

}
}
