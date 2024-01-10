package day12.solved;

public class StringValidationDemo {

	public static void main(String[] args) {

		String input = "Surya";

		//Method 1 In the 11 line, it shows dead code.
//		if (input == null) {
//			System.out.println("The input String is Null");
//		} else if (input.trim().isEmpty()) {
//			System.out.println("The input String is Empty");
//		} else {
//			System.out.println("The Input String is: " + input);
//		}
		
		//Method 2
		if (input.trim().isEmpty()) {
			System.out.println("The input String is Empty");
		} else {
			System.out.println("The Input String is: " + input);
		}

	}
}
