package day14.practice;

//Write a Java program to display the current date and time using the LocalDateTime class.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class CurrentLocalDateTime {

public static void main(String[] args) {
		
	  Date date = new Date();
	  System.out.println(date);		
		
	  LocalDate today = LocalDate.now();
	  System.out.println(today);
	  
	  LocalDateTime now = LocalDateTime.now();
	  System.out.println(now);

	}
}

