package day14.solved;

//Reverse a string using reverse() method in StringBuilder

public class StringBuilderReverseDemo {

	public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.reverse();
        System.out.println(builder.toString());
    }
}
