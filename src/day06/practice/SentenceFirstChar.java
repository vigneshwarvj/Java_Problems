package day06.practice;

public class SentenceFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Hello, World!";
        int length = sentence.length();
        char firstCharacter = sentence.charAt(0);

        System.out.println("Sentence: " + sentence);
        System.out.println("Length: " + length);
        System.out.println("First Character: " + firstCharacter);
	}

}
