package day05.solved;

public class App {
	public static void main(String[] args) { 
		
		User user1 = new User("vv@gmail.com", "qwerty");
				user1.toString();
				
				user1.name = "Hello";
				//user1.email = "hello@gmail.com";
				//user1.password = "asdfgh";
				user1.phoneNo = 1234567890l;
				
				System.out.println(user1.toString());
				
				
//Animal Java
						AnimalSolved dog = new AnimalSolved("Dog", 4);
						dog.toString();
						
						AnimalSolved penguin = new AnimalSolved("penguin", 2);
						penguin.toString();
			
	}
}
