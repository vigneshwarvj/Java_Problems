package day12.solved;

import java.util.regex.Pattern;

public class EmailValidationDemo {

	public static void main(String[] args) {

		String email = "surya.umapathy@freshworks.com";
		String regex = "^.*@.*\\..*$";

		Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			System.out.println("The email address is: Valid");
		} else {
			System.out.println("The email address is: Invalid");
		}

	}
}
