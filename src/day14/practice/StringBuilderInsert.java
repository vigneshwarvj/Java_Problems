package day14.practice;

//Insert a string at a specific position in a StringBuilder using the insert() method.

public class StringBuilderInsert {

	public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("Hello Vicky");
        sentence.insert(11, ", Welcome to the Global Fun City!");
        System.out.println(sentence.toString());
    }
}
