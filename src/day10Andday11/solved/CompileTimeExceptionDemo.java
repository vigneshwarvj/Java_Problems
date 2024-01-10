package day10Andday11.solved;

//Checked Exception example

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeExceptionDemo {

	public static void main(String[] args) {
		 try {
			FileReader fileReader = new FileReader("example.txt"); // This line may throw a FileNotFoundException
			
		 } catch (FileNotFoundException e) {
		 	e.printStackTrace(); // Handle the exception by printing the stack trace
		 }
	}
}
