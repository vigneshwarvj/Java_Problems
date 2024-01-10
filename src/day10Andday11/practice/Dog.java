package day10Andday11.practice;

public class Dog {

	public String name;
	public void praseName() {
		System.out.print("1");
		try {
			System.out.print("2");
			int x = Integer.parseInt(name);
			System.out.print("3");
		} catch (NumberFormatException e) {
			System.out.print("4");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog leroy = new Dog();
		leroy.name = "leroy";
		leroy.praseName();
		System.out.print("5");
	}
}
