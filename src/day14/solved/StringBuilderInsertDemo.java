package day14.solved;

//Insert a string at a specific position in a StringBuilder using the insert() method

public class StringBuilderInsertDemo {

	public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello World");
        builder.insert(5, " Beautiful");
        System.out.println(builder.toString());
    }
}
