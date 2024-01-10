package day09.practice;

//Write a Java program that takes an array of integers as input and finds the maximum and minimum values in the array. 
//Print both the maximum and minimum values.

public class ArrayMinMaxValue {

	public static void main(String[] args) {
        int[] array = {5, 10, 32, 18, 2};

        int max = array[0]; 
        int min = array[0]; 

        for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
                max = array[i];
        }

        if (array[i] < min) {
                min = array[i];
        }
    }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
