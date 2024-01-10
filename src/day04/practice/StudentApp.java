package day04.practice;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetail1 student = new StudentDetail1();

		// Set student details using setter methods
		student.setName("Vignesh VV");
		student.setStudentRollNo(4534588);
		student.setStudentGender('M');
		student.setStudentAge((byte) 19);
		student.setStudentEmail("vignesh@gmail.com");
		student.setPercentage(99.8);
		student.setHeight(175.0);

		System.out.println(student.toString());
		// Calculator
		Calculator calc = new Calculator();

		int addResult = calc.add(5, 7);
		System.out.println("AddResult : " + addResult);

		int subResult = calc.sub(21, 5);
		System.out.println("SubResult : " + subResult);

		int multiplyResult = calc.multiply(8, 11);
		System.out.println("MultiplyResult : " + multiplyResult);

		int divideResult = calc.divide(20, 7);
		System.out.println("DivideResult : " + divideResult);

	}

}
