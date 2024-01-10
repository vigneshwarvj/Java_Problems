package day14.practice;

//Import the Calculator package from day04 and use it to add two integers.

import day04.practice.Calculator;

public class CalculatorImport {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int addResult = calc.add(7, 7);
		System.out.println("AddResult : " + addResult);
	}

}
