package day14.practice;

//Write a Java program that uses the Date class to print the current date and time in the following format: 
//"Today's date is MM/DD/YYYY and current time is HH:MM:SS".

import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentDateTimeInTheFormat {

	public static void main(String[] args) {
		Date currentDate = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		String fDate = dateFormat.format(currentDate);

		System.out.println(fDate);

	}

}
