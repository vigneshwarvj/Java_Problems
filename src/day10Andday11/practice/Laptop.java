package day10Andday11.practice;

public class Laptop {

	public void start() {
		try {
			System.out.print("Starting up ");
            //throw new Exception(); If we tuse this code, the output will be "Starting up problem"
		} catch (Exception e) {
			System.out.print("problem ");
			System.exit(0);
		} finally {
			System.out.print("shutting down.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Laptop().start();
	}
}

