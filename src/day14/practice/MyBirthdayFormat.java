package day14.practice;

//Write a Java program to create a LocalDate object representing your birthday.

import java.time.LocalDate;

public class MyBirthdayFormat {

	public static void main(String[] args) {
        
        int year = 2003;
        int month = 12; 
        int day = 24;
        
        LocalDate birthday = LocalDate.of(year, month, day);
        
        // Print the birthday
        System.out.println("My birthday is on " + birthday);
    }
}
