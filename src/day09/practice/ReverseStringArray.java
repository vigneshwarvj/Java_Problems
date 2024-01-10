package day09.practice;

import java.util.Arrays;

//Write a Java program that takes an array of strings as input and reverses the order of elements in the array. Print the reversed array.

public class ReverseStringArray {

	public static void main(String[] args) {

		String[] arr = { "everyone!", "to", "morning", "Good" };

		String[] reverseArr = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			reverseArr[i] = arr[arr.length - 1 - i];
		}

		System.out.println(Arrays.toString(reverseArr));

	}
}
