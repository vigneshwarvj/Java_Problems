package day14.practice;

//Write a program that takes a sentence as input from the user and reverses the order of the words in the sentence. The program should use **`StringBuilder`** to perform the reversal.

//Example:
//Input: "Hello, how are you?"
//Output: "you? are how Hello,"

public class StringBuilderReverse {

	public static void main(String[] args) {
		String sentence = "Hello, how are you ?";

		String[] words = sentence.split(" ");

		StringBuilder reversed = new StringBuilder(5);

		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i] + " ");
		}
		System.out.println("Reversed sentence of my sentence: " + reversed.toString());
    }
}
