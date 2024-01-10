package day12.practice;

//Write a Java method to validate a password. A valid password should contain at least one uppercase letter, one lowercase letter, 
//one digit, and one special character, and it should be at least 8 characters long.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
        String password = "Vig@1234";   //true     //1 uppercase, 1 lowercase, numbers, special character and 8 char 
        
        PasswordValidation verifyPassword = new PasswordValidation();
        
        System.out.println(verifyPassword.isPasswordValid(password));
    }
    
       public boolean isPasswordValid(String password) throws IllegalArgumentException {
    	try {
    		if(password == null || password.isBlank()) {
    			throw new IllegalArgumentException("Password cannot be empty");
    		}
    	
    	
    	String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8}$";
    	Pattern ptn = Pattern.compile(passwordPattern);
    	
    	Matcher matcher = ptn.matcher(password);
    	
    	if(!matcher.matches()) {
    		System.out.println("Password does not match the expected pattern");
    		return false;
    	}
    	System.out.println(password);
    	return true;
    } catch (RuntimeException e) {
    	return false;
    }
}
}
