package day12.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	public boolean isName;
	public boolean isEmail;
	public boolean isPhone;
	public boolean isPassword;
	public boolean isId;

	// validate Name
	public boolean isNameValid(String newName) throws IllegalArgumentException {
		try {
			if (newName == null || newName.isBlank()) {
				throw new IllegalArgumentException("Name Can not be Null or Empty");
			}
			String regexPattern = "^[a-zA-Z]{3,25}$";
			Pattern ptn = Pattern.compile(regexPattern);

			Matcher matcher = ptn.matcher(newName);
			if (!matcher.matches()) {
				throw new IllegalArgumentException("Name Should be match the Pattern");

			}
			isName = true;
			return true;

		} catch (RuntimeException e) {
			isName = false;
			return false;

		}

	}

	// validate Email
	public boolean isEmailValid(String newEmail) throws IllegalArgumentException {
		try {
			if (newEmail == null || newEmail.isBlank()) {
				throw new IllegalArgumentException("Email Can not be Null or Empty");
			}
			String regexPattern = "^.*@.*\\..*$";
			Pattern ptn = Pattern.compile(regexPattern);

			Matcher matcher = ptn.matcher(newEmail);
			if (!matcher.matches()) {
				throw new IllegalArgumentException("Email Should be match the Pattern");

			}
			isEmail = true;
			return true;

		} catch (RuntimeException e) {
			isEmail = false;
			return false;

		}

	}

	// validate Phone Number
	public boolean isPhoneValid(long newPhone) throws IllegalArgumentException {
		try {
			if (newPhone < 6000000000l || newPhone > 9999999999l) {
				throw new IllegalArgumentException("Enter valid Phone Number");
			}
			isPhone = true;
			return true;

		} catch (RuntimeException e) {
			isPhone = false;
			return false;

		}

	}

	// validate password
	public boolean isPasswordValid(String newPassword) throws IllegalArgumentException {
		try {
			if (newPassword == null || newPassword.isBlank()) {
				throw new IllegalArgumentException("Password Can not be Null or Empty");
			}
			String regexPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
			Pattern ptn = Pattern.compile(regexPattern);

			Matcher matcher = ptn.matcher(newPassword);
			if (!matcher.matches()) {
				throw new IllegalArgumentException("Password Should be match the Pattern");

			}
			isPassword = true;
			return true;

		} catch (RuntimeException e) {
			isPassword = false;
			return false;

		}

	}

	// validate ID
	public boolean isIdValid(int newId) throws IllegalArgumentException {
		try {
			if (newId < 00000 || newId > 99999) {
				throw new IllegalArgumentException("Enter valid Phone Number");
			}
			isId = true;
			return true;

		} catch (RuntimeException e) {
			isId = false;
			return false;

		}

	}

}

