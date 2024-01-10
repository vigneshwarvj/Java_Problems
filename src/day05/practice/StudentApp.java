package day05.practice;


public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetail student1 = new StudentDetail("VV", "vv@gmail.com");
		student1.toString();
		
		//student1.studentName = "Hello";
		student1.studentRollNo = 4534588990l;
		student1.gender = 'M';
		student1.age = 19;
		//student1.studentEmail = "hello@gmail.com";
		student1.percentage = 99.8;
		student1.height = 175.8;
		
		System.out.println(student1.toString());
		
		
		//Calculator
		Calculator calculator = new Calculator(4, 2);
		calculator.add(4, 2);
		calculator.subtract(4, 2);
		calculator.multiply(4, 2);
		calculator.divide(4, 2);

		calculator.toString();
		
	}

	

}
