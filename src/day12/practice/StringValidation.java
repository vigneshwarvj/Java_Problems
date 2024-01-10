package day12.practice;

//Write a Java method to validate a string length. The string should be minimum 5 characters and maximum 15 characters.

public class StringValidation {

    public static void main(String[] args) {
        String str = "Hello World"; //true, More than 15 char,it shows false 

        StringValidation stringValidation = new StringValidation();

        System.out.println(stringValidation.isStringValid(str));
    }

    public boolean isStringValid(String str) throws IllegalArgumentException {
        try {
            if (str == null || str.trim().isEmpty() || str.length() < 5 || str.length() > 15) {
                throw new IllegalArgumentException("Invalid string length");
            }

            System.out.println(str);
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
}

