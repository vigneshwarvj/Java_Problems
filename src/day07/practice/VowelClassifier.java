package day07.practice;

//Write a Java program that reads a character. If the character is a vowel, print "The character is a vowel." 
//If the character is a consonant, print "The character is a consonant." Make sure to handle both upper and lower case letters.

public class VowelClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alphabet = "A";
		String vowelLetter = alphabet.toLowerCase();
		
		if(vowelLetter.equals("a") || vowelLetter.equals("e") || vowelLetter.equals("i") || vowelLetter.equals("o") || vowelLetter.equals("u") )  {
			System.out.println("The character is a vowel.");
		} else {
            System.out.println("The character is a consonant.");
		}
	}

}
