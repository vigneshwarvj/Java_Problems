package day09.practice;

//Write a Java program to find the average of elements in an array.

public class AverageOfArray {

	public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of all numbers in an array: " + sum);
        
        double average = (double) sum / array.length;

        
        System.out.println("Average of array elements: " + average);
    }
}

