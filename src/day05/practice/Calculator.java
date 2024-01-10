package day05.practice;

public class Calculator {
	int additionResult;
	int number1;
	int number2;
	int subtractionResult;
	int multiplicationResult;
	double divisionResult;

	public Calculator(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;

	}

	public int getAdditionResult() {
		return additionResult;
	}

	public void setAdditionResult(int additionResult) {
		this.additionResult = additionResult;
	}

	public int getSubtractionResult() {
		return subtractionResult;
	}

	public void setSubtractionResult(int subtractionResult) {
		this.subtractionResult = subtractionResult;
	}

	public int getMultiplicationResult() {
		return multiplicationResult;
	}

	public void setMultiplicationResult(int multiplicationResult) {
		this.multiplicationResult = multiplicationResult;
	}

	public double getDivisionResult() {
		return divisionResult;
	}

	public void setDivisionResult(double divisionResult) {
		this.divisionResult = divisionResult;
	}

	public int add(int a, int b) {
		additionResult = a + b;
		return additionResult;
	}

	public int subtract(int a, int b) {
		subtractionResult = a - b;
		return subtractionResult;
	}

	public int multiply(int a, int b) {
		multiplicationResult = a * b;
		return multiplicationResult;
	}

	public double divide(int a, int b) {
		if (b != 0) {
			divisionResult = (double) a / b;
		} else {
			divisionResult = Double.NaN;
		}
		return divisionResult;
	}

	@Override
	public String toString() {
		String calculatorResult = "Calculator Results: " + "Addition: " + additionResult + " Subtraction: "
				+ subtractionResult + " Multiplication: " + multiplicationResult + " Division: " + divisionResult;
		System.out.println(calculatorResult);
		return calculatorResult;

	}
}
