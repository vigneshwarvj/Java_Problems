package day10Andday11.solved;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		try {
			String ageStr = "Twenty";
			int age = Integer.parseInt(ageStr);// Throws an NFE exception
			System.out.println("Age convered" + age);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
