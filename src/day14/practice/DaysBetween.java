package day14.practice;

//Write a Java program to calculate the number of days between two LocalDate objects.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetween {

	public static void main(String[] args) {
       
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 12, 31);
        
        //number of days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        
        System.out.println("Number of days between " + date1 + " and " + date2 + ": " + daysBetween);
    }
}
