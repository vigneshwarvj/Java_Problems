package day12.solved;

public class NumberValidationDemo {

	public static void main(String[] args) {

		long input = 6677889900l;

		if (input >=1 && input <= 10) {
			System.out.println("The number is within the range [1, 10]");
		} else {
			System.out.println("The number is outside the range [1, 10]");
		}

	}
}
